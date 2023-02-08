package com.nttdata.bootcamp.gateway.filters;

import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

import lombok.extern.log4j.Log4j2;
import reactor.core.publisher.Mono;

@Log4j2
@Configuration
public class FiltersGateway {
	@Bean
	@Order(-1)
	public GlobalFilter a() {
		return (exchange, chain) -> {
			log.info("first pre filter");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("first post filter");
			}));
		};
	}
	
	@Bean
	@Order(0)
	public GlobalFilter b() {
		return (exchange, chain) -> {
			log.info("Second pre filter");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("Second post filter");
			}));
		};
	}
	
	@Bean
	@Order(1)
	public GlobalFilter c() {
		return (exchange, chain) -> {
			log.info("Third pre filter");
			return chain.filter(exchange).then(Mono.fromRunnable(() -> {
				log.info("Third post filter");
			}));
		};
	}
	
}
