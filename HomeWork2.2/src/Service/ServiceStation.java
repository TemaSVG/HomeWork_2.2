package Service;

import model.Transport;

public class ServiceStation {
    public void check(Transport transport) {
        if (transport != null) {
            transport.service();
        }
    }
}