package com.class23.hometask;
public class Degree {

    void getPrerequisite (){
        System.out.println("To get a degree you need high school diploma");
    }
}
class Bachelors extends Degree{

}
 class Masters extends Degree{

     void getPrerequisite (){
         System.out.println("To get a Masters degree you need Bachelors degree");
     }

     public static void main(String[] args) {
         Masters masters=new Masters();
         masters.getPrerequisite();

         Bachelors bachelors=new Bachelors();
         bachelors.getPrerequisite();

         Degree degree=new Degree();
         degree.getPrerequisite();
     }
 }