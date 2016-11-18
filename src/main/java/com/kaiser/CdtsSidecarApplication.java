package com.kaiser;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSidecar
public class CdtsSidecarApplication {

	public static void main(String[] args) {
		SpringApplication.run(CdtsSidecarApplication.class, args);
	}
}
