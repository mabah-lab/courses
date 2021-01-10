package lab.koul.courses.dao;

import lab.koul.courses.entities.Liste;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ListeRepository extends JpaRepository<Liste,Long> {
}
