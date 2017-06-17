package me.tanwei.web.ws.cxf_spring;

import javax.jws.WebService;

/**
 * Created by kelp on 2017/6/3.
 */

@WebService
public class HelloWSServiceImpl implements HelloWSService {
    @Override
    public String sayHello(String name) {
        return "cxf:"+name;
    }
}
