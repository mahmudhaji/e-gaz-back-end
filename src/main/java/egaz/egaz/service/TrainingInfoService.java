package egaz.egaz.service;

import egaz.egaz.model.TrainingInfo;
import egaz.egaz.repository.TrainingInfoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingInfoService {
    @Autowired
    private TrainingInfoRepo trainingInfoRepo;

    public TrainingInfo addTrainingInfo(TrainingInfo t){
        return trainingInfoRepo.save(t);
    }
    public List<TrainingInfo> getAll(TrainingInfo t){
        return trainingInfoRepo.findAll();
    }
    public Optional<TrainingInfo> getById(Integer id){
        return trainingInfoRepo.findById(id);
    }
    public void deleteTrainingInfo(Integer id){
        trainingInfoRepo.deleteById(id);
    }
       public TrainingInfo update(TrainingInfo t,Integer id){
        t.setId(id);
        return trainingInfoRepo.save(t);
       }
}
