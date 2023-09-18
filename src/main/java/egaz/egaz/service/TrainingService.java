package egaz.egaz.service;

import egaz.egaz.model.Training;
import egaz.egaz.repository.TrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TrainingService {
    @Autowired
    private TrainingRepo trainingRepo;
    public Training addTraining(Training t){
        return trainingRepo.save(t);
    }
    public List<Training> getAllTraining(Training t){
        return trainingRepo.findAll();
    }
    public Optional<Training> getById(Integer id){
        return trainingRepo.findById(id);
    }
    public void deleteTraining(Integer id){
        trainingRepo.deleteById(id);
    }
    public Training updateTraining(Training t,Integer id){
        t.setId(id);
        return trainingRepo.save(t);
    }
}
