package ge.agrotech.apiutils;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.Sort;


@SpringBootApplication
public class ApiUtilsApplication {

    public static void main(String[] args) {
        //SpringApplication.run(ApiUtilsApplication.class, args);
//        RequestObject<Test> object = new RequestObject<>();
//        System.out.println(object.checkRequiredFields(RequestMethodType.GET));

        Sort.Order springOrder = Sort.Order.asc("filed_to_sort");
        Order order = new Order(springOrder);

        System.out.println("Field: " + order.getField());
        System.out.println("Direction: " + order.getDirection());



    }

}
