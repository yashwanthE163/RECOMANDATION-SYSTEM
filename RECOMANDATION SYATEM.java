import java.util.*;

public class RecommendationSystem {


    static class Item {
        String name;
        String category;

        Item(String name, String category) {
            this.name = name;
            this.category = category;
        }
    }

    public static void main(String[] args) {

        // Sample dataset
        List<Item> items = new ArrayList<>();
        items.add(new Item("Java Programming Course", "Education"));
        items.add(new Item("Python Programming Course", "Education"));
        items.add(new Item("Data Science Course", "Education"));
        items.add(new Item("Avengers Movie", "Entertainment"));
        items.add(new Item("Inception Movie", "Entertainment"));
        items.add(new Item("Football Match", "Sports"));
        items.add(new Item("Cricket Match", "Sports"));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Available Categories:");
        System.out.println("Education, Entertainment, Sports");

        System.out.print("\nEnter your preferred category: ");
        String preference = scanner.nextLine();

  
        System.out.println("\nRecommended Items for you:");

        boolean found = false;
        for (Item item : items) {
            if (item.category.equalsIgnoreCase(preference)) {
                System.out.println("- " + item.name);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No recommendations found for this category.");
        }

        scanner.close();
    }
}
