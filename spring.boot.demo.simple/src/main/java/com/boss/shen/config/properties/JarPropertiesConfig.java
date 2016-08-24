package com.boss.shen.config.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

@Profile("jar")
@Configuration
@PropertySource(name="webappconfig",value={"classpath:config/jar.properties","classpath:config/common.properties"})
public class JarPropertiesConfig {
	
	
}
