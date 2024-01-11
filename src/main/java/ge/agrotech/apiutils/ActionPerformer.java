package ge.agrotech.apiutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActionPerformer {
    private Long id;
    private UserInfo userInfo;
    private ApplicationInfo applicationInfo;
}
