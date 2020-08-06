package com.listOfContacts;

import java.util.ArrayList;
import java.util.Scanner;

public class MobilePhone {
    private ArrayList<Contact> listOfContacts;

    public void setListOfContacts(ArrayList<Contact> listOfContacts) {
        this.listOfContacts = listOfContacts;
    }

    public ArrayList<Contact> getListOfContacts() {
        return listOfContacts;
    }

    public void printListOfContacts() {
        for(int i = 0; i < listOfContacts.size(); i++) {
            System.out.println("_______________");
            System.out.println(i + ":");
            System.out.println("Contact name: " + listOfContacts.get(i).getName());
            System.out.println("Contact number: " + listOfContacts.get(i).getNumber());
        }

    }

    public int findContactIndexByName(String name) {
        int index = -1;
        for(int i = 0; i < listOfContacts.size(); i++) {
            if(name.equals(listOfContacts.get(i).getName())) {
                index = i;
            }
        }
        return index;
    }

    public int findContactIndexByNumber(String number) {
        int index = -1;
        for(int i = 0; i < listOfContacts.size(); i++) {
            if(number.equals(listOfContacts.get(i).getNumber())) {
                index = i;
            }
        }
        return index;
    }

    public void findContact(String name) {
        int index = findContactIndexByName(name);
        if(index == -1) {
            System.out.println("Contact doesn't exist.");
        } else {
            System.out.println("Contact name: " + listOfContacts.get(index).getName());
            System.out.println("Contact number: " + listOfContacts.get(index).getNumber());
        }

    }
}
