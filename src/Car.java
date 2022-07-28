public class Car extends WheeledTransport implements Checkable, Engineable{

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check(){
        System.out.println("Service to " + getModelName());
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
        }
        checkEngine();

    }

    @Override
    public void updateTyre() {
        System.out.println("Changing car tyre");
    }

    @Override
    public void checkEngine() {
        System.out.println("Checking car engine");
    }
}