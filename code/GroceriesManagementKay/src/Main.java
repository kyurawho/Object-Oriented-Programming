import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static ArrayList<String> items = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("===== MENU =====");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Search Item");
            System.out.println("4. View Item");
            System.out.println("5. Exit");
            System.out.print(">> ");

            char inchar = sc.next().charAt(0);
            sc.nextLine();
            int input = inchar - '0';

            switch (input) {
                case 1:
                    AddItem.showMenu();
                    break;
                case 2:
                    RemoveItem.removeMenu();
                    break;
                case 3:
                    SearchItem.searchMenu();
                    break;
                case 4:
                    ViewItem.viewMenu();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid input!");
            }
        }
    }
}
