package app.typesafe;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigBeanFactory;
import com.typesafe.config.ConfigFactory;
import com.typesafe.config.ConfigObject;

import java.io.File;
import java.util.List;

public class TypesafeTest {
    public void loadConf01() {
        Config conf = ConfigFactory.load();
        String name = conf.getString("demo.name");
        List<String> address = conf.getStringList("demo.address");
        ConfigObject family = conf.getObject("demo.family");

        System.out.println("The name is:" + name);
        address.forEach(v -> System.out.println("address:" + v));
        family.forEach((k, v) -> System.out.println("Key:" + k + ", Value:" + v));
    }

    public void loadConf02() {
        Config config = ConfigFactory.parseFile(new File("./config/app.conf"));

        AppConfig appConfig = ConfigBeanFactory.create(config, AppConfig.class);
        String name = appConfig.getDemo().getName();
        System.out.println("Name:" + name);
    }
}
