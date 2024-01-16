package ge.agrotech.apiutils;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Sort;


import java.util.Collection;
import java.util.List;

public class ApiUtils {
    public static ApiResponse createSuccessObject(Object object) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.TRUE);
        response.setData(object);

        return response;
    }

    public static ApiResponse createSuccessList(Collection<Object> objects) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.TRUE);
        response.setData(objects);

        return response;
    }


    public static ApiResponse createErrorList(String keyword) {
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.FALSE);
//        response.setErrors(errors);

        return response;
    }

    // TODO უნდა გადაკეთდეს მასივად
    public static ResponseObject createSuccessList(Collection<Object> objects, Sort sort) {
        ResponseObject responseObject = new ResponseObject();
        ApiResponse response = new ApiResponse();
        response.setSuccess(Boolean.TRUE);
        List<Order> orderList = sort.get().map(
                s -> new Order(s.getProperty(), s.getDirection().toString())
        ).toList();
        response.setData(objects);
        response.setSort(orderList);
        responseObject.setResult(response);
        return responseObject;
    }

    // TODO უნდა გაკეთდეს successPage
    public static ResponseObject createSuccessPage(Page<Object> page) {
        return createSuccessList(page.getContent(), page.getSort());
    }
}
