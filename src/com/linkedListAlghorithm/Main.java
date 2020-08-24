package com.linkedListAlghorithm;

public class Main {
    public static void main(String[] args) {

        LinkList linkList = new LinkList(null);

        String[] array = new String[] {"1", "2", "5", "2", "8", "10"};
        for(String item : array) {
            LinkList linkList2 = new LinkList(item);
            linkList.addNextItem(new LinkList(linkList2));
            linkList.setRoot(linkList2);
        }

        linkList.printItems();


    }
}
