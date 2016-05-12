package org.cloudfoundry.samples.music;

import org.cloudfoundry.samples.music.config.data.SpringApplicationContextInitializer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.addInitializers(new SpringApplicationContextInitializer());
        application.run(args);
    }

}
