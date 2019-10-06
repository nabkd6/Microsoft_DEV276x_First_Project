import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        intro();
        budget();
        time();
        distance();

    }
    public static void intro(){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Vacation Planner!");
        System.out.print("What is your name? ");
        String name = input.nextLine();
        System.out.print("Nice to meet you " + name + ", where are you travelling to? ");
        String city = input.nextLine();
        System.out.println("Great! " + city + " sounds like a great trip.\n***********");
    }

    public static void budget(){
        Scanner input = new Scanner(System.in);
        System.out.print("How many days are you going to spend travelling? ");
        int days = input.nextInt();
        System.out.print("How much money, in USD, are you planning to spend on your trip? ");
        double money = input.nextInt();
        System.out.print("What is the three letter currency symbol for your travel destination? ");
        String currency = input.next();
        System.out.print("How many " + currency + " are there in 1 USD? ");
        double conversionRate = input.nextDouble();
        int hours = days * 24;
        int minutes = hours * 60;
        System.out.println("If you are travelling for " + days + " days that is the same as " + hours + " hours or " + minutes + " minutes.");
        double dailyBudget = (double) money / days;
        System.out.print("If you are going to spend $" + String.format("%.2f", money) + " USD that means per day you can spend up to $" +
                String.format("%.2f", dailyBudget) + " USD.");
        double convertedMoney = money * conversionRate;
        double convertedDailyBudget = convertedMoney / days;
        System.out.println("Your total budget in " + currency + " is $" + String.format("%.2f",convertedMoney) + " " + currency +
                ", which per day is $" + String.format("%.2f",convertedDailyBudget) + " " + currency + ".");

    }

    public static void time(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the time difference, in hours, between your home and your destination? ");
        int timeDifference = input.nextInt();
        int timeFromMidnight = (0 + timeDifference);
        int timeFromNoon = (12 + timeDifference);
        System.out.println("That means that when it is midnight at home it will be " + ((timeFromMidnight % 24 + 24) % 24) +
                ":00 in your travel destination and when it is noon at home it will be " + ((timeFromNoon % 24 + 24) % 24) +
                ":00.\n***********");

    }

    public static void distance(){
        Scanner input = new Scanner(System.in);
        System.out.print("What is the square area of your destination country in km2? ");
        int squareMiles = input.nextInt();
        double km2MilesFactor = 1/2.58;
        int squareKm = (int) (squareMiles * km2MilesFactor);
        System.out.println("In miles2 that is " + squareKm + ".");


    }


}
