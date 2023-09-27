package org.shameenakoodan.KanbanFlowEurekaServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
/*The above annotation makes this application a Service Registration
* Makes this module as a Eureka Server*/
public class KanbanFlowEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(KanbanFlowEurekaServerApplication.class, args);
	}

}
