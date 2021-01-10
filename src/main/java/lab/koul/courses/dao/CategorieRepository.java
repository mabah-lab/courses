package lab.koul.courses.dao;

import lab.koul.courses.entities.Categorie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CategorieRepository extends JpaRepository<Categorie,Long> {

}
