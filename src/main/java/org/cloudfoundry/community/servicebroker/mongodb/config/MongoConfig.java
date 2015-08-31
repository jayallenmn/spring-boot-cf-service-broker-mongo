package org.cloudfoundry.community.servicebroker.mongodb.config;

import java.net.UnknownHostException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import org.cloudfoundry.community.servicebroker.model.BrokerApiVersion;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;

@Configuration
@EnableMongoRepositories(basePackages = "org.cloudfoundry.community.servicebroker.mongodb.repository")
public class MongoConfig {

	@Bean
	public MongoClient mongoClient() throws UnknownHostException {
		//return new MongoClient();
		String dbURI = "mongodb://userid:password@ip:port;
		return new MongoClient(new MongoClientURI(dbURI));
	}

	@Bean
public BrokerApiVersion brokerApiVersion() {
    return new BrokerApiVersion();
}
	
}