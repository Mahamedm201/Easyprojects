package machine;
import java.util.Scanner;
public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String action;
        System.out.println("Write action (buy, fill, take, remaining, exit)");
        action = sc.next();
        while (!(action.equals("exit"))) {
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
                    remaining();
            }
            System.out.println("\nWrite action (buy, fill, take, remaining, exit)");
            action = sc.next();
        }
    }
        static int water = 400;
        static int milk = 540;
        static int beans = 120;
        static int cups = 9;
        static int money = 550;

    public static void buy () {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nWhat do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
        String x = sc.next();
        int a;
        if (x.equals("back")) {
            return;
        } else {
            a = Integer.parseInt(x);
        }
        switch (a) {
            case 1:
                if (water < 250) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (beans < 16) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 250;
                    beans = beans - 16;
                    cups = cups - 1;
                    money = money + 4;
                    break;
                }
            case 2:
                if (water < 350) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 75) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (beans < 20) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 350;
                    milk = milk - 75;
                    beans = beans - 20;
                    cups = cups - 1;
                    money = money + 7;
                    break;
                }
            case 3:
                if (water < 200) {
                    System.out.println("Sorry, not enough water!");
                    break;
                } else if (milk < 100) {
                    System.out.println("Sorry, not enough milk!");
                    break;
                } else if (beans < 12) {
                    System.out.println("Sorry, not enough coffee beans!");
                    break;
                } else if (cups <= 0) {
                    System.out.println("Sorry, not enough cups!");
                    break;
                } else {
                    System.out.println("I have enough resources, making you a coffee!");
                    water = water - 200;
                    milk = milk - 100;
                    beans = beans - 12;
                    cups = cups - 1;
                    money = money + 6;
                    break;
                }
        }
    }
    public static void fill () {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.println("\nWrite how many ml of water do you want to add:");
        a = sc.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        b = sc.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        c = sc.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        d = sc.nextInt();
        water = water + a;
        milk = milk + b;
        beans = beans + c;
        cups = cups + d;
    }
    public static void take () {
        System.out.println("I gave you $" + money);
        money = 0;
    }
    public static void remaining () {
        System.out.println("\nThe coffee machine has\n" + water + " of water\n"
                + milk + " of milk\n" + beans + " of coffee beans\n" + cups + " of disposable cups\n"
                + money + " of money");
    }
}
