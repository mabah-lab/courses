package lab.koul.courses.services;

import lab.koul.courses.dao.*;
import lab.koul.courses.entities.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Date;

@Service
@Transactional
public class InitialisationServImpl implements InitialisationServ {
    @Autowired
    FamilleRepository familleRepository;
    @Autowired
    CategorieRepository categorieRepository;
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    DetailRepository detailRepository;

    @Override
    public void initCourse() {


        //remplissage de la table Famille
        Famille f1=familleRepository.save(new Famille(null,"Supermaché"));
        Famille f2=familleRepository.save(new Famille(null,"Epicerie"));
        Famille f3=familleRepository.save(new Famille(null,"Boucherie"));
        Famille f4=familleRepository.save(new Famille(null,"poisonnerie"));

        Categorie c1= categorieRepository.save(new Categorie(null,"Boisson"));
        Categorie c2= categorieRepository.save(new Categorie(null,"Fruit"));
        Categorie c3= categorieRepository.save(new Categorie(null,"Legume"));
        Categorie c4= categorieRepository.save(new Categorie(null,"Sucrerie"));
        Categorie c5= categorieRepository.save(new Categorie(null,"Autres"));
        Categorie c6= categorieRepository.save(new Categorie(null,"Viande"));

        Produit p1= produitRepository.save(new Produit(null,"Pomme",f1,c2));
        Produit p2= produitRepository.save(new Produit(null,"Clementine",f1,c2));
        Produit p3= produitRepository.save(new Produit(null,"Aubergine",f1,c3));
        Produit p4= produitRepository.save(new Produit(null,"Pomme de terre",f1,c3));
        Produit p5= produitRepository.save(new Produit(null,"pain",f2,c5));
        Produit p6= produitRepository.save(new Produit(null,"Poisson",f4,c5));
        Produit p7= produitRepository.save(new Produit(null,"Viande de boeuf",f3,c6));
        Produit p8= produitRepository.save(new Produit(null,"Limonade",f1,c1));
        Produit p9= produitRepository.save(new Produit(null,"Fanta",f1,c1));
        Produit p10= produitRepository.save(new Produit(null,"Poulet",f1,c6));

        Course cs1= courseRepository.save(new Course(null, new Date(),false, null));
        Course cs2= courseRepository.save(new Course(null, new Date(),false, null));

        Detail d1= detailRepository.save(new Detail(null,"To Do","10 pcs",p1,cs1));
        Detail d2= detailRepository.save(new Detail(null,"To Do","6 pcs",p6,cs1));
        Detail d3= detailRepository.save(new Detail(null,"To Do","2.5 Kg",p7,cs1));
        Detail d4= detailRepository.save(new Detail(null,"To Do","5 L",p8,cs1));

        Detail d5= detailRepository.save(new Detail(null,"To Do","1 Kg",p4,cs2));
        Detail d6= detailRepository.save(new Detail(null,"To Do","2 pcs",p3,cs2));
        Detail d7= detailRepository.save(new Detail(null,"To Do","3 Kg",p10,cs2));
        Detail d8= detailRepository.save(new Detail(null,"To Do","5 canettes",p4,cs2));

        Detail d9= detailRepository.save(new Detail(null,"Done","2 bouteilles",p9,cs1));
        Detail d10= detailRepository.save(new Detail(null,"Done","2 pcs",p5,cs1));
        Detail d11= detailRepository.save(new Detail(null,"Done","7 pcs",p7,cs1));

         familleRepository.findAll().forEach(famille -> {
            System.out.println(famille.toString());
        });
        courseRepository.findAll().forEach(crse->{
            System.out.println(crse.toString());
        });


    }
}
