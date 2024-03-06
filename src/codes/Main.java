public class Main {
    public static void main(final String[] args) {
        HomeObjectsCollection collection = new HomeObjectsCollection();

        CoffeMachine coffeeMachine1 = new CoffeMachine("vertuo next", "nespresso", 229.0, "silver", 120, "n/a", "espresso", "strong");
        Computer pc1 = new Computer("gaming pc", "alienware", 2000.0, "silver", 220, "wifi", "intel i9", 16);
        Toaster toaster1 = new Toaster("a bit more 2 slice toaster", "beville", 89.95, "silver", 120, "n/a", 4, true);
        Sofa sofa1 = new Sofa("sectional sofa", "ikea", 800.0, "teal", true, "wood", 5, "velvet");
        Drawer drawer1 = new Drawer("bedroom drawer", "citizenry", 300.0, "brown", false, "wood", 4, "oak");


        collection.addItem(coffeeMachine1);
        collection.addItem(pc1);
        collection.addItem(toaster1);
        collection.addItem(sofa1);
        collection.addItem(drawer1);

        collection.displayItems();
        System.out.println("Number of items: " + collection.getNumberOfItems());
    }
}