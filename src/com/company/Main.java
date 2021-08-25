package com.company;

import java.util.Scanner;

public  class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int [] divider=new int[20];
        for (int i =2; i<divider.length; i++){
            divider[i] =sc.nextInt();
            for (int j =2; j< i; j++){
                if (i%j==0){
                //    divider[j] =sc.nextInt();
                    System.out.println(j);
                }
                return;
    }



    }

    }
    }

