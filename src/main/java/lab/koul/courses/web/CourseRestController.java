package lab.koul.courses.web;

import lab.koul.courses.dao.CourseRepository;
import lab.koul.courses.dao.DetailRepository;
import lab.koul.courses.dao.ProduitRepository;
import lab.koul.courses.entities.Course;
import lab.koul.courses.entities.Detail;
import lab.koul.courses.entities.Produit;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.transaction.Transactional;
import java.util.ArrayList;

import java.util.List;

@RestController
public class CourseRestController {
    @Autowired
    DetailRepository detailRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    CourseRepository courseRepository;


    @PostMapping("/AddDetails")
    @Transactional
    public List<Detail> AddDetailsCourse (@RequestBody ProduitsCourse prodsCourse){

        List<Detail> listDetails= new ArrayList<>();
        prodsCourse.getProds().forEach(prod->{
            Detail detail= new Detail();
            detail.setCourse(courseRepository.getOne(prodsCourse.getIdCourse()));
            detail.setProduit(produitRepository.getOne(prod.getIdProd()));
            detail.setStatus("To Do");
            detail.setQuantity(prod.getQteProd());
            detailRepository.save(detail);
            listDetails.add(detail);
        });
        return listDetails;
    }


}
