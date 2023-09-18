package egaz.egaz.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@Entity
@AllArgsConstructor
@Data
@NoArgsConstructor
public class User {
    @Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer userId;
    public String userName;
    public String userPassword;
    public String email;
//
//    @OneToMany(mappedBy = "user")
//    private List<Role> roles=new ArrayList<>();

//    @OneToMany(mappedBy = "user")
//    private List<Staff> staffMembers=new ArrayList<>();

    @ManyToMany(fetch = FetchType.EAGER,
            cascade = {CascadeType.PERSIST,
                    CascadeType.MERGE, CascadeType.DETACH})

    @JoinTable(name="userRole",
    joinColumns = @JoinColumn(name="userid", referencedColumnName="userId"),
            inverseJoinColumns = @JoinColumn(name="role_id", referencedColumnName="roleId" )
    )
    private Collection<Role> roles = new HashSet<>();
}
