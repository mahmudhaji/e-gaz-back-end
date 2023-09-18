package egaz.egaz.dto;

import lombok.Data;

@Data
public class UserRequest {
    public String userName;
    public String userPassword;
    public String email;
    public String role;
}
