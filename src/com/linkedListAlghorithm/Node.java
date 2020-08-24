package com.linkedListAlghorithm;

public class Node extends ListItem {

    public Node(Object currentItem) {
        super(currentItem);
    }

    @Override
    public ListItem moveNext() {
        return this.rightItem;
    }

    @Override
    public void setNext(ListItem item) {
        this.rightItem = item;
    }

    @Override
    public int compareTo(Object item) {
        String itemToCompareToString = item.toString();
        String itemToString = this.currentItem.toString();
        return itemToString.compareToIgnoreCase(itemToCompareToString);
    }


}
