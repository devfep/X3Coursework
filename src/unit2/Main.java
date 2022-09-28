package unit2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cupcake> cupCakeMenu = new ArrayList<Cupcake>();
        Cupcake cupcake = new Cupcake();
        RedVelvet redVelvet = new RedVelvet();
        Chocolate chocolate = new Chocolate();


        System.out.println("We are in the middle of creating the cupcake menu. We currently have three cupcakes on the menu but we need to decide on pricing.");

        Scanner input = new Scanner(System.in);

        System.out.println("We are deciding on the price for our standard cupcake. Here is the description:");

        cupcake.type();
        System.out.println("How much would you like to charge for the cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceText = input.nextLine();
        System.out.println();
        double price = Double.parseDouble(priceText);
        cupcake.setPrice(price);

        System.out.println("We are deciding on the price for our red velvet cupcake. Here is the description:");
        redVelvet.type();
        System.out.println("How much would you like to charge for the red velvet cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceTextVelvet = input.nextLine();
        System.out.println();
        double priceVelvet = Double.parseDouble(priceTextVelvet);
        redVelvet.setPrice(priceVelvet);

        System.out.println("We are deciding on the price for our chocolate cupcake. Here is the description:");
        chocolate.type();
        System.out.println("How much would you like to charge for the chocolate velvet cupcake? (Input a numerical number taken to 2 decimal places)");
        String priceTextChocolate = input.nextLine();
        System.out.println();
        double priceChocolate = Double.parseDouble(priceTextChocolate);
        chocolate.setPrice(priceChocolate);

        cupCakeMenu.add(cupcake);
        cupCakeMenu.add(chocolate);
        cupCakeMenu.add(redVelvet);


        ArrayList<Drink> drinkMenu = new ArrayList<>();
        Drink water = new Drink();
        Soda soda = new Soda();
        Milk milk = new Milk();

        System.out.println("We are deciding on the price for our bottled water. Here is the description:");
        water.type();
        System.out.println("How much would you like to charge for the water? (Input a numerical number taken to 2 decimal places)");
        String waterTextPrice = input.nextLine();
        System.out.println();
        double waterPrice = Double.parseDouble(waterTextPrice);
        water.setPrice(waterPrice);



        System.out.println("We are deciding on the price for our soda. Here is the description:");
        soda.type();
        System.out.println("How much would you like to charge for the soda? (Input a numerical number taken to 2 decimal places)");
        String sodaTextPrice = input.nextLine();
        System.out.println();
        double sodaPrice = Double.parseDouble(sodaTextPrice);
        soda.setPrice(sodaPrice);


        System.out.println("We are deciding on the price for our  milk. Here is the description:");
        milk.type();
        System.out.println("How much would you like to charge for the milk? (Input a numerical number taken to 2 decimal places)");
        String milkTextPrice = input.nextLine();
        System.out.println();
        double milkPrice = Double.parseDouble(milkTextPrice);
        milk.setPrice(milkPrice);


        drinkMenu.add(water);
        drinkMenu.add(soda);
        drinkMenu.add(milk);

        new Order(cupCakeMenu, drinkMenu);

    }
}
