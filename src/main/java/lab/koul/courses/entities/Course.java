package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Course implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private String name;
    @ManyToOne
    private Famille famille;
    @ManyToOne
    private Categorie categorie;
}
