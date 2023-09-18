package egaz.egaz.service;

import egaz.egaz.dto.UserRequest;
import egaz.egaz.model.User;
import egaz.egaz.repository.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;

    public User addUser(UserRequest u){
        User user=modelMapper.map(u, User.class);
        return userRepo.save(user);
    }
    public List<User> getAllUser(User u){
        return userRepo.findAll();
    }
    public Optional<User> getById(Integer id){
        return userRepo.findById(id);
    }
    public void deleteUser(Integer id){
        userRepo.deleteById(id);
    }
    public User updateUser(User u,Integer id){
        u.setUserId(id);
        return userRepo.save(u);
    }
}
