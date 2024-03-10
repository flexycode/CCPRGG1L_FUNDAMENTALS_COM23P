MAX_ACCOUNTS = 10  # Maximum number of accounts allowed

# Arrays to store account information
account_names = [None] * MAX_ACCOUNTS
account_numbers = [None] * MAX_ACCOUNTS
balances = [0.0] * MAX_ACCOUNTS
account_count = 1  # Current number of accounts (starting from 1)

def main():
    """
    Main function to display the menu and handle user choices.
    """
    print("Welcome to ALT Crypto Bank!")

    while True:
        print("\n[1.] Create New Account")
        print("[2.] Deposit Money")
        print("[3.] Withdraw Money")
        print("[4.] Check Balance")
        print("[5.] Exit")
        choice = int(input("Enter your choice: "))

        if choice == 1:
            create_new_account()
        elif choice == 2:
            perform_transaction(True)  # True for deposit
        elif choice == 3:
            perform_transaction(False)  # False for withdraw
        elif choice == 4:
            check_balance()
        elif choice == 5:
            print("Thank you for using ALT Crypto Bank!")
            break
        else:
            print("Invalid choice. Please enter a valid option.")

def create_new_account():
    """
    Function to create a new account.
    """
    global account_count
    if account_count >= MAX_ACCOUNTS:
        print("Maximum account limit reached.")
        return

    account_name = input("Enter Account Name: ")
    account_names[account_count] = account_name
    account_numbers[account_count] = account_count - 1  # Assign the current account_count - 1 as the account number
    account_count += 1
    print(f"Account created successfully. Your account number is: {account_count - 1}")

def perform_transaction(is_deposit):
    """
    Function to perform deposit or withdrawal transaction.
    :param is_deposit: True for deposit, False for withdrawal
    """
    account_number = int(input("Enter Account Number: "))
    if account_number < 0 or account_number >= account_count:
        print("Invalid account number.")
        return

    amount = float(input("Enter Amount: "))

    if is_deposit:
        balances[account_number] += amount
        print(f"Amount deposited successfully. Current Balance: {balances[account_number]}")
    else:
        if amount <= balances[account_number]:
            balances[account_number] -= amount
            print(f"Amount withdrawn successfully. Remaining Balance: {balances[account_number]}")
        else:
            print("Insufficient balance or invalid amount.")

def check_balance():
    """
    Function to check the balance of an account.
    """
    account_number = int(input("Enter Account Number: "))
    if account_number < 0 or account_number >= account_count:
        print("Invalid account number.")
        return

    print(f"Account Name: {account_names[account_number]} - Current Balance: {balances[account_number]}")

if __name__ == "__main__":
    main()