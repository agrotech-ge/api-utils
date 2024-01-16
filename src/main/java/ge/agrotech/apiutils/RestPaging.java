package ge.agrotech.apiutils;

import lombok.Data;
import org.springframework.data.domain.Page;

@Data
public class RestPaging {
    private Long total;
    private Long size;
    private Long number;
}
