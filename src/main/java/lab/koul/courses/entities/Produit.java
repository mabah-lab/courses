package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Produit implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false,length = 25)
    private String name;
    @ManyToOne
    private Famille famille;
    @ManyToOne
    private Categorie categorie;
}
