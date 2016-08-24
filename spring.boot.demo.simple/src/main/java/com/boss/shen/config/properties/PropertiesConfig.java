package com.boss.shen.config.properties;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource(name="webappconfig",value={"classpath:config/webapp.properties"})
public class PropertiesConfig {
}
