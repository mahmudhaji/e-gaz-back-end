package egaz.egaz.dto;

import lombok.Data;

@Data
public class StaffRequest {
    private String staffPassword;
    public String staffName;
    public Long employeeNo;
}
