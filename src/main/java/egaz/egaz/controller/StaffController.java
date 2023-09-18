package egaz.egaz.controller;

import egaz.egaz.dto.StaffRequest;
import egaz.egaz.dto.StaffResponse;
import egaz.egaz.model.Staff;
import egaz.egaz.service.StaffService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/staff")
public class StaffController {
    @Autowired
    private StaffService staffService;
    @Autowired
    public ModelMapper modelMapper;
    @PostMapping("add")
    public ResponseEntity<?> addStaff(StaffRequest s){
        Staff stf=staffService.addStaff(s);
        StaffResponse staff=modelMapper.map(stf,StaffResponse.class);
        return ResponseEntity.ok(staff);
    }
    @GetMapping("/all")
    public List<Staff> getAll(Staff s){
        return staffService.getAll(s);
    }
    @GetMapping("/{id}")
    public Optional<Staff> getById(@PathVariable Integer id){
        return staffService.getById(id);
    }
    @DeleteMapping("/delete")
    public void deleteStaff(@PathVariable Integer id){
        staffService.deleteStaff(id);
    }
    @PutMapping("/update")
    public Staff update(Staff s,Integer id){
        return staffService.update(s,id);
    }
}
