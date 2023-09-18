package egaz.egaz.controller;

import egaz.egaz.dto.UserRequest;
import egaz.egaz.dto.UserResponse;
import egaz.egaz.model.User;
import egaz.egaz.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ModelMapper modelMapper;
    @PostMapping("/add")
    public ResponseEntity<?> addUser(@RequestBody UserRequest u){
        User urs=userService.addUser(u);
        UserResponse user =modelMapper.map(urs,UserResponse.class);
        return ResponseEntity.ok(user);
    }
    @GetMapping("/all")
    public List<User> getAllUser(User u){
        return userService.getAllUser(u);
    }
    @GetMapping("/{id}")
    public Optional<User> getById(@PathVariable Integer id){
        return userService.getById(id);
    }
    @DeleteMapping("/delete")
    public void deleteUser(@PathVariable Integer id){
        userService.deleteUser(id);
    }
    @PutMapping("/update")
    public User updateUser(User u,Integer id){
        return userService.updateUser(u, id);
    }

}
