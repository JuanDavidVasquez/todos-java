package org.example;

public abstract class Logistics {

    public void planDelivery(Envio envio) {
        Transport transport = createTransport();
        transport.deliver(envio);
    }

    // Factory Method: las subclases deciden qué producto crear
    protected abstract Transport createTransport();
}
