package academy.learnprogramming;

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

        temp = new StockItem("cup", .50, 200);
        stockList.addStock(temp);
        temp = new StockItem("cup", 0.45, 7);
        stockList.addStock(temp);

        temp = new StockItem("door", 72.95, 4);
        stockList.addStock(temp);

        temp = new StockItem("juice", 2.5, 36);
        stockList.addStock(temp);

        temp = new StockItem("phone", 96.99, 35);
        stockList.addStock(temp);

        temp = new StockItem("towel", 8.76, 40);
        stockList.addStock(temp);

        temp = new StockItem("vase", 1.10, 7);
        stockList.addStock(temp);

        System.out.println(stockList);

        for (String s: stockList.Items().keySet()) {
            System.out.println(s);
        }

        Basket gregsBasket = new Basket("Greg");
        sellItem(gregsBasket, "car", 1);
        System.out.println(gregsBasket);

        sellItem(gregsBasket, "car", 1);
        System.out.println(gregsBasket);

        if (sellItem(gregsBasket, "car", 1) != 1) {
            System.out.println("There are no more cars in stock");
        }

        sellItem(gregsBasket, "spanner", 5);
        System.out.println(gregsBasket);

        sellItem(gregsBasket, "juice", 1);
        sellItem(gregsBasket, "cup", 12);
        sellItem(gregsBasket, "bread",1);
        System.out.println(gregsBasket);

        System.out.println(stockList);

//        temp = new StockItem("pen", 1.12);
//        stockList.Items().put(temp.getName(), temp);
        stockList.Items().get("car").adjustStock(2000);
        stockList.get("car").adjustStock(-1000);
        System.out.println(stockList);
        for(Map.Entry<String, Double> price: stockList.PriceList().entrySet()) {
            System.out.println(price.getKey() + " cost " + price.getValue());
        }
    }

    public static int sellItem(Basket basket, String item, int quantity) {
        // retrieve the item from stock list
        StockItem stockItem = stockList.get(item);
        if (stockItem == null) {
            System.out.println("We don't sell " + item);
            return 0;
        }
        if (stockList.sellStock(item, quantity) !=0) {
            basket.addToBasket(stockItem, quantity);
            return quantity;
        }
        return 0;
    }
}
