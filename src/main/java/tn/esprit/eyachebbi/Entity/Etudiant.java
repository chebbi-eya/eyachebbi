package tn.esprit.eyachebbi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

import java.util.Date;
import java.util.List;
@Entity
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEtudiant;
    
    private String nomEt;
    private String prenomEt;
    private Long cin;
    private String ecole;
    
    private Date dateNaissance;
    
    @ManyToMany(mappedBy = "etudiants")
    private List<Reservation> reservations;
}
