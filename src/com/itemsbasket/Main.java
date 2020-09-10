package com.itemsbasket;

import java.util.HashMap;
import java.util.Map;

public class Main {
    private static StockList stockList = new StockList();

    public static void main(String[] args) {
	    StockItem temp = new StockItem("bread", 0.86, 100);
        stockList.addStock(temp);

        temp = new StockItem("cake", 1.10, 7);
        stockList.addStock(temp);

        temp = new StockItem("car", 12.50, 2);
        stockList.addStock(temp);

        temp = new StockItem("chair", 62.0, 10);
        stockList.addStock(temp);

        temp = new StockItem("cup", 0.50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.50, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 2.40, 80);
        stockList.addStock(temp);

        temp = new StockItem("vase", 8.76, 40);
        stockList.addStock(temp);

        System.out.println(stockList);

        Basket timsBasket = new Basket("Tim");
        putItemIntoBasket(timsBasket, "bread", 105);
        putItemIntoBasket(timsBasket, "door", 3);
        putItemIntoBasket(timsBasket, "spanner", 5);
        putItemIntoBasket(timsBasket, "juice", 4);
        putItemIntoBasket(timsBasket, "cup", 12);
        System.out.println(timsBasket);

        System.out.println(stockList);

        dropItemsFromBasket(timsBasket, "door", 2);
        System.out.println(timsBasket);

        System.out.println(stockList);

        sellALLItemsFromBasket(timsBasket);
        System.out.println(timsBasket);

        System.out.println(stockList);

//        stockList.Items().get("car").adjustStock(2000);
//        System.out.println(stockList);

//        //print each item's price
//        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
//            System.out.println(price.getKey() + " costs " + price.getValue());
//        }


    }

    public static void putItemIntoBasket(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem == null) {
            System.out.println("=====================");
            System.out.println("We don't sell " + item);
        } else {
            if (stockList.reserveStock(item, quantity)) {
                basket.addToBasket(stockItem, quantity);
            } else {
                System.out.println("=====================");
                System.out.println("Desired quantity of the item - " + item + " is greater that available quantity in stock. Available quantity for reservation is: " + stockItem.quantityInStock());
            }
        }

    }

    public static void dropItemsFromBasket(Basket basket, String item, int quantity) {
        StockItem stockItem = stockList.get(item);
        if(stockItem != null) {
            if(quantity <= basket.getList().get(stockItem)) {
                basket.removeItemFromBasket(stockItem, quantity);
                stockItem.returnReservedItem(quantity);
            }
        }
    }

    public static void sellALLItemsFromBasket(Basket basket) {
        if(!basket.items().isEmpty()) {
            //temporary List to loop over it (instead looping over itemsInBasket)
            //to avoid thread exception: Exception in thread "main" java.util.ConcurrentModificationException java
            //check for possible alternative methods
            Map<StockItem, Integer> temporaryList = new HashMap<>();
            Map<StockItem, Integer> itemsInBasket = basket.getList();
            for(Map.Entry<StockItem, Integer> item : itemsInBasket.entrySet()) {
                temporaryList.put(item.getKey(), item.getValue());
                //basket.removeItemFromBasket(item.getKey(), item.getValue());
                stockList.sellStock(item.getKey().getName(), item.getValue());
            }

            for(Map.Entry<StockItem, Integer> item : temporaryList.entrySet()) {
                basket.removeItemFromBasket(item.getKey(), item.getValue());
            }
            System.out.println("=====================");
            System.out.println("Items from the " +basket.getName()+ "'s basket have been sold.");
        }
    }

}
