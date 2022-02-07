package javastart.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JavastartSpringDataJpaApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JavastartSpringDataJpaApplication    .class, args);
        BikeDto bike1 = new BikeDto(1L, "Kross Esker 4.0, 29 cali męski", "KRS12345", 30, 100);
        BikeService bikeService = context.getBean(BikeService.class);
        bikeService.add(bike1);
        double payment = bikeService.rentForHours(1L, 5, "ABC999");
        System.out.println("Należność do zapłaty za wypożyczenie: " + payment);
        bikeService.returnBike(1L);
    }

}
