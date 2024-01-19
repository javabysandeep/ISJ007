package controlStatements.transferJumpStatements;

public class Demo7 {
    public static void main(String[] args) {
        String[] array = {"abc@gmail.com", "xyz", "pqr"};
        for (String str : array) {
            if (!str.contains("@")) {
                continue;
            }
            System.out.println("mail sent to " + str);
        }
    }
}
