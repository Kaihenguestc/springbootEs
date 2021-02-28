package com.esexample.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class EsApplication {

	public static void main(String[] args) {
		SpringApplication.run(EsApplication.class, args);
	}
}
