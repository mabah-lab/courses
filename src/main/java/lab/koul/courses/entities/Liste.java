package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Liste implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private Date date;
    private String status;
    @OneToMany(mappedBy = "liste")
    private Collection<Details> details;

}
