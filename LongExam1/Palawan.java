public class Palawan implements Locations {

    int airFare = 10000;

    @Override
    public void accept(Tourist tourist) {
        tourist.visit(this);
    }
}
