import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

public class Blockchain {
    private List<Block> chain;
    private int difficulty;

    public Blockchain(int difficulty) {
        this.chain = new ArrayList<>();
        this.difficulty = difficulty;
        this.chain.add(createGenesisBlock());
    }

    private Block createGenesisBlock() {
        return new Block(0, "Genesis Block", "0");
    }

    public Block getLatestBlock() {
        return this.chain.get(this.chain.size() - 1);
    }

    public void addBlock(Block newBlock) {
        newBlock.setPreviousHash(getLatestBlock().getHash());
        newBlock.mineBlock(difficulty);
        this.chain.add(newBlock);
    }

    public boolean isChainValid() {
        for (int i = 1; i < this.chain.size(); i++) {
            Block currentBlock = this.chain.get(i);
            Block previousBlock = this.chain.get(i - 1);

            if (!currentBlock.getHash().equals(currentBlock.calculateHash())) {
                return false;
            }

            if (!currentBlock.getPreviousHash().equals(previousBlock.getHash())) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Blockchain blockchain = new Blockchain(4);

        Block block1 = new Block(1, "Data 1");
        blockchain.addBlock(block1);

        Block block2 = new Block(2, "Data 2");
        blockchain.addBlock(block2);

        System.out.println("Blockchain is valid: " + blockchain.isChainValid());

        // Tampering with the second block
        block2.setData("Modified Data");

        System.out.println("Blockchain is valid: " + blockchain.isChainValid());
    }
}

class Block {
    private int index;
    private String data;
    private long timestamp;
    private String previousHash;
    private String hash;
    private int nonce;

    public Block(int index, String data) {
        this.index = index;
        this.data = data;
        this.timestamp = System.currentTimeMillis();
        this.hash = calculateHash();
    }

    public String calculateHash() {
        try {
            MessageDigest digest = MessageDigest.getInstance("SHA-256");
            String input = index + data + timestamp + previousHash + nonce;
            byte[] hash = digest.digest(input.getBytes());

            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                String hex = Integer.toHexString(0xff & b);
                if (hex.length() == 1) {
                    hexString.append('0');
                }
                hexString.append(hex);
            }

            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

    public void mineBlock(int difficulty) {
        String target = new String(new char[difficulty]).replace('\0', '0');
        while (!hash.substring(0, difficulty).equals(target)) {
            nonce++;
            hash = calculateHash();
        }

        System.out.println("Block mined: " + hash);
    }

    // Getters and Setters

    public String getHash() {
        return hash;
    }

    public void setPreviousHash(String previousHash) {
        this.previousHash = previousHash;
    }

    public String getPreviousHash() {
        return previousHash;
    }

    public void setData(String data) {
        this.data = data;
        this.hash = calculateHash();
    }
}
