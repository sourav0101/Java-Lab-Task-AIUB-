public class Account {
 
    private  int accountNumber;
    private  String accountHolderName;
    private  double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
  
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
 
    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public double getBalance() {
        return balance;
    }

    public void showDetails(){
        
        System.out.println("Account Name:"+ getAccountNumber());
        System.out.println("Account HolderName:"+ getAccountHolderName());
        System.out.println("Balance:"+getBalance());
    }
    
        
}
