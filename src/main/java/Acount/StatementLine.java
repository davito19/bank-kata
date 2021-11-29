package Acount;
import java.io.PrintStream;

public class StatementLine {
    private Transaction transaction;
    private Amount currentBalance;

    public StatementLine(Transaction transaction, Amount currentBalance) {
        this.transaction = transaction;
        this.currentBalance = currentBalance;
    }

    public void prinTo(PrintStream printer) {
        this.transaction.prinTo(printer, currentBalance);
    }
}
