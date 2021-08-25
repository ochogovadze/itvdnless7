package com.company;

import java.util.Scanner;

public  class Arithmetics {

    public static void main(String[] args) {
        int number1=0,number2=0;
        System.out.println("add number");
        Scanner sc = new Scanner(System.in);
        number1 = sc.nextInt();
        System.out.println("sign + or - or * or /");
        String sing = sc.next();
        System.out.println("add number 2");
        number2 = sc.nextInt();
        printResult(number1,number2,sing);
    }
    private static void printResult(int number1, int number2, String sing){
        switch (sing){
            case "+":{
                System.out.println(sum(number1,number2));
                break;
            }
            case "-":{
                System.out.println(sub(number1,number2));
                break;
            }
            case "*":{
                System.out.println(mul(number1,number2));
                break;
            }
            case "/":{
                System.out.println(div(number1,number2));
                break;
            }
        }
    }

        static int sum( int a, int b){
            return a+b;
        }
        static int sub( int a, int b){
            return a-b;
        }
        static int mul( int a, int b){
            return a*b;
        }
        static int div( int a, int b){
            return a/b;

}



}
