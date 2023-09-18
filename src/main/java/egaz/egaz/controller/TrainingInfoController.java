package egaz.egaz.controller;

import egaz.egaz.model.TrainingInfo;
import egaz.egaz.service.TrainingInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/trainingInfo")
public class TrainingInfoController {
    @Autowired
    private TrainingInfoService trainingInfoService;
    @PostMapping("/add")
    public TrainingInfo addTrainingInfo(@RequestBody TrainingInfo t){
        return trainingInfoService.addTrainingInfo(t);
    }
    @GetMapping("/all")
    public List<TrainingInfo> getAll(TrainingInfo t){
        return trainingInfoService.getAll(t);
    }
    @GetMapping("/{id}")
    public Optional<TrainingInfo> getById(@PathVariable Integer id){
        return trainingInfoService.getById(id);
    }
    @DeleteMapping("/delete")
    public void deleteTrainingInfo(@PathVariable Integer id){
        trainingInfoService.deleteTrainingInfo(id);
    }
    @PutMapping("/update")
    public TrainingInfo update(@RequestBody TrainingInfo t,@RequestParam Integer id){
        return trainingInfoService.update(t,id);
    }
}
