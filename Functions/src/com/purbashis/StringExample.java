package com.purbashis;

import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {

       String message = greet();
       System.out.println(message);

        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name :");
        String name = in.nextLine();
        String personalise =myGreat(name );
        System.out.println(personalise);


    }

     static String myGreat(String name  )
     {

        String message = "hello"+ name;
         return message;
     }


   static  String greet(){
       String name = "how are you ";
       return  name ;
   }

}
