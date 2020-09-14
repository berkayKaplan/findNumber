package com.berkaykaplan.findnumber;

public class Main {
    public static void main  (String[] args){
       int[] numbers=new int[]{1,2,3,5,7,9,0};
       int  find=11;
       boolean ısThere=false;
       for (int number:numbers){
           if (number==find){
               ısThere=true;
               break;
           }
       }
       if (ısThere){
           System.out.println("Sayı vardır");
       }
       else{
           System.out.println("Sayı yoktur");
       }
    }
}
