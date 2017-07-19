
// participant: Context
//  Context is configured with a ConcreteStrategy object
public class Helicopter extends Vehicle {

    public Helicopter() {
        setGoAlgorithm(new GoByFlying());
    }
}
