package com.itemsbasket;

/**
 * Created by dev on 16/02/2016.
 */
public class StockItem implements Comparable<StockItem> {
    private final String name;
    private double price;
    private int quantityStock;
    private int reservedItemsQuantity;

    public StockItem(String name, double price) {
        this.name = name;
        this.price = price;
        this.quantityStock = 0;
        this.reservedItemsQuantity = 0;
    }

    public StockItem(String name, double price, int quantityStock) {
        this.name = name;
        this.price = price;
        this.quantityStock = quantityStock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int quantityInStock() {
        return quantityStock;
    }

    public int reservedItemsQuantity() {
        return reservedItemsQuantity;
    }

    public void setPrice(double price) {
        if(price > 0.0) {
            this.price = price;
        }
    }

    public boolean reserveItem(int quantity) {
        if(quantity <= this.quantityStock) {
            this.reservedItemsQuantity = this.reservedItemsQuantity + quantity;
            this.quantityStock = this.quantityStock - this.reservedItemsQuantity;
            return true;
        } else {
            return false;
        }
    }

    public boolean returnReservedItem(int quantity) {
        if(quantity <= this.reservedItemsQuantity) {
            this.reservedItemsQuantity = this.reservedItemsQuantity - quantity;
            this.quantityStock = this.quantityStock + quantity;
            return true;
        } else {
            return false;
        }
    }

    public void adjustStock(int quantity) {
        int newQuantity = this.quantityStock + quantity;
        if(newQuantity >= 0) {
            this.quantityStock = newQuantity;
        }
    }

    @Override
    public boolean equals(Object obj) {
        //System.out.println("Entering StockItem.equals");
        if(obj == this) {
            return true;
        }

        if((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }

        String objName = ((StockItem) obj).getName();
        return this.name.equals(objName);
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() + 31;
    }

    @Override
    public int compareTo(StockItem o) {
        //System.out.println("Entering StockItem.compareTo");
        if(this == o) {
            return 0;
        }

        if(o != null) {
            return this.name.compareTo(o.getName());
        }

        throw new NullPointerException();
    }

    @Override
    public String toString() {
        return this.name + " : price " + this.price;
    }
}