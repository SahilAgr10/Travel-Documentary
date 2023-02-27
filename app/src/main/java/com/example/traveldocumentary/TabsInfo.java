package com.example.traveldocumentary;

public class TabsInfo {
    private String cityPlace ;
    private String dateVisited;
    private int imageID;

    public TabsInfo(String cityPlace, String dateVisited , int imageID ){
        this.cityPlace =cityPlace;
        this.dateVisited =dateVisited;
        this.imageID =imageID;
    }

    public String getCityPlace() {
        return cityPlace;
    }
    public  String getDateVisited() {
        return dateVisited;
    }
    public int getImageID() {
        return imageID;
    }



}
