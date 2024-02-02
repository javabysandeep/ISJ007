package oops.variables;

import java.time.LocalDateTime;

public class Expense {
    int expenseId; // PIV
    String expenseTitle; //RIV
    int amount; //PIV
    String description; //RIV
    LocalDateTime localDateTime; //RIV
    static String expense_done_by = "USER"; //SRV
    static int expense_count = 0; //SPV

    public static void main(String[] args) {
        //args : RLV
        int a = 100; // PLV
        Expense exp = new Expense();//RLV
    }
}
