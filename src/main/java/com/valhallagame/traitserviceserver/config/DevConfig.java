package com.valhallagame.traitserviceserver.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.valhallagame.characterserviceclient.CharacterServiceClient;
import com.valhallagame.common.DefaultServicePortMappings;
import com.valhallagame.personserviceclient.PersonServiceClient;

@Configuration
@Profile("development")
public class DevConfig {
	@Bean
	public CharacterServiceClient characterServiceClient() {
		CharacterServiceClient
				.init("http://dev-character-service:" + DefaultServicePortMappings.CHARACTER_SERVICE_PORT);
		return CharacterServiceClient.get();
	}

	@Bean
	public PersonServiceClient personServiceClient() {
		PersonServiceClient.init("http://dev-person-service:" + DefaultServicePortMappings.PERSON_SERVICE_PORT);
		return PersonServiceClient.get();
	}
}
