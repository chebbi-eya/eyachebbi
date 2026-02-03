package tn.esprit.eyachebbi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
@Entity
public class Universite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUniversite;
    
    private String nomUniversite;
    private String adresse;
    

    @OneToOne(mappedBy = "universite")
    private Foyer foyer;
}