package ge.agrotech.apiutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;


@Data
@AllArgsConstructor
@NoArgsConstructor
//TODO checkRequiredFields მეთოდი გვჭირდება, რომელიც შეამოწმებს დევს თუ არა ფილდები დატაში
//TODO @Required
//TODO getPaging და setPaging(Pageable) როგორ იმუშავებს გამოიყენეთ სპრინგის page request
public class RequestObject<T> implements Serializable {
    private ActionPerformer performer;
    private PageRequest paging;
    private List<Order> orders;
    private T data;

    public ActionPerformer getPerformer() {
        return performer == null ? performer = new ActionPerformer() : performer;
    }

    public boolean checkRequiredFields(RequestMethodType type) {

        if (data != null) {
            List<String> fields = Arrays.stream(data.getClass().getDeclaredFields()).map(Field::getName).toList();
            Required annotation = data.getClass().getAnnotation(Required.class);
            Required.MapElement[] values = annotation.value();
            for (Required.MapElement value : values) {
                if (value.key() == type) {
                    List<String> fieldList = Arrays.stream(value.fields()).toList();
                    return new HashSet<>(fields).containsAll(fieldList);
                }
            }

            return false;
        }
        return false;
    }
}

