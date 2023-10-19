package com.launchdarkly.examples.camel;

import com.launchdarkly.sdk.server.LDClient;
import com.launchdarkly.sdk.server.interfaces.LDClientInterface;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CamelRoutingApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelRoutingApplication.class, args);
	}

	@Bean
	public LDClientInterface ldClient() {
		return new LDClient("my-sdk-key-here");
	}

}
