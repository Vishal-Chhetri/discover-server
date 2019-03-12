package com.project.school.discoverserver.discoverserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


@SpringBootApplication
@EnableEurekaServer
public class DiscoverServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DiscoverServerApplication.class, args);
	}

}
