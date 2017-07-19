
// example: Strategy design pattern
// This example is based on the code presented at the book:
// Desing Patterns for Dummies by Steve Holzner
public class Main {

    public static void main(String[] args) {
        Vehicle streetRacer = new StreetRacer();
        Vehicle formulaOne = new FormulaOne();
        Vehicle helicopter = new Helicopter();
        Vehicle jet = new Jet();

        streetRacer.go();
        formulaOne.go();
        helicopter.go();
        jet.go();

        // use of the strategy pattern to implement a RealJet
        // a RealJet (1) takeoff - drive on runway, 
        //           (2) fly fast, 
        //           (3) landon - drive on runway
        // switching algorithms does not require re-writing class Jet
        Jet realJet = new Jet();
        realJet.setGoAlgorithm(new GoByDriving());
        realJet.go();
        realJet.setGoAlgorithm(new GoByFlyingFast());
        realJet.go();
        realJet.setGoAlgorithm(new GoByDriving());
        realJet.go();
    }

}
