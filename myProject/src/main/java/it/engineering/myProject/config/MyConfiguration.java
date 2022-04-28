package it.engineering.myProject.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = {
		"it.engineering.myProject",
		"it.engineering.myProject.config",
		"it.engineering.myProject.database",
	})
public class MyConfiguration {
	@Bean
	public DataSource dataSource() {
		System.out.println("=============== dataSource: ApplicationConfiguration =======================");
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/zadatak");
		dataSource.setUsername("root");
		dataSource.setPassword("kafanasudbina");
		return dataSource;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource) {
		System.out.println("jdbcTemplate created");
		 return new JdbcTemplate(dataSource);
	}
}
