package com.company;

import java.util.Scanner;

public class NumbersCheck {
    public static void main(String[] args) {
        int number =0;
        int divider = 0;
        Scanner in=new Scanner(System.in);
        System.out.println("wright Number");
        number=in.nextInt();
        positiveInteger(number);
       // primeNumber(divider[5]);
        System.out.println("divider in");


    }

    private static void positiveInteger(double number,int divider ) {
        if (number>0){
            System.out.println("number is positive "+ number);
        }else if (number<0){
            System.out.println("number is negative "+ number);
        }
        divider=new int[5];
        for (int i =2; i<divider.length; i++){
            for (int j =2; j< i; j++){
                if (i%j==0){
                    System.out.println(divider);
                }
                return;
            }
    }
    private static void primeNumber(int divider[], double number){
//         divider=new int[5];
//        for (int i =2; i<divider.length; i++){
//            for (int j =2; j< i; j++){
//                if (i%j==0){
//                    System.out.println(divider);
//                }
//                return;
//            }
        }
    }

}








//while (divider<=number){
//        if (number%divider==0)
//        divider++;
//        }if (number==2){
//        System.out.println(divider+ " Prime Number");
//        }else {
//        System.out.println(divider + " Not Prime Number");
//        }