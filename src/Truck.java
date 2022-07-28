public class Truck extends WheeledTransport implements Checkable, Engineable {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing truck tyre");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking truck engine");
    }

    private void checkTrailer() {
        System.out.println("Checking truck trailer");
    }

    @Override
    public void check() {
        System.out.println("Service to " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();
        checkTrailer();
    }
}