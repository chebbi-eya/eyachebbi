package tn.esprit.eyachebbi.Entity;

import java.util.Date;
import java.util.List;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class Reservation {
    @Id
    private Long idReservation;
    
    private Date anneeUniversitaire;
    
    private boolean estValide;
    

    @ManyToOne
    private Chambre chambre;
    

    @ManyToMany
    private List<Etudiant> etudiants;
}