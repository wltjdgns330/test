package com.example.sunghoon.hitaxi_new;

/**
 * Created by sunghoon on 2016-07-29.
 */
public class ListViewItem {

    private int icon;
    private String name;

    public int getIcon(){return icon;}
    public String getName(){return name;}

    public ListViewItem(int icon, String name)
    {
        this.icon = icon;
        this.name = name;
    }

    public ListViewItem(String name)
    {
        this.name=name;
    }

}
