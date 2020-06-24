// *********************************************************************************************************************
// * (C) 2020 Immosolve GmbH, Tegelbarg 43, 24576 Bad Bramstedt
// *********************************************************************************************************************

package de.immosolve.axonmetric;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.actuate.autoconfigure.metrics.export.statsd.StatsdProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class TestConfig {


	@Primary
	@Bean
	public StatsdProperties properties(final StatsdProperties properties, @Value("${test:test123}") final String test) {
		// neither properties not test is resolved
		return properties;
	}
}
