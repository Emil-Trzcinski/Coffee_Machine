import java.util.Scanner;

public class Coffee_Machine {

    public static int waterAmount = 400;
    public static int milkAmount = 540;
    public static int coffeebeansAmount = 120;
    public static int cupsAmount = 9;
    public static int moneyAmount = 550;

    public void fill() {

        Scanner scanner = new Scanner(System.in);

        System.out.println();
        System.out.println("Write how many ml of water do you want to add:");
        int addWater = scanner.nextInt();
        waterAmount += addWater;

        System.out.println("Write how many ml of milk do you want to add:");
        int addMilk = scanner.nextInt();
        milkAmount += addMilk;

        System.out.println("Write how many grams of coffee beans do you want to add:");
        int addCoffeeBeans = scanner.nextInt();
        coffeebeansAmount += addCoffeeBeans;

        System.out.println("Write how many disposable cups of coffee do you want to add:");
        int addCups = scanner.nextInt();
        cupsAmount += addCups;

    }

    public void take() {

        System.out.println();
        System.out.println("I gave you $" + moneyAmount);
        moneyAmount -= moneyAmount;
    }

    public void remaining() {

        System.out.println();
        System.out.println("The coffee machine has:");
        System.out.println(waterAmount + " of water");
        System.out.println(milkAmount + " of milk");
        System.out.println(coffeebeansAmount + " of coffee beans");
        System.out.println(cupsAmount + " of disposable cups");
        System.out.println(moneyAmount + " of money");
    }

    public static class Esspresso {
        final static int esspressoWater = 250;
        final static int esspressCoffeebeans = 16;
        final static int esspressMoney = 4;


        public static void makeEsspresso() {
            if (waterAmount >= 250 && coffeebeansAmount >= 16 && cupsAmount >= 1) {
                waterAmount -= esspressoWater;
                coffeebeansAmount -= esspressCoffeebeans;
                moneyAmount += esspressMoney;
                cupsAmount -= 1;

                System.out.println("I have enough resources, making you a coffee!");


            } else if (waterAmount < 250 || coffeebeansAmount < 16 || cupsAmount < 1) {
                if (waterAmount < 250) {
                    System.out.println("Sorry, not enough water!");


                } else if (coffeebeansAmount < 16) {
                    System.out.println("Sorry, not enough coffee beans!");


                } else if (cupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");


                }
            }

        }
    }

    public static class Latte {
        final static int latteoWater = 350;
        final static int latteMilk = 75;
        final static int latteCoffeebeans = 20;
        final static int latteMoney = 7;


        public static void makeLatte() {
            if (waterAmount >= 350 && milkAmount >= 75 && coffeebeansAmount >= 20 && cupsAmount >= 1) {
                waterAmount -= latteoWater;
                milkAmount -= latteMilk;
                coffeebeansAmount -= latteCoffeebeans;
                moneyAmount += latteMoney;
                cupsAmount -= 1;

                System.out.println("I have enough resources, making you a coffee!");


            } else if (waterAmount < 350 || milkAmount < 75 || coffeebeansAmount < 20 || cupsAmount < 1) {
                if (waterAmount < 350) {
                    System.out.println("Sorry, not enough water!");


                } else if (milkAmount < 75) {
                    System.out.println("Sorry, not enough milk!");


                } else if (coffeebeansAmount < 20) {
                    System.out.println("Sorry, not enough coffee beans!");


                } else if (cupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");

                }
            }

        }
    }

    public static class Cappuccino {
        final static int cappuccinoWater = 200;
        final static int cappuccinoMilk = 100;
        final static int cappuccinoCoffeebeans = 12;
        final static int cappuccinoMoney = 6;


        public static void makeCappuccino() {
            if (waterAmount >= 200 && milkAmount >= 100 && coffeebeansAmount >= 12 && cupsAmount >= 1) {
                waterAmount -= cappuccinoWater;
                milkAmount -= cappuccinoMilk;
                coffeebeansAmount -= cappuccinoCoffeebeans;
                moneyAmount += cappuccinoMoney;
                cupsAmount -= 1;

                System.out.println("I have enough resources, making you a coffee!");


            } else if (waterAmount < 200 || milkAmount < 100 || coffeebeansAmount < 12 || cupsAmount < 1) {
                if (waterAmount < 200) {
                    System.out.println("Sorry, not enough water!");


                } else if (milkAmount < 100) {
                    System.out.println("Sorry, not enough milk!");


                } else if (coffeebeansAmount < 12) {
                    System.out.println("Sorry, not enough coffee beans!");



                } else if (cupsAmount < 1) {
                    System.out.println("Sorry, not enough disposable cups!");


                }
            }

        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Coffee_Machine kawiarka = new Coffee_Machine();

        boolean shouldExit  = false;

        while (!shouldExit) {

            System.out.println("Write action (buy, fill, take, remaining, exit):");

            String action = scanner.next();

            switch (action) {
                case "buy":

                    while (!shouldExit) {

                        System.out.println();
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, " +
                                "back - to main menu: ");

                        String command = scanner.next();

                        if (command.equals("1")) {
                            Esspresso.makeEsspresso();
                            break;

                        } else if (command.equals("2")) {
                            Latte.makeLatte();
                            break;

                        } else if (command.equals("3")) {
                            Cappuccino.makeCappuccino();
                            break;

                        } else if (command.equals("back")){
                            break;

                        }
                    }

                    break;

                case "fill":
                    kawiarka.fill();
                    break;

                case "take":
                    kawiarka.take();
                    break;


                case "remaining":
                    kawiarka.remaining();
                    break;

                case "exit":
                    shouldExit = true;
                    break;

                default:
                    // ignore
                    break;
            }
        }
    }
}