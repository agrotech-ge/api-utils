package ge.agrotech.apiutils;

import lombok.Data;

import java.util.List;

@Data
public class ResponseObject {
    private ApiResponse result;
    private List<ApiError> errors;
}
