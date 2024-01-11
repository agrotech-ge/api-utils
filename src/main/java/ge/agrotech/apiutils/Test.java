package ge.agrotech.apiutils;

import lombok.Data;

@Required(
        {@Required.MapElement(key = RequestMethodType.POST, fields = {"field1"}),
                @Required.MapElement(key = RequestMethodType.GET, fields = {"field1", "field2"})}
)
@Data
public class Test {
    private String field1;
    private String field2;

}
