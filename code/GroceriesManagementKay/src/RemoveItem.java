import java.util.Scanner;

public class RemoveItem {
    public static void removeMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter item to remove: ");
        String temp = sc.nextLine();

        if (Main.items.contains(temp)) {
            Main.items.remove(temp);
            System.out.println(temp + " removed!");
        } else {
            System.out.println("Item not found!");
        }
    }
}
