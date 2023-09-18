package egaz.egaz.repository;

import egaz.egaz.model.TrainingInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrainingInfoRepo extends JpaRepository<TrainingInfo,Integer> {
}
