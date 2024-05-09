package amoa.server;

import javax.xml.ws.Endpoint;
import org.apache.cxf.jaxws.EndpointImpl; // Assuming Apache CXF is used

public class ServicePublisher {

    private static final Logger LOGGER = LoggerFactory.getLogger(ServicePublisher.class);

    public static void main(String[] args) {
        LOGGER.info("Starting server");
        
        Endpoint.publish("http://localhost:2020/webservices/ProductsManager", new ProductsManagerImpl())

        LOGGER.info("Server started ");
    }
    
}
