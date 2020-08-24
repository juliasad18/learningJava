package com.linkedListAlghorithm;

public abstract class ListItem {
    protected Object currentItem;
    protected ListItem rightItem;

    public ListItem(Object currentItem) {
        this.currentItem = currentItem;
        this.rightItem = null;
    }

    public Object getCurrentItem() {
        return currentItem;
    }

    public void setCurrentItem(ListItem currentItem) {
        this.currentItem = currentItem;
    }

    public ListItem getRightItem() {
        return rightItem;
    }

    public void setRightItem(ListItem rightItem) {
        this.rightItem = rightItem;
    }

    public abstract ListItem moveNext();
    public abstract void setNext(ListItem item);
    public abstract int compareTo(Object item);

}
