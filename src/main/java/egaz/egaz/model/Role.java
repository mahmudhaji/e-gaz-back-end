package egaz.egaz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collector;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer roleId;
    public String roleName;

//
//    @ManyToOne
//    @JoinColumn(name="userid")
//    private User user;

    public Role(String roleName){this.roleName=roleName;}
    @ManyToMany(mappedBy = "roles")
    private Collection<User> users=new HashSet<>();

}
