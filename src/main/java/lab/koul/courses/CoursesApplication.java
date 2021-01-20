package lab.koul.courses;

import lab.koul.courses.services.InitialisationServ;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication
public class CoursesApplication  implements CommandLineRunner {
    @Autowired
    private InitialisationServ initialisationServ;

    public static void main(String[] args) {
        SpringApplication.run(CoursesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        initialisationServ.initCourse();


    }
}
