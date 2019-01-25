package com;
public class OompaLoompa extends Being {
    //    Kid (code, birthday, name, list of purchased productList, place of birth)
    //    OompaLoompa (code, name, height, favorite food (can be a String))
    String code;
    String name;
    int height;
    String favFood;


    public OompaLoompa(String code, String name, int height, String favFood) {
        this.name = name;
        this.height = height;
        this.favFood = favFood;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public String getFavFood() {
        return favFood;
    }
}
