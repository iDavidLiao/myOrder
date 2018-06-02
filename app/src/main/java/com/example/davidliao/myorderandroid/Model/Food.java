package com.example.davidliao.myorderandroid.Model;

public class Food {

    private String Name, Description, Price, MenuId;

    public Food () {

    }

    public Food (String name, String description, String price, String menuId) {

        Name = name;
        Description = description;
        Price = price;
        MenuId = menuId;

    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getMenuId() {
        return MenuId;
    }

    public void setMenuId(String menuId) {
        MenuId = menuId;
    }
}
