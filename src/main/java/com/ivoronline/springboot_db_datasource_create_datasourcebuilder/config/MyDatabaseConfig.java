package com.ivoronline.springboot_db_datasource_create_datasourcebuilder.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import javax.sql.DataSource;

@Configuration
public class MyDatabaseConfig {

  //=========================================================================================================
  // DATA SOURCE
  //=========================================================================================================
  @Bean
  @ConfigurationProperties("my.spring.datasource")
  public DataSource dataSource() {
    return DataSourceBuilder.create().type(DriverManagerDataSource.class).build();
  }

}
