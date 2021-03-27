package myproject01;


import java.util.Scanner;

public class Newsletter {

    String adsNameID;
    String adsName;
    double width;
    double length;
    int numberOfDays;
    double areaFee;
    double adsFee;


    Newsletter(String adsNameID, String adsName, double width, double length) {

        this.adsName = adsName;
        this.adsNameID=adsNameID;
        this.width = width;
        this.length = length;


    }


    public void advertisingFee(){
        numberOfDays=adsName.length();
        areaFee=width*length;
        adsFee=areaFee+numberOfDays*0.5;

    }
    public void printInfo(){

        System.out.println("Ads name is "+adsName);
        System.out.println("Number of days is "+numberOfDays);
        System.out.println("Area fee is "+areaFee);
        System.out.println("Advertising fee is "+adsFee);
    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Type the customer ID and the ads name:");
        String adsNameID=scan.nextLine();
        System.out.println("Type the width size:");
        double width=scan.nextDouble();
        System.out.println("Type the length size:");
        double length=scan.nextDouble();
        String adsName=adsNameID.replaceAll("[0-9]", "").trim();


        Newsletter nl=new Newsletter(adsNameID, adsName, width, length);

        nl.advertisingFee();
        nl.printInfo();


    }
}
