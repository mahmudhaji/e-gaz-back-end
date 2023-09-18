package egaz.egaz.service;

import egaz.egaz.dto.StaffRequest;
import egaz.egaz.dto.StaffResponse;
import egaz.egaz.model.Staff;
import egaz.egaz.repository.StaffRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.OffsetTime;
import java.util.List;
import java.util.Optional;

@Service
public class StaffService {
    @Autowired
    private StaffRepo staffRepo;
    @Autowired
    public ModelMapper modelMapper;
    public Staff addStaff(StaffRequest s){
        Staff staff=modelMapper.map(s,Staff.class);
        return staffRepo.save(staff);
    }
    public List<Staff> getAll(Staff s){
        return staffRepo.findAll();
    }
    public Optional<Staff> getById(Integer id){
        return staffRepo.findById(id);
    }
    public void deleteStaff(Integer id){
        staffRepo.findById(id);
    }
    public Staff update(Staff s,Integer id){
        s.setStaffId(id);
        return staffRepo.save(s);
    }
}
