package lab.koul.courses.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Course implements Serializable {
    @Id @GeneratedValue
    private Long id;
    private Date date;
    private boolean status;
    @OneToMany(mappedBy = "course")
    private Collection<Detail> details;

}
