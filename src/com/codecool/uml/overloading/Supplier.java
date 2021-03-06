package com.codecool.uml.overloading;

import java.util.ArrayList;
import java.util.Currency;
import java.util.List;

public class Supplier {

    private int id;
    private String name;
    private String description;
    static List<Integer> idList = new ArrayList<>(0);
    static List<Supplier> suppliers = new ArrayList<>(0);


    public Supplier() {

        this.id = idList.size() + 1;
        idList.add(id);
        suppliers.add(this);
    }

    public Supplier(String name, String description) {
        this.id = idList.size() + 1;
        idList.add(id);
        suppliers.add(this);
        this.name = name;
        this.description = description;
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List <Product> getProducts(){
        return Product.getAllProductsBy(this);
    }
    public String toString() {
            String returnString;
            returnString = "id: " + String.valueOf(id)+" ,name: "+name;
            return returnString;
    }
}
