package me.tanwei.web.ws.cxf_spring;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * Created by kelp on 2017/6/3.
 */

@WebService
public interface HelloWSService {

    @WebMethod
    String sayHello(String name);
}
