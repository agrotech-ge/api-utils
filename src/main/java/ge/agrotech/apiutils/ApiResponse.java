package ge.agrotech.apiutils;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class ApiResponse {
    private Boolean success;
    private Object data;
    private RestPaging paging;
    private ApiError[] errors;
}
