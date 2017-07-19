// common superclass for all Contexts

public abstract class Vehicle {

    public void setGoAlgorithm(GoAlgorithm algorithm) {
        this.algorithm = algorithm;
    }

    public void go() {
        algorithm.go();
    }
    
    private GoAlgorithm algorithm;
}
