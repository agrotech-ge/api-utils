package ge.agrotech.apiutils;

import lombok.Data;

@Data
// TODO the fields must be filled from spring sort objects
public class Sort {
    private String field;
    private Order order;

    public enum Order {
        ASC, DESC
    }
}
