package lab.koul.courses.web;

import lombok.Data;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProduitsCourse {
    private List<ProductWithQuantity> prods= new ArrayList<>();
    private Long idCourse;
}
