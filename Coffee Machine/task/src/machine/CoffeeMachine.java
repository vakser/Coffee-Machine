package machine;

import java.util.Scanner;

public class CoffeeMachine {
    static Scanner scanner = new Scanner(System.in);
    static int water = 400;
    static int milk = 540;
    static int coffee = 120;
    static int cups = 9;
    static int money = 550;
    static boolean isOn = true;

    public static void main(String[] args) {
        startCoffeeMachine();
    }

    public static void buy() {
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String choice = scanner.next();
        switch (choice) {
            case "1":
                makeEspresso();
                break;
            case "2":
                makeLatte();
                break;
            case "3":
                makeCappuccino();
                break;
            case "back":
                startCoffeeMachine();
            default:
                break;
        }
    }

    public static void fill() {
        System.out.println("\nWrite how many ml of water you want to add:");
        int waterToAdd = scanner.nextInt();
        water += waterToAdd;
        System.out.println("Write how many ml of milk you want to add:");
        int milkToAdd = scanner.nextInt();
        milk += milkToAdd;
        System.out.println("Write how many grams of coffee beans you want to add:");
        int coffeeToAdd = scanner.nextInt();
        coffee += coffeeToAdd;
        System.out.println("Write how many disposable cups of coffee you want to add:");
        int cupsToAdd = scanner.nextInt();
        cups += cupsToAdd;
    }

    public static void take() {
        System.out.println("\nI gave you $" + money);
        money = 0;
    }

    public static void inform() {
        System.out.println("\nThe coffee machine has:\n" + water + " ml of water\n" + milk + " ml of milk\n" + coffee +
                " g of coffee beans\n" + cups + " disposable cups\n" + "$" + money + " of money");
    }

    public static void handleInput(String action) {
        switch (action) {
            case "buy":
                buy();
                break;
            case "fill":
                fill();
                break;
            case "take":
                take();
                break;
            case "remaining":
                inform();
                break;
            case "exit":
                isOn = false;
                break;
            default:
                break;
        }
    }

    public static void startCoffeeMachine() {
        while (isOn) {
            System.out.println("\nWrite action (buy, fill, take, remaining, exit):");
            String action = scanner.next();
            handleInput(action);
        }
    }

    public static void makeEspresso() {
        if (water >= 250 && coffee >= 16 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 250;
            coffee -= 16;
            cups--;
            money += 4;
        } else {
            if (water < 250) {
                System.out.println("Sorry, not enough water!");
            }
            if (coffee < 16) {
                System.out.println("Sorry, not enough coffee");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups");
            }
        }
    }

    public static void makeLatte() {
        if (water >= 350 && milk >= 75 && coffee >= 20 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 350;
            milk -= 75;
            coffee -= 20;
            cups--;
            money += 7;
        } else {
            if (water < 350) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < 75) {
                System.out.println("Sorry, not enough milk");
            }
            if (coffee < 20) {
                System.out.println("Sorry, not enough coffee");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups");
            }
        }
    }

    public static void makeCappuccino() {
        if (water >= 200 && milk >= 100 && coffee >= 12 && cups >= 1) {
            System.out.println("I have enough resources, making you a coffee!");
            water -= 200;
            milk -= 100;
            coffee -= 12;
            cups--;
            money += 6;
        } else {
            if (water < 200) {
                System.out.println("Sorry, not enough water!");
            }
            if (milk < 100) {
                System.out.println("Sorry, not enough milk");
            }
            if (coffee < 12) {
                System.out.println("Sorry, not enough coffee");
            }
            if (cups < 1) {
                System.out.println("Sorry, not enough cups");
            }
        }
    }
}