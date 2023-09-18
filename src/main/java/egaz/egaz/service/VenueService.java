package egaz.egaz.service;

import egaz.egaz.model.Venue;
import egaz.egaz.repository.VenueRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VenueService {
    @Autowired
    private VenueRepo venueRepo;
    public Venue addVenue(Venue v){
        return venueRepo.save(v);
    }
    public List<Venue> getAllVenue(Venue v){
        return venueRepo.findAll();
    }
    public Optional<Venue> getById(Integer id){
        return venueRepo.findById(id);
    }
    public void deleteVenue(Integer id){
        venueRepo.findById(id);
    }
    public Venue updateVenue(Venue v,Integer id){
        v.setVenueId(id);
        return venueRepo.save(v);
    }
}
