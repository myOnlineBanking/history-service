package com.historys.ensas;

import com.historys.ensas.entity.History;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Import;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import springfox.documentation.spring.data.rest.configuration.SpringDataRestConfiguration;

@SpringBootApplication
@Import(SpringDataRestConfiguration.class)
@EnableEurekaClient
public class HistoryServiceApplication implements CommandLineRunner {

	@Autowired
	private RepositoryRestConfiguration configuration;

	public static void main(String[] args) {
		SpringApplication.run(HistoryServiceApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		configuration.exposeIdsFor(History.class);

		// TODO Auto-generated MOCK DATA

		// String userIds[] = { "user1", "user2" };
		// String compteIds[] = { "compte1", "compte2" };
		// for (int i = 0; i < 10; i++) {
		// int randomCompteIndex = new Random().nextInt(compteIds.length);
		// String randomCompte = compteIds[randomCompteIndex];

		// int randomUserIndex = new Random().nextInt(userIds.length);
		// String randomUser = userIds[randomUserIndex];

		// History history = new History(randomUser, randomCompte, "message by" +
		// randomUser + " in " + randomCompte,
		// new Date());
		// historyRepository.save(history);

		// }

	}

}
