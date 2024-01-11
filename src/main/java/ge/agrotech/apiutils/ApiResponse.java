package ge.agrotech.apiutils;


import lombok.Data;

import java.util.List;

//TODO უნდა გაკეთდეს კონსტრუქტორი საჭირო ფილდების შესაბამისად ანუ დავწეროტ ხელით!!!
@Data
public class ApiResponse {
    private Boolean success;
    private Object data;
    private RestPaging paging;
    private List<Order> sort;
}
