package egaz.egaz.service;

import egaz.egaz.model.Role;
import egaz.egaz.repository.RoleRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.plaf.PanelUI;
import java.util.List;
import java.util.Optional;

@Service
public class RoleService {
    @Autowired
    private RoleRepo roleRepo;
    public Role addRole(Role r){
        return roleRepo.save(r);
    }
    public List<Role> getRole(Role r){
        return roleRepo.findAll();
    }
    public Optional<Role> getAllRole(Integer id){
        return roleRepo.findById(id);
    }
    public void deleteRole(Integer id){
        roleRepo.deleteById(id);
    }
    public Role updateRole(Role r,Integer id){
        r.setRoleId(id);
        return roleRepo.save(r);
    }

}
