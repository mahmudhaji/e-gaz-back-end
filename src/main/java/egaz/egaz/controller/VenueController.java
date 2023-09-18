package egaz.egaz.controller;

import egaz.egaz.model.Venue;
import egaz.egaz.service.VenueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/venue")
public class VenueController {
    @Autowired
    private VenueService venueService;
    @PostMapping("add")
    public Venue addVenue(@RequestBody Venue v){
        return venueService.addVenue(v);
    }
    @GetMapping("/all")
    public List<Venue> getAllVenue(Venue v){
        return venueService.getAllVenue(v);
    }
    @GetMapping("/{id}")
    public Optional<Venue> getById(@PathVariable Integer id){
        return venueService.getById(id);
    }
    @DeleteMapping("/delete")
    public void deleteVenue(@PathVariable Integer id){
        venueService.deleteVenue(id);
    }
    @PutMapping("/update")
    public Venue updateVenue(@RequestBody Venue v,@RequestParam Integer id){
        return venueService.updateVenue(v,id);
    }
}
