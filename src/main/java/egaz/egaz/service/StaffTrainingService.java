package egaz.egaz.service;

import egaz.egaz.model.StaffTraining;
import egaz.egaz.repository.StaffTrainingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StaffTrainingService {
    @Autowired
    private StaffTrainingRepo staffTrainingRepo;

    public StaffTraining addStaffTraining(StaffTraining st){
        return staffTrainingRepo.save(st);
    }
    public List<StaffTraining> getAllStaffTraining(StaffTraining st){
        return staffTrainingRepo.findAll();
    }
    public Optional<StaffTraining> getById(Integer id){
        return staffTrainingRepo.findById(id);
    }
    public void deleteStaffTraining(Integer id){
        staffTrainingRepo.deleteById(id);
    }
    public StaffTraining updateStaffTraining(StaffTraining st,Integer id){
        st.setStaffTrainingId(id);
        return staffTrainingRepo.save(st);
    }
}
