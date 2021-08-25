package com.company;


import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        int costomerMoney ;
        System.out.println(" usd or eur  ");
        Scanner in = new Scanner(System.in);
        String  value= in.next();
        System.out.println("wright Amount");
        costomerMoney = in.nextInt();
        costomerValue(costomerMoney, value);

    }
    private static void costomerValue(int costomerMoney,String value){
        switch (value){
            case "usd":{
                System.out.println(usd(costomerMoney));
                break;
            }
            case "eur":{
                System.out.println(eur(costomerMoney));
                break;
            }
        }
    }
    static double usd( double a){
        return a*1.9;
    }
    static double eur( double a){
        return a/0.8;
    }
}
