package egaz.egaz.controller;

import egaz.egaz.model.Training;
import egaz.egaz.service.TrainingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/training")
public class TrainingController {
    @Autowired
    private TrainingService trainingService;
    @PostMapping("add")
    public Training addTraining(@RequestBody Training t){
        return trainingService.addTraining(t);
    }
    @GetMapping("/all")
    public List<Training> getAllTraining(Training t){
        return trainingService.getAllTraining(t);
    }
    @GetMapping("/{id}")
    public Optional<Training> getById(@PathVariable Integer id){
        return trainingService.getById(id);
    }
    @DeleteMapping("delete")
    public void deleteTraining(@PathVariable Integer id){
        trainingService.deleteTraining(id);
    }
    @PutMapping("/update")
    public Training updateTraining(@RequestBody Training t,@RequestParam Integer id){
        return trainingService.updateTraining(t,id);
    }
}
