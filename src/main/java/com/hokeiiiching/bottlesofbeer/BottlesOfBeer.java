package main.java.com.hokeiiiching.bottlesofbeer;

import java.util.Scanner;

public class BottlesOfBeer {
    //Output each line as an array element
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello! Do you wanna play a game with me? (Y/N)");
        String answer = scanner.nextLine();
        if (answer.equalsIgnoreCase("N")) {
            System.out.println("Goodbye!");
        } else {
            System.out.println("Yay! How many bottles of beer will you be drinking?");
            int beers = Integer.parseInt(scanner.nextLine());
            com.hokeiiiching.bottles_of_beer.UserInterface ui = new com.hokeiiiching.bottles_of_beer.UserInterface(beers);
            ui.start();
        }

    }

}
