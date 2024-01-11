package ge.agrotech.apiutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PageRequest {
    private int page = 1;
    private int size = 20;
}
