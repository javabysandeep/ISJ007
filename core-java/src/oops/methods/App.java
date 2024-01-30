package oops.methods;

import java.util.List;

public class App {
    public static void main(String[] args) {
        //step 1 : read file
        List<Contact> contactList = readFile("fileName");

        //step 2: find valid contacts
        List<Contact> validContacts = validateContacts(contactList);

        //step 3: send whatsApp
        sendWhatsApp(validContacts);


        sendWhatsApp(validateContacts(readFile("str")));


    }

    private static List<Contact> readFile(String fileName) {
        return null;
    }

    private static List<Contact> validateContacts(List<Contact> contactList) {
        return null;
    }

    private static void sendWhatsApp(List<Contact> validContacts) {
        System.out.println("sending whatsApp");
    }
}

class Contact {
}
