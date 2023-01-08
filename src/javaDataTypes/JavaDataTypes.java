package javaDataTypes;

import java.util.Scanner;

public class JavaDataTypes {

    //Girilen sayıların hangi tiplerde olabileceğini tahmin etme
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Bir Sayı Girin");


                int t=sc.nextInt();
                System.out.println(t+" can be fitted in:");

                    if(t>=-128 && t<=127){
                        System.out.println("* byte");
                    }
                    if(t>=Math.pow(-2,15) && t<=Math.pow(2,15)-1){
                        System.out.println("* short");
                    }
                    if(t>=Math.pow(-2,31) && t<=Math.pow(2,31)-1){
                        System.out.println("* int");
                    }
                    if(t>=Math.pow(-2,63) && t<=Math.pow(2,63)-1){
                        System.out.println("* long");
                    } else {
                        System.out.println(t+" can't be fitted anywhere.");
                    }

                    //YADA Best practice

//        if(t>=-Byte.MIN_VALUE && t<=Byte.MAX_VALUE){
//            System.out.println("* byte");
//        }
//        if(t>=Short.MIN_VALUE && t<=Short.MAX_VALUE){
//            System.out.println("* short");
//        }
//        if(t>=Integer.MIN_VALUE && t<=Integer.MAX_VALUE){
//            System.out.println("* int");
//        }
//        if(t>=Long.MIN_VALUE && t<=Long.MAX_VALUE){
//            System.out.println("* long");
//        } else {
//            System.out.println(t+" can't be fitted anywhere.");
//        }

    }
}
