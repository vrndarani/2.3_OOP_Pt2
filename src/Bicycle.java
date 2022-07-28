public class Bicycle extends WheeledTransport implements Checkable{


    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Changing a bike tyre");
    }

    @Override
    public void check() {
        System.out.println("Service to " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
    }
}