package com.example.traveldocumentary;

public class TabsInfo {
    private String cityPlace ;
    private String dateVisited;
    private int imageID = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED =-1;

    public TabsInfo(String cityPlace, String dateVisited , int imageID ){
        this.cityPlace =cityPlace;
        this.dateVisited =dateVisited;
        this.imageID =imageID;
    }
    public TabsInfo(String cityPlace, String dateVisited ){
        this.cityPlace =cityPlace;
        this.dateVisited =dateVisited;
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
    public boolean hasImage(){
        return imageID!=NO_IMAGE_PROVIDED;
    }



}
