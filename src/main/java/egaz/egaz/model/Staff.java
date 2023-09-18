package egaz.egaz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer staffId;
    private String staffPassword;
    public String staffName;
    public Long employeeNo;

//    @ManyToOne
//    @JoinColumns(name="user_id")
//    private User user;

}
