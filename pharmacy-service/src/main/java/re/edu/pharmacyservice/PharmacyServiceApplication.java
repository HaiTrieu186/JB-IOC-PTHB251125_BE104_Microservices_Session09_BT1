package re.edu.pharmacyservice;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PharmacyServiceApplication {

    @Value("${app.branch-name}")
    private String branchName;

    @Value("${app.hotline}")
    private String hotline;

    public static void main(String[] args) {
        SpringApplication.run(PharmacyServiceApplication.class, args);
    }

    @Bean
    public CommandLineRunner run() {
        return args -> {
            System.out.println("=========================================");
            System.out.println("    KET NOI CONFIG SERVER THANH CONG!    ");
            System.out.println("    Ten chi nhanh: " + branchName);
            System.out.println("    Hotline ho tro: " + hotline);
            System.out.println("=========================================");
        };
    }
}
