package me.tanwei.web.ws;

import lombok.SneakyThrows;
import lombok.extern.slf4j.Slf4j;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.endpoint.dynamic.DynamicClientFactory;
import org.junit.Test;

/**
 * Created by kelp on 2017/6/3.
 */
@Slf4j
public class WebServiceTest {

    @Test
    @SneakyThrows
    public void test() {
        DynamicClientFactory clientFactory = DynamicClientFactory.newInstance();
        Client client = clientFactory.createClient("http://192.168.1.103:9090/sam/ws/hello?wsdl");
        Object[] results = client.invoke("sayHello","xxx");
        log.warn("results:{}", results);

    }
}
