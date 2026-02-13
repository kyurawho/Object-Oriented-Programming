import java.util.Scanner;

public class AddItem {
    public static void showMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item name: ");
        String temp = sc.nextLine();

        if (Main.items.contains(temp)) {
            System.out.println("Item already exists!");
        } else {
            Main.items.add(temp);
            System.out.println("Item added!");
        }
    }
}
