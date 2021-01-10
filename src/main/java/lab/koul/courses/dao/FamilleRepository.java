package lab.koul.courses.dao;

import lab.koul.courses.entities.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface FamilleRepository extends JpaRepository<Famille,Long> {

}
