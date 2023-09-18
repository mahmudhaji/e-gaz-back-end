package egaz.egaz.repository;

import egaz.egaz.model.StaffTraining;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StaffTrainingRepo extends JpaRepository<StaffTraining,Integer> {
}
