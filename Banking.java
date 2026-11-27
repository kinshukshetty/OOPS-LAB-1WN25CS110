import transaction.Account;
import reports.TransactionReport;

public class Banking {
    public static void main(String[] args) {
       
        Account myAccount = new Account("ACC-98765", 1500.00);

        System.out.println("=== Performing Bank Transactions ===");
        myAccount.deposit(500.00);
        myAccount.withdraw(300.00);

        System.out.println("\n");
        TransactionReport.generateReport(myAccount);
    }
}