public class Me implements Tourist {

    static int budget = 70000;

    public void visit() {
        System.out.print("Sarap buhay");
    }

    public void visit(America america) {

        //Gastos
        budget -= america.airFare;

        // Define your visit
        System.out.println("Pumunta sa america kasi bibisitahin mga tita ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Saudi saudi) {

        //Gastos
        budget -= saudi.airFare;

        // Define your visit
        System.out.println("Pumunta sa saudi para samahan si mama ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }
    
    public void visit(Korea korea) {

        //Gastos
        budget -= korea.airFare;
        
        // Define your visit
        System.out.println("Pumunta sa korea para sa mga idol ko ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Philippines philippines) {

        //Gastos
        budget -= philippines.airFare;

        // Define your visit
        System.out.println("Umuwi muna sa Pilipinas kahit ayaw na umuwi ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Palawan palawan) {

        //Gastos
        budget -= palawan.airFare;

        // Define your visit
        System.out.println("Pumunta sa Palawan para umuwi sa bahay namin ");
        checkBudget();
        System.out.println("-------------------------------------------");
    }

    public void visit(Antipolo antipolo) {

        //Gastos
        budget -= antipolo.airFare;

        // Define your visit
        System.out.println("Pumunta Baguio para mag-swimming sa falls ");
        checkBudget();
        System.out.println("-------------------------------------------");
        System.out.println("Ayan, puro gala. wala na pera. the end.");
        System.out.println("-------------------------------------------");

    }

    public void checkBudget() {

        System.out.println("my budget is " + budget);
    }

}
