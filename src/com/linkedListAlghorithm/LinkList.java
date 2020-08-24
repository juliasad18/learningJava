package com.linkedListAlghorithm;

public class LinkList extends Node  {
    private ListItem root;

    public LinkList(Object currentItem) {
        super(currentItem);
        this.root = null;
    }

    public void setRoot(ListItem root) {
        this.root = root;
    }

    public void addNextItem(ListItem newItem) {
        if(this.root == null) {
            this.root = newItem;
            super.currentItem = newItem;
        } else {
            Node node = new Node(newItem);
            super.rightItem = newItem;
            super.currentItem = newItem;
        }
    }

    public void printItems() {
        if(root == null) {
            System.out.println("This list is empty");
        } else {
            while(root !=null) {
                System.out.println(root.getCurrentItem());
                root = root.moveNext();
            }
        }
    }










}
