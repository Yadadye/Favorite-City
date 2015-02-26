/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package city;

import java.util.Scanner;

/**
 *
 * @author nick.abramov
 */
public class City {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Please enter the name of your favorite city ");
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        int len = input.length();
        System.out.println("There are " + len + " characters in the city");
        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());
        System.out.println(input.charAt(0));

        // TODO code application logic here
    }

}
