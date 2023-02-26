package com.example.traveldocumentary;

public class TabsInfo {
    static String cityPlace ;
    static String dateVisited;
    static int imageID;

    public TabsInfo(String cityPlace, String dateVisited , int imageID){
        this.cityPlace=cityPlace;
        this.dateVisited=dateVisited;
        this.imageID=imageID;

    }

    public static String getCityPlace() {
        return cityPlace;
    }

    public static void setCityPlace(String cityPlace) {
        TabsInfo.cityPlace = cityPlace;
    }

    public static String getDateVisited() {
        return dateVisited;
    }

    public static void setDateVisited(String dateVisited) {
        TabsInfo.dateVisited = dateVisited;
    }

    public static int getImageID() {
        return imageID;
    }

    public static void setImageID(int imageID) {
        TabsInfo.imageID = imageID;
    }


}
