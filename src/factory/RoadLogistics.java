package factory;

//Concrete Creator
public class RoadLogistics extends Logistics{

    //override of factory method for each concrete creator
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}
