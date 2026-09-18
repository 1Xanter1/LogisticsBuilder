package factory;

public class FactoryPatternInit {
    public static void main(String[] args) {
        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        roadLogistics.planDelivery();
        seaLogistics.planDelivery();

    }
}
