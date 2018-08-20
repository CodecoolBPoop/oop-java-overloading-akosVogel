package com.codecool.uml.overloading;


import java.sql.Date;
import java.util.Currency;
import java.util.List;

public class Webshop {

        private static Currency defaultCurrency = Currency.getInstance("EUR");

        private static ProductCategory toys = new ProductCategory(
                "Toys", "Entertainment", "All kinds of toys for kids under 10"
        );
        private static ProductCategory music = new ProductCategory(
                "Music", "Entertainment", "many and more songs"
        );
        private static FeaturedProductCategory watch = new FeaturedProductCategory();

        private static Product calm  = new Product("calm", (float) 43.00,Currency.getInstance("HUF"));
        private static Product loud = new Product("loud", (float) 26.99, Currency.getInstance("USD"));
        private static Product teddyBear = new Product("Teddy Bear", (float) 6.59, defaultCurrency);
        private static Product donaldDuck = new Product("Donald Duck", (float) 9.59, defaultCurrency);
        private static Product expensiveWatch = new Product("expensive watch", (float) 179.99, defaultCurrency);
        private static Supplier aDRecords = new Supplier("A&D Records", "They sell records");
        private static Supplier tikoTime = new Supplier("Gemsbrokers", "They sell watches");
        private static Supplier matel = new Supplier("matel", "toys and toys");

        private static void settingProductCategories() {
            calm.setProductCategory(music);
            calm.setSupplier(aDRecords);
            loud.setProductCategory(music);
            loud.setSupplier(aDRecords);
            teddyBear.setProductCategory(toys);
            teddyBear.setSupplier(matel);
            donaldDuck.setProductCategory(toys);
            donaldDuck.setSupplier(matel);
            watch.setName("Watch");
            watch.setDepartment("Luxury");
            watch.setDescription("all kind of very expensive watches");
            watch.schedule(Date.valueOf("2018-06-25"), Date.valueOf("2018-06-30"));
            expensiveWatch.setProductCategory(watch);
            expensiveWatch.setSupplier(tikoTime);
        }

        private static void settingSuppliers() {

        }

        public static void main(String[] args) {
            // write your code here
            settingProductCategories();
       for (ProductCategory category : ProductCategory.productCategories) {
          System.out.println(category);
       }
       System.out.println(calm + " " + calm.getDefaultCurrency().toString());
       System.out.println(loud + " " + loud.getDefaultCurrency().toString());
            List<Product> productList = Product.getAllProductsBy(toys);
            for (Product oneProduct : productList) {
                System.out.println(oneProduct);
            }
            System.out.println(aDRecords.getProducts());
            System.out.println(matel.getProducts());
            System.out.println(toys.getProducts());
            System.out.println(music.getProducts());
        }
}

