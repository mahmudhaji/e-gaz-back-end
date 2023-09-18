package egaz.egaz.controller;

import egaz.egaz.model.StaffTraining;
import egaz.egaz.service.StaffTrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/staffTraining")
public class StaffTrainingController {
    @Autowired
    private StaffTrainingService staffTrainingService;
    @PostMapping("add")
    public StaffTraining addStaffTraining(@RequestBody StaffTraining st){
        return staffTrainingService.addStaffTraining(st);
    }
    @GetMapping("/all")
    public List<StaffTraining> getAllStaffTraining(StaffTraining st){
        return staffTrainingService.getAllStaffTraining(st);
    }
    @GetMapping("/{id}")
    public Optional<StaffTraining> getById(@PathVariable Integer id){
        return staffTrainingService.getById(id);
    }
    @DeleteMapping("/{id}")
    public void deleteStaffTraining(@PathVariable Integer id){
        staffTrainingService.deleteStaffTraining(id);
    }
    @PutMapping("/update")
    public StaffTraining updateStaffTraining(@RequestBody StaffTraining st,@RequestParam Integer id){
        return staffTrainingService.updateStaffTraining(st,id);
    }
}
