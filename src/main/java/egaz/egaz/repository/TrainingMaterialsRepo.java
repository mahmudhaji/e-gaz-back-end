package egaz.egaz.repository;

import egaz.egaz.model.TrainingMaterials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TrainingMaterialsRepo extends JpaRepository<TrainingMaterials,Long> {
}
