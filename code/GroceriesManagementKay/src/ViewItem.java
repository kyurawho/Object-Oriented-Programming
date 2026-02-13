public class ViewItem {
    public static void viewMenu() {
        System.out.println("Your Grocery List:");

        if (Main.items.isEmpty()) {
            System.out.println("No items.");
            return;
        }

        int i = 1;
        for (String temp : Main.items) {
            System.out.println(i + ". " + temp);
            i++;
        }

        System.out.println("Total Items: " + Main.items.size());
    }
}
