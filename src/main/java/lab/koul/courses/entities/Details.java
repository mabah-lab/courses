package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
public class Details {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private String quantity;
    @ManyToOne
    private Course course;
    @ManyToOne
    private Liste liste;

}
