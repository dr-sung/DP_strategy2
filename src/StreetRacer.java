
// participant: Context
//  Context is configured with a ConcreteStrategy object
public class StreetRacer extends Vehicle {

    public StreetRacer() {
        setGoAlgorithm(new GoByDriving());
    }
}
