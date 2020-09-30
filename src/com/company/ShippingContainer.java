package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class ShippingContainer {
    ArrayList<luggage> shippingContainer = new ArrayList();

    public ShippingContainer() {

        populateContainer();
        Collections.sort(shippingContainer);
    }

    public void populateContainer() {
        //inserting 8 regular containers
        shippingContainer.add(new Box(3, 2, 4));
        shippingContainer.add(new Sphere(3.5f));
        shippingContainer.add(new Pyramid(2.5f, 4, 3));
        shippingContainer.add(new Cube(5));
        shippingContainer.add(new Cylinder(2, 4));
        shippingContainer.add(new hexagonPrism(5, 1));
        shippingContainer.add(new Tub(2, 2, 6));
        shippingContainer.add(new Cone(3, 2));

        //inserting two new luggage types with custom volumes
        Box suitcase = new Box(7,2,1);
        suitcase.setType("Suitcase");
        Cone bigCone = new Cone(2,8);
        bigCone.setType("Big Cone");

        shippingContainer.add(suitcase);
        shippingContainer.add(bigCone);
    }

    public void displayContainer() {
        Collections.sort(shippingContainer);
        int count = 0;
        float totalVolume = 0;
        for (com.company.luggage luggage : shippingContainer) {
            count +=1;
            System.out.println(count + ".) Luggage Type: " + luggage.type + "    Luggage Volume:  " + luggage.volume);
            totalVolume += luggage.volume;
        }
        System.out.println("\nTotal volume: " + totalVolume );
    }

    public void luggageInsert(int newLuggage) {
        Scanner in = new Scanner(System.in);
        if (newLuggage == 1) {

            System.out.println("You've chosen to make a box.");
            System.out.println("Enter the width, height, and length: ");
            System.out.println("Width:");
            float width = in.nextFloat();
            System.out.println("Height:");
            float height = in.nextFloat();
            System.out.println("Length:");
            float length = in.nextFloat();

            shippingContainer.add(new Box(width, height, length));
        } else if (newLuggage == 2) {

            System.out.println("You've chosen to make a cube.");
            System.out.println("Enter the width: ");
            float width = in.nextFloat();
            shippingContainer.add(new Cube(width));
        } else if (newLuggage == 3) {

            System.out.println("You've chosen to make a sphere.");
            System.out.println("Enter the radius: ");
            float radius = in.nextFloat();

            shippingContainer.add(new Sphere(radius));
        } else if (newLuggage == 4) {

            System.out.println("You've chosen to make a cylinder.");
            System.out.println("Enter the radius and height: ");
            System.out.println("Radius:");
            float radius = in.nextFloat();
            System.out.println("Height:");
            float height = in.nextFloat();

            shippingContainer.add(new Cylinder(radius, height));

        } else if (newLuggage == 5) {
            {

                System.out.println("You've chosen to make a cone.");
                System.out.println("Enter the radius and the height: ");
                System.out.println("Radius:");
                float radius = in.nextFloat();
                System.out.println("Height:");
                float height = in.nextFloat();

                shippingContainer.add(new Cone(radius, height));
            }
        } else if (newLuggage == 6) {
            {

                System.out.println("You've chosen to make a Pyramid.");
                System.out.println("Enter the length, width, and height: ");
                System.out.println("Width:");
                float length = in.nextFloat();
                System.out.println("Height:");
                float width = in.nextFloat();
                System.out.println("Length:");
                float height = in.nextFloat();

                shippingContainer.add(new Pyramid(length, width, height));
            }
        } else if (newLuggage == 7) {
            {

                System.out.println("You've chosen to make a hexagonal prism.");
                System.out.println("Enter the base edge length and height: ");
                System.out.println("Base edge: ");
                float baseEdge = in.nextFloat();
                System.out.println("Height:");
                float height = in.nextFloat();

                shippingContainer.add(new hexagonPrism(baseEdge, height));
            }
        } else if (newLuggage == 8) {
            {

                System.out.println("You've chosen to make a tub.");
                System.out.println("Enter the width, height, and length: ");
                System.out.println("Width:");
                float width = in.nextFloat();
                System.out.println("Height:");
                float height = in.nextFloat();
                System.out.println("Length:");
                float length = in.nextFloat();

                shippingContainer.add(new Tub(height, width, length));
            }
        } else {
            System.out.print("The integer choice submitted was not valid.\nPlease try again.");
        }
    }

    public void luggageRemove() {
        Scanner in = new Scanner(System.in);
        int removeChoice;
        for (int i = 0; i<shippingContainer.size(); i++) {
            System.out.println((i+1)+".)" + "Luggage Type: " + shippingContainer.get(i).type + "   Luggage Volume:  " + shippingContainer.get(i).volume);
        }
        System.out.println("Enter the number of the luggage you want to remove: ");
        removeChoice = in.nextInt();
        shippingContainer.remove(removeChoice-1);
    }


}
