package gmc.learning.spring.analysingbean;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import gmc.learning.spring.analysingbean.models.Data;

@SpringBootApplication
public class AnalysingBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(AnalysingBeanApplication.class, args);
	}
	
	@Bean(name = "datastore")
	public List<Data> getDataStore() {
		return new ArrayList<>();
	}

}
