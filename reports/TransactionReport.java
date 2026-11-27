package reports;

import transaction.Account;

public class TransactionReport {
    public static void generateReport(Account account) {
        System.out.println("----------------------------------------");
        System.out.println("          TRANSACTION REPORT            ");
        System.out.println("----------------------------------------");
        System.out.println("Account Number : " + account.getAccountNumber());
        System.out.println("Current Balance: $" + account.getBalance());
        System.out.println("----------------------------------------");
    }
}