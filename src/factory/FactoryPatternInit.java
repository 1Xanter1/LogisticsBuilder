package factory;
// Client
public class FactoryPatternInit {
    public static void main(String[] args) {
        // Showcases of both factories

        Logistics roadLogistics = new RoadLogistics();
        Logistics seaLogistics = new SeaLogistics();

        roadLogistics.planDelivery();
        seaLogistics.planDelivery();

    }
}
