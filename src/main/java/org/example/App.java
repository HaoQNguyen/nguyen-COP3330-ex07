

package org.example;

import java.util.Scanner;

public class App
{
    public static void main( String[] args )
    {
        final double CONVERSION_FACTOR = 0.09290304;

        Scanner input = new Scanner(System.in);

        System.out.print("What is the length of the room in feet? ");
        double l = input.nextDouble();

        System.out.print("What is the width of the room in feet? " );
        double w = input.nextDouble();

        double areaF = l * w;
        double areaM = areaF * CONVERSION_FACTOR;

        System.out.printf("You entered dimensions of %.3f feet by %.3f feet.\n", l, w);
        System.out.printf("The area is\n%.3f square feet\n%.3f square meters", areaF, areaM);
    }
}
