package controlStatements.conditionalStatements;

import java.util.Scanner;

public class Demo7 {
    public static void main(String[] args) {
        System.out.println("Enter the file type");
        Scanner scanner = new Scanner(System.in);
        String fileType = scanner.next();
        if (fileType.equals("pdf")) {
            System.out.println("PDF file reading logic");
        }
        if (fileType.equals("excel")) {
            System.out.println("Excel file reading logic");
        }
        if (fileType.equals("json")) {
            System.out.println("json file reading logic");
        }
        if (fileType.equals("xml")) {
            System.out.println("xml file reading logic");
        }
        if (fileType.equals("txt")) {
            System.out.println("txt file reading logic");
        }
        if (fileType.equals("data")) {
            System.out.println("data file reading logic");
        }
        if (fileType.equals("properties")) {
            System.out.println("properties file reading logic");
        }
        if (fileType.equals("jpeg")) {
            System.out.println("jpeg file reading logic");
        }
    }
}
