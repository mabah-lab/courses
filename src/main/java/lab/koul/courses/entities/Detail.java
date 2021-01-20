package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString

//@Table(uniqueConstraints = @UniqueConstraint(columnNames = {"course-id","id"}))
public class Detail {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false,length = 20)
    private String status;
    @Column(length = 20)
    private String quantity;
    @ManyToOne
    private Produit produit;
    @ManyToOne
//    @JoinColumn(name = "course-id")
    private Course course;

}
