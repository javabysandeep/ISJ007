package oops.nestedClasses;

public class ConstantsTest {
    public static void main(String[] args) {
        System.out.println("MYSQL Dev DB username "+Constants.Mysql.Dev.username);
        System.out.println("MYSQL Dev DB password "+Constants.Mysql.Dev.password);
        System.out.println("MYSQL Prod DB username "+Constants.Mysql.Prod.username);
        System.out.println("MYSQL Prod DB password "+Constants.Mysql.Prod.password);
    }
}
