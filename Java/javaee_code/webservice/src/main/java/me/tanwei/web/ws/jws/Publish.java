package me.tanwei.web.ws.jws;

import javax.xml.ws.Endpoint;

/**
 * Created by kelp on 2017/6/3.
 */
public class Publish {
    public static void main(String[] args) {
        String address = "http://192.168.1.103:9090/sam/ws/hello";
        Endpoint.publish(address, new HelloWSServiceImpl());
    }
}
