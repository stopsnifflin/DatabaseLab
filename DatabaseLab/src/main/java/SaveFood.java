import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

public class SaveFood {

    public static void main(String[] args) {
        SpringApplication.run(SaveFood.class);
    }


    private static final Logger log = LoggerFactory.getLogger(SaveFood.class);

    @Bean
    public CommandLineRunner demo(FoodRepository repository) {
        return (args) -> {
            // fetch all food items
            LoadCSV obj = new LoadCSV();


        };
    }
}

