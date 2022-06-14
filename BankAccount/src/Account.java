public class Account {
    private String Number;
    private double Balance;
    private String CustomerName;
    private String CustomerEmail;
    private String CustomerPhoneNo;

    public void deposite(double depositAmount){
        this.Balance +=depositAmount;
        System.out.println("Deposite of "+depositAmount+" total new amount "+this.Balance);
    }

    public void withdrawal(double withdrawalAmount){
        if (this.Balance - withdrawalAmount <0){
            System.out.println("Only "+this.Balance+" Available. Withdrawal not possible");
        }
        else {
            Balance -= withdrawalAmount;
            System.out.println("Withdrawal of "+withdrawalAmount+" balance is "+Balance);
        }
    }

    public String getNumber(){
        return Number;
    }

    public void setNumber(String number) {
        this.Number = number;
    }

    public double getBalance(){
        return Balance;
    }

    public void setBalance(double balance) {
        this.Balance = balance;
    }

    public String getCustomerName(){
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        this.CustomerName = customerName;
    }

    public String getCustomerEmail(){
        return CustomerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.CustomerEmail = customerEmail;
    }

    public String getCustomerPhoneNo(){
        return CustomerPhoneNo;
    }

    public void setCustomerPhoneNo(String customerPhoneNo) {
        this.CustomerPhoneNo = customerPhoneNo;
    }
}
