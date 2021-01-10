package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Famille implements Serializable {
    @Id @GeneratedValue
    private Long id;
    @Column(nullable = false,length = 25)
    private String name;
}
