package com.example.Lab08_recycler_view;

public class Item {
    String group;
    String first_name;
    String last_name;
    int image;

    public Item(String group, String first_name, String last_name, int image) {
        this.group = group;
        this.first_name = first_name;
        this.last_name = last_name;
        this.image = image;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

}
