package ge.agrotech.apiutils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInfo {
    private String pId;
    private String firstName;
    private String lastName;
    private String meta;

    public UserInfo(String pId, String firstName, String lastName) {
        this.pId = pId;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
