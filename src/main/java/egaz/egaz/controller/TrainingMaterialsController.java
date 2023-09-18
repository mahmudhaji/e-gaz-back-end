package egaz.egaz.controller;

import egaz.egaz.model.TrainingMaterials;
import egaz.egaz.service.TrainingMaterialsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/trainingMaterials")
public class TrainingMaterialsController {
    @Autowired
    private TrainingMaterialsService trainingMaterialsService;
    @PostMapping("/add")
    public TrainingMaterials addTrainingMaterials(@RequestBody TrainingMaterials t){
        return trainingMaterialsService.addTrainingMaterials(t);
    }
    @GetMapping("/all")
    public List<TrainingMaterials> getTrainingMaterials(TrainingMaterials t){
        return trainingMaterialsService.getTrainingMaterials(t);
    }
    @GetMapping("/{id}")
    public Optional<TrainingMaterials> getById(@PathVariable Long id){
        return trainingMaterialsService.getById(id);
    }
    @DeleteMapping("/delete")
    public void deleteTrainingMaterials(@PathVariable Long id){
        trainingMaterialsService.deleteTrainingMaterials(id);
    }
    @PutMapping("/update")
    public TrainingMaterials update(@RequestBody TrainingMaterials t,@RequestParam Long id){
        return trainingMaterialsService.update(t,id);
    }
}
