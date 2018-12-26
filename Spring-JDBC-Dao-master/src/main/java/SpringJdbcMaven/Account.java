package SpringJdbcMaven;

public class Account {

    private String accountName;
    private int accountNumber;
    public Account(int accountNumber, String accountName) {

        this.accountNumber = accountNumber;
        this.accountName = accountName;

    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getAccountNumber() {

        return accountNumber;

    }

    public void setAccountNumber(int accountNumber) {

        this.accountNumber = accountNumber;

    }

    @Override
    public String toString() {

        return "{accountNumber="+accountNumber+

                ",accountName="+accountName+"}";

    }



}