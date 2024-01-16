package ge.agrotech.apiutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Sort;

@Data
// TODO the fields must be filled from spring sort objects
@AllArgsConstructor
public class Order {
    private String field;
    private String direction;

    public Order(Sort.Order springOrder) {
        this.field = springOrder.getProperty();
        this.direction = springOrder.getDirection().name();
    }
}
