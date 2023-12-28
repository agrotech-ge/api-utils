package ge.agrotech.apiutils;

import java.util.Collection;

public class ApiUtils {
    public static ApiResponse createSuccessObject(Object object) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.TRUE);
        response.setData(object);

        return response;
    }

    public static ApiResponse createSuccessList(Collection objects) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.TRUE);
        response.setData(objects);

        return response;
    }

    // TODO

    public static ApiResponse createErrorList(String keyword) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.FALSE);
//        response.setErrors(errors);

        return response;
    }
}
