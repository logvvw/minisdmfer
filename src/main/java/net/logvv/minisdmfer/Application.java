package net.logvv.minisdmfer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * main application
 * @author logvvw
 */
@EnableAsync
@EnableScheduling
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource("classpath:spring.xml")
public class Application
{
    private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);

    public static void main( String[] args )
    {
        SpringApplication.run(Application.class, args);

        LOGGER.info("Begin to run minisdmfer ...");
    }
}
