package sn.ahiba.gmembrebacken;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import sn.ahiba.gmembrebacken.services.IMembreService;

@SpringBootApplication
public class GMembreBackenApplication implements CommandLineRunner {

    @Autowired
    IMembreService imembreService;
    public static void main(String[] args) {
        SpringApplication.run(GMembreBackenApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
