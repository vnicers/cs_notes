package me.tanwei.web.ws.cxf;

import lombok.extern.slf4j.Slf4j;

import javax.jws.WebService;

/**
 * Created by kelp on 2017/6/3.
 */
@Slf4j
@WebService
public class HelloWSServiceImpl implements HelloWSService {
    @Override
    public String sayHello(String name) {
        log.info("cxf ws xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx");
        return "cxf:"+name;
    }
}
