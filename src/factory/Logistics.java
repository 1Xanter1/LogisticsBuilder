package factory;

//Creator Abstract Class
public  abstract class Logistics {

    // Factory method
    public abstract Transport createTransport();


    // Delivery logic
    public void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}
