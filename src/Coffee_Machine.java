import java.util.Scanner;

public class Coffee_Machine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int money = 550;
        int water = 400;
        int milk = 540;
        int coffeebeans = 120;
        int cups = 9;

        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeebeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

        System.out.println("Write action (buy, fill, take):");

        String action = scanner.next();

        switch (action) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino: ");
                int number = scanner.nextInt();

                if (number == 1) {
                    water -= 250;
                    coffeebeans -= 16;
                    money += 4;
                    cups -= 1;

                    break;

                } else if (number == 2) {
                    water -= 350;
                    milk -= 75;
                    coffeebeans -= 20;
                    money += 7;
                    cups -= 1;

                    break;

                } else if (number == 3) {
                    water -= 200;
                    milk -= 100;
                    coffeebeans -= 12;
                    money += 6;
                    cups -= 1;

                    break;

                } else {

                    break;
                }

            case "fill":

                System.out.println("Write how many ml of water do you want to add:");
                int addWater = scanner.nextInt();
                water += addWater;

                System.out.println("Write how many ml of milk do you want to add:");
                int addMilk = scanner.nextInt();
                milk += addMilk;

                System.out.println("Write how many grams of coffee beans do you want to add:");
                int addCoffeeBeans = scanner.nextInt();
                coffeebeans += addCoffeeBeans;

                System.out.println("Write how many disposable cups of coffee do you want to add:");
                int addCups = scanner.nextInt();
                cups += addCups;

                break;

            case "take":

                System.out.println("I gave you $" + money);
                money -= money;

                break;

            default:
                break;
        }

        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffeebeans + " of coffee beans");
        System.out.println(cups + " of disposable cups");
        System.out.println(money + " of money");

    }
}
