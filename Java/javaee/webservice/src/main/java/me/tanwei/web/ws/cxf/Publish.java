package me.tanwei.web.ws.cxf;

import me.tanwei.web.ws.jws.HelloWSServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

import javax.xml.ws.Endpoint;

/**
 * Created by kelp on 2017/6/3.
 */
public class Publish {
    public static void main(String[] args) {
        String address = "http://192.168.1.103:9090/sam/ws/hello";
        JaxWsServerFactoryBean jaxWsServerFactoryBean = new JaxWsServerFactoryBean();
        jaxWsServerFactoryBean.setAddress(address);
        jaxWsServerFactoryBean.setServiceClass(HelloWSService.class);
        jaxWsServerFactoryBean.setServiceBean(new me.tanwei.web.ws.cxf.HelloWSServiceImpl());
        jaxWsServerFactoryBean.create();

    }
}
