package egaz.egaz.service;

import egaz.egaz.model.TrainingMaterials;
import egaz.egaz.repository.TrainingMaterialsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingMaterialsService {
    @Autowired
    private TrainingMaterialsRepo trainingMaterialsRepo;
    public TrainingMaterials addTrainingMaterials(TrainingMaterials t){
        return trainingMaterialsRepo.save(t);
    }
    public List<TrainingMaterials> getTrainingMaterials(TrainingMaterials t){
        return trainingMaterialsRepo.findAll();
    }
    public Optional<TrainingMaterials> getById(Long id){
        return trainingMaterialsRepo.findById(id);
    }
    public void deleteTrainingMaterials(Long id){
        trainingMaterialsRepo.deleteById(id);
    }
    public TrainingMaterials update(TrainingMaterials t,Long id){
        t.setId(id);
        return trainingMaterialsRepo.save(t);
    }
}
