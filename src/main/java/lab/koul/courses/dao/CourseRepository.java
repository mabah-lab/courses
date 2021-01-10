package lab.koul.courses.dao;

import lab.koul.courses.entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface CourseRepository extends JpaRepository<Course, Long> {
}
