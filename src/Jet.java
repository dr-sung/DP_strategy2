
// participant: Context
//  Context is configured with a ConcreteStrategy object
public class Jet extends Vehicle {

    public Jet() {
        setGoAlgorithm(new GoByFlyingFast());
    }
}
