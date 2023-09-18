package egaz.egaz.repository;

import egaz.egaz.model.Venue;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VenueRepo extends JpaRepository<Venue,Integer> {
}
