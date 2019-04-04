package it.thinkopen.eserciziomvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class EsercizioMvcApplication extends SpringBootServletInitializer {
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EsercizioMvcApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(EsercizioMvcApplication.class, args);
	}
}