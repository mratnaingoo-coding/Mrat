package SaleProduct;

import java.util.Scanner;

public class Sale_Program {
    public static String[] categories = {"Snack", "Toy", "Drinking Item", "Other"};
    public static String[] Snack = {"Cheetos", "Doritos", "Takis", "Cake"};
    public static int[] snack_Price = {6500, 6500, 4000, 12400};
    public static String[] Toy = {"Transformer toy", "Barbie girl", "Arrows and Bow"};
    public static int[] toy_Price = {5000, 2500, 3800};
    public static String[] Drinking_Item = {"Cocktail", "Beer", "Whiskey", "Coffee"};
    public static int[] drinkingItem_Price = {10000, 5500, 8000, 2500};
    public static String[] Other = {"Cleaning tower", "Book", "Shoes"};
    public static int[] other_Price = {1000, 2500, 3800};

    public void showCategories() {
        for (int i = 0; i < categories.length; i++) {
            System.out.println("Categories: " + (i + 1) + " : " + categories[i]);
        }
    }

    public void showSnack() {
        System.out.println("Snacks Details");
        for (int a = 0; a < Snack.length; a++) {
            System.out.println("Item : " + (a + 1) + " : " + Snack[a] + " : " + snack_Price[a]+" kyats");
        }
    }

    public void showToy() {
        System.out.println("Toy Details");
        for (int i = 0; i < Toy.length; i++) {
            System.out.println("Item : " + (i + 1) + " : " + Toy[i] + " : " + toy_Price[i]+" kyats");
        }
    }

    public void showDrinkingItem() {
        System.out.println("Drinking Items Details");
        for (int i = 0; i < Drinking_Item.length; i++) {
            System.out.println("Item : " + (i + 1) + " : " + Drinking_Item[i] + " : " + drinkingItem_Price[i]+" kyats");
        }
    }

    public void showOther() {
        System.out.println("Other Details");
        for (int i = 0; i < Other.length; i++) {
            System.out.println("Item : " + (i + 1) + " : " + Other[i] + " : " + other_Price[i]+" kyats");
        }
    }

    public static void main(String[] args) {
        int totalPrice = 0;
        String item = "";


        Scanner scanner = new Scanner(System.in);
        Sale_Program sale_Program = new Sale_Program();

        do {
            sale_Program.showCategories();
            System.out.println();
            sale_Program.showSnack();
            System.out.println();
            sale_Program.showToy();
            System.out.println();
            sale_Program.showDrinkingItem();
            System.out.println();
            sale_Program.showOther();
            System.out.println();

            System.out.println("Please Choose the categories in here. ");
            String choose_Item = scanner.nextLine();
            String input[] = choose_Item.split(",");
            System.out.print("Your choose the item : ");
            for (String list : input) {
                int itemNumber = Integer.parseInt(list ) ;
                {
                    System.out.print("");
                    switch (itemNumber) {
                        case 1:
                            sale_Program.showSnack();
                            System.out.println("You can choose between the number (1,2,3,4)");
                            String snack_Item = scanner.next();
                            String sn[] = snack_Item.split("");

                            System.out.println("You choose the number: ");
                            for (String a : sn) {
                                int cost = Integer.parseInt(a) -1 ;
                                System.out.print(Snack[cost] + ",");
                            }
                            System.out.println();
                            System.out.println("Your Orders : ");
                            for (String a : sn) {
                                int cost = Integer.parseInt(a) -1 ;
                                System.out.println(snack_Price[cost]);
                                totalPrice += snack_Price[cost];
                            }
                            break;
                        case 2:
                            sale_Program.showToy();
                            System.out.println("You can choose between the number (1,2,3)");
                            String toy_Item = scanner.next();
                            String to[] = toy_Item.split("");

                            System.out.println("You choose the number: ");
                            for (String b : to) {
                                int cost = Integer.parseInt(b) -1 ;
                                System.out.print(Toy[cost] + ",");
                            }
                            System.out.println();
                            System.out.println("Your Orders : ");
                            for (String b : to) {
                                int cost = Integer.parseInt(b)-1 ;
                                System.out.println(toy_Price[cost]);
                                totalPrice += toy_Price[cost];

                            }
                            break;
                        case 3:
                            sale_Program.showDrinkingItem();
                            System.out.println("You can choose between the number (1,2,3,4)");
                            String drinking_Item = scanner.next();
                            String dr[] = drinking_Item.split("");

                            System.out.println("You choose the number: ");
                            for (String c : dr) {
                                int cost = Integer.parseInt(c)-1 ;
                                System.out.print(Drinking_Item[cost] + ",");
                            }
                            System.out.println();
                            System.out.println("Your Orders : ");
                            for (String c : dr) {
                                int cost = Integer.parseInt(c)-1 ;
                                System.out.println(drinkingItem_Price[cost]);
                                totalPrice += drinkingItem_Price[cost];

                            }
                            break;
                        case 4:
                            sale_Program.showOther();
                            System.out.println("You can choose between the number (1,2,3)");
                            String other_Item = scanner.next();
                            String ot[] = other_Item.split("");

                            System.out.println("You choose the number: ");
                            for (String d : ot) {
                                int cost = Integer.parseInt(d)-1 ;
                                System.out.print(Other[cost] + ",");
                            }
                            System.out.println();
                            System.out.println("Your Orders : ");
                            for (String d : ot) {
                                int cost = Integer.parseInt(d)-1 ;
                                System.out.println(other_Price[cost]);
                                totalPrice += other_Price[cost];

                            }
                            break;


                    }
                }
                System.out.println("Total Price: " + totalPrice + " kyats");
                scanner.nextLine();
                System.out.println("Do you want to choose the others ? y/n");
                item = scanner.nextLine();
                if (item.equalsIgnoreCase("n")) {
                    System.out.println("\nThank you for your Purchase. Have a Great Day!");
                }

            }
        }
            while (!item.equalsIgnoreCase("n")) ;
            scanner.close();
        
    }
}










