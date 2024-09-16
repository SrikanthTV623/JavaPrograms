package in.contact;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ContactManager {
    public static void main(String[] args) {

        int choice;
        Scanner sc = new Scanner(System.in);
        //choice = sc.nextInt();
        Map<String,String> contacts = new HashMap<>();

        contacts.put("Srikanth","7989700325");
        contacts.put("Prashanth","8466951166");
        contacts.put("Venkatesh","9440741941");
        contacts.put("Suvarna","9030902685");

        for (Map.Entry<String, String> e : contacts.entrySet()){
            System.out.println(e.getKey() + " " + e.getValue());
        }

        contacts.replace("Prashanth","8466951177");
        System.out.println("Updated contact list");
        System.out.println(contacts);

        String removedValue = contacts.remove("Prashanth");

        System.out.println("Removed value is: " + removedValue);

        System.out.println(contacts);



        /*System.out.println("Enter the choice");
        choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("Enter name and contact number:");
                String key = sc.nextLine();
                String value = sc.nextLine();
                contacts.put(key, value);

                for (Map.Entry<String, String> e : contacts.entrySet()){
                    System.out.println(e.getKey() + " " + e.getValue());
                }
                break;

            case 2:
                System.out.println("Enter the key to be updated & updated value for respective key");
                String keyToUpdate = sc.nextLine();
                System.out.println("updated value for respective key");
                String updatedValue = sc.nextLine();
                //contacts.put(keyToUpdate, updatedValue);
                contacts.replace(keyToUpdate,updatedValue);
                System.out.println(contacts);
                break;

            case 3:
                System.out.println("Enter the name of person to be deleted from contact list:");
                String keyToRemove = sc.nextLine();
                String removedValue = contacts.remove(keyToRemove);

                /*if (removedValue != null) {
                    System.out.println("Removed value is: " + removedValue);
                } else {
                    System.out.println("Key not found in the map.");
                }*/

                //System.out.println("New contact list is:"+contacts);




        //}*/



    }
}
