public class Saudi implements Locations {

    int airFare = 20000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
