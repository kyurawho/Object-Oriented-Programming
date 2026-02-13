import java.util.Scanner;

public class SearchItem {
    public static void searchMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Search item: ");
        String temp = sc.nextLine();

        boolean found = false;
        System.out.println("Search results:");

        for (String item : Main.items) {
            if (item.startsWith(temp)) {
                System.out.println("- " + item);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No items match your search.");
        }
    }
}
