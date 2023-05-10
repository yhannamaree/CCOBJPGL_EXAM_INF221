public class Antipolo implements Locations {

    int airFare = 8000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
