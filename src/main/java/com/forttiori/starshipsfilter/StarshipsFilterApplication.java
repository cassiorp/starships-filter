package com.forttiori.starshipsfilter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class StarshipsFilterApplication {

	public static void main(String[] args) {
		SpringApplication.run(StarshipsFilterApplication.class, args);
	}

}
