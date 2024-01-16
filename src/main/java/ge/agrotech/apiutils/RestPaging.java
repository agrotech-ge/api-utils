package ge.agrotech.apiutils;

import lombok.Data;


@Data
public class RestPaging {
    private Long total;
    private Long size;
    private Long number;
}
