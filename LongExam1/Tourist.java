interface Tourist {

    int budget = 0;

    void visit();

    void visit(America america);

    void visit(Saudi saudi);

    void visit(Korea korea);

    void visit(Philippines philippines);

    void visit(Palawan palawan);

    void visit(Antipolo baguio);


    default void visit(Locations locations) {
        System.out.println("Arrived on a location");
    };

    void checkBudget();
}
