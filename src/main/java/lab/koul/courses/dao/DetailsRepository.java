package lab.koul.courses.dao;

import lab.koul.courses.entities.Details;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<Details,Long> {
}
