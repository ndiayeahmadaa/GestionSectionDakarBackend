package sn.ahiba.gmembrebacken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.services.ImembreService;

@SpringBootApplication
public class GMembreBackenApplication implements CommandLineRunner {

    @Autowired
    ImembreService imembreService;
    public static void main(String[] args) {
        SpringApplication.run(GMembreBackenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
