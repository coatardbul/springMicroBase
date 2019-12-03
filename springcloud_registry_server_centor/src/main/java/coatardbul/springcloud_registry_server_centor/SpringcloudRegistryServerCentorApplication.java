package coatardbul.springcloud_registry_server_centor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringcloudRegistryServerCentorApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudRegistryServerCentorApplication.class, args);
    }

}
