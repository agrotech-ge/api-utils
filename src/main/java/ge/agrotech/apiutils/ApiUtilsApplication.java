package ge.agrotech.apiutils;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class ApiUtilsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ApiUtilsApplication.class, args);
        RequestObject<Test> object = new RequestObject<>();
        System.out.println(object.checkRequiredFields(RequestMethodType.GET));
    }

}
