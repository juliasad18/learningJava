package com.listOfContacts;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone();

    public static void main(String[] args) {
        MobilePhone mobilePhone = createContacts();

        boolean exit = false;
        while(!exit) {
            System.out.println("_______________");
            System.out.println("Choose an option...");
            printOptions();
            int option = Integer.parseInt(scanner.nextLine());  //to solve the issue when Scanner skips next nextLine()
            switch(option) {
                case 1:
                    mobilePhone.printListOfContacts();
                    break;
                case 2:
                    addNewContact(mobilePhone.getListOfContacts());
                    break;
                case 3:
                    updateExistingContact(mobilePhone.getListOfContacts());
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    System.out.println("Enter a contact name you are searching for...");
                    String name = scanner.nextLine();
                    mobilePhone.findContact(name);
                    break;
                case 6:
                    exit = true;
                    break;
            }
        }

    }

    public static void addNewContact(ArrayList<Contact> contactList) {
        Contact contact = new Contact();
        System.out.println("Adding new contact...");
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter number:");
        String number = scanner.nextLine();
        if (mobilePhone.findContactIndexByName(name) == -1 && mobilePhone.findContactIndexByNumber(number) == -1) {
            contact.setName(name);
            contact.setNumber(number);
            contactList.add(contact);
            System.out.println("Contact successfully saved.");
        } else {
            System.out.println("Contact with this name/number already exists.");
        }
    }

    public static void updateExistingContact(ArrayList<Contact> contactList) {
        System.out.println("Enter name:");
        String name = scanner.nextLine();
        int index = mobilePhone.findContactIndexByName(name);
        if (index == -1) {
            System.out.println("Contact doesn't exist.");
        } else {
            Contact contact = new Contact();
            System.out.println("Updating existing contact...");
            System.out.println("Enter new name:");
            contact.setName(scanner.nextLine());
            System.out.println("Enter new phone number:");
            contact.setNumber(scanner.nextLine());
            contactList.set(index, contact);
            System.out.println("Contact successfully updated.");
        }
    }

    public static void removeContact() {
        System.out.println("Enter a name you want to remove...");
        String name = scanner.nextLine();
        int index = mobilePhone.findContactIndexByName(name);
        if (index == -1) {
            System.out.println("Contact doesn't exist.");
        } else {
            System.out.println("Removing contact...");
            mobilePhone.getListOfContacts().remove(index);
            System.out.println("Contact is successfully removed.");
        }
    }

    public static MobilePhone createContacts() {
        Contact contact1 = new Contact("Julia", "23232578");
        Contact contact2 = new Contact("Maksim", "12233445");
        Contact contact3 = new Contact("Veronika", "89235674");

        ArrayList<Contact> listOfContacts = new ArrayList<>();
        listOfContacts.add(contact1);
        listOfContacts.add(contact2);
        listOfContacts.add(contact3);
        mobilePhone.setListOfContacts(listOfContacts);
        return mobilePhone;
    }

    public static void printOptions() {
        System.out.println("1 - print list of contacts");
        System.out.println("2 - add new contact");
        System.out.println("3 - update existing contact");
        System.out.println("4 - remove contact");
        System.out.println("5 - find a contact");
        System.out.println("6 - quit");
    }
}
