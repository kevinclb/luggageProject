package com.company;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        ArrayList storage = new ArrayList();
        menu();
    }



    public static void menu(){
        Scanner in = new Scanner(System.in);
        int userChoice = 0;
        ShippingContainer yourContainer = null;

        while(userChoice != 5){

            System.out.println("\n\nWelcome to your shipping menu.");
            System.out.println("Here are your options:");
            System.out.println("1) Create a new shipping container");
            System.out.println("2) Add luggage to shipping container");
            System.out.println("3) Remove luggage from shipping container");
            System.out.println("4) Show all luggage in the shipping container");
            System.out.println("5) Quit");

            userChoice = in.nextInt();

            if (userChoice == 1) {
                yourContainer = new ShippingContainer();
                System.out.print("You've made a container with default luggage.");

            } else if (userChoice == 2){
                if (yourContainer!=null){
                    int luggageChoice;
                    System.out.println("What kind of luggage would you like to add?");
                    System.out.println("" +
                              "1.) Box " +
                            "\n2.) Cube" +
                            "\n3.) Sphere" +
                            "\n4.) Cylinder" +
                            "\n5.) Cone " +
                            "\n6.) Pyramid" +
                            "\n7.) Hexagon Prism" +
                            "\n8.) Tub");
                    luggageChoice = in.nextInt();
                    yourContainer.luggageInsert(luggageChoice);
                    System.out.println("\n");
                } else {
                    System.out.print("Your container has not been made.");
                }
            } else if (userChoice == 3){
                if (yourContainer!=null){
                    yourContainer.luggageRemove();
                    System.out.println("You've successfully removed that luggage.");
                } else {
                    System.out.print("Your container has not been made.");
                }
            } else if (userChoice == 4){
                if (yourContainer!=null){
                    yourContainer.displayContainer();
                } else {
                    System.out.print("Your container has not been made.");
                }
            } else {
                System.out.println("You've now exited this container program.\nCya!");
            }
        }
    }


}
