public class Antipolo implements Locations {

    int airFare = 6000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
