public class Main {
    public static void main(String[] args) {
        Account Adi = new Account();
        Adi.setNumber("123456789");
        Adi.setBalance(999999);
        Adi.setCustomerName("Aditya Khandare");
        Adi.setCustomerEmail("khanraeaditya80@gmail.com");
        Adi.setCustomerPhoneNo("9619518688");

        Adi.deposite(1);
        Adi.getBalance();
        Adi.withdrawal(5000);
        Adi.getCustomerEmail();
        System.out.println(Adi.getCustomerName());


    }
}