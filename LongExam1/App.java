public class App {
    public static void main(String[] args) throws Exception {

        System.out.println("-------------------------------------------");
        System.out.println("         Gala to the Max si Leanna         ");
        System.out.println("-------------------------------------------");

        Locations america = new America();
        Locations saudi = new Saudi();
        Locations korea = new Korea();
        Locations philippines = new Philippines();
        Locations palawan = new Palawan();
        Locations antipolo = new Antipolo();
        
        
        Tourist me = new Me();

        america.accept(me);
        saudi.accept(me);
        korea.accept(me);
        philippines.accept(me);
        palawan.accept(me);
        antipolo.accept(me);
        


        // Long exam 1

        // 1. Add 5 new locations to visit
        // 2. Each location should have an airFare.
        // 3. Each time you visit a new location, your budget should decrease.
        // 4. In the visit method, print a message if you can visit the new location and
        // print another message if you cannot visit the location.
        // 5. Each time you visit a location, call the checkBudgetMethod

    }
}
