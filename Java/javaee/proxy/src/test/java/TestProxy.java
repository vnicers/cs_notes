import lombok.extern.slf4j.Slf4j;
import me.tanwei.example.proxy.bean.Person;
import me.tanwei.example.proxy.bean.Tanwei;
import me.tanwei.example.proxy.cglib.HouseAgencyCGLIB;
import me.tanwei.example.proxy.jdk.HouseAgency;
import org.junit.Test;

import java.util.Objects;

/**
 * Created by kelp on 2017/6/17.
 */
@Slf4j
public class TestProxy {


    @Test
    public void testJDKProxy() {
        HouseAgency agency = new HouseAgency(new Tanwei());
        Person tanweiProxy = (Person) agency.getProxy();
        tanweiProxy.findHouse();
    }


    @Test
    public void testCGLIBProxy() {
        HouseAgencyCGLIB agency = new HouseAgencyCGLIB();
        Person tanweiProxy = (Person) agency.getInstance(new Tanwei());
        String house = tanweiProxy.findHouse();
        log.info(house);
    }



    @Test
    public void testObjects() {
        Object obj = null;
        Objects.requireNonNull(obj);
        log.info("惺惺惜惺惺想寻寻寻寻寻寻 ");
    }
}
