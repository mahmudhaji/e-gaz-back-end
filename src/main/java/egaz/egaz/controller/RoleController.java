package egaz.egaz.controller;

import egaz.egaz.model.Role;
import egaz.egaz.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    @Autowired
    private RoleService roleService;
    @PostMapping("/add")
    public Role addRole(@RequestBody Role r){
        return roleService.addRole(r);
    }
    @GetMapping
    public List<Role> getRole(Role r){
        return roleService.getRole(r);
    }
    @GetMapping("/{id}")
    public Optional<Role> getAllRole(@PathVariable Integer id){
        return roleService.getAllRole(id);
    }
    @DeleteMapping("/{id}")
    public void deleteRole(@PathVariable Integer id){
        roleService.deleteRole(id);
    }
    @PutMapping("/update")
    public Role updateRole(@RequestBody Role r,@RequestParam Integer id){
        return roleService.updateRole(r,id);
    }
}
