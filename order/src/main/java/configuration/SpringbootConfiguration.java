package configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import model.Customer;
import repository.CustomerRepository;
import repository.PaymentRepository;



@SpringBootApplication
@ComponentScan({"repository","controller","service"})
@EnableMongoRepositories(basePackageClasses = PaymentRepository.class)
public class SpringbootConfiguration {
	public static void main(String[] args) throws Exception {
        SpringApplication.run(SpringbootConfiguration.class, args);
    }
}
