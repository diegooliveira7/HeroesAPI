package com.marveldc.herosapi;

import org.socialsignin.spring.data.dynamodb.repository.config.EnableDynamoDBRepositories;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDynamoDBRepositories
public class HerosapiApplication {

	public static void main(String[] args) {
		//teste com o basico do banco de dados
		SpringApplication.run(HerosapiApplication.class, args);
		System.out.println("super poderes com web flux");
	}


}
