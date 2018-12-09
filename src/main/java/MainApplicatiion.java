import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
@SpringBootConfiguration
public class MainApplicatiion {
    public static void main(String[] args) {
        SpringApplication.run(MainApplicatiion.class,args);
    }
}
