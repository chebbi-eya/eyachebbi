package tn.esprit.eyachebbi.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
@Entity
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idBloc;
    
    private String nomBloc;
    private Long capaciteBloc;
    
    @ManyToOne
    private Foyer foyer;
    
    @OneToMany(mappedBy = "bloc")
    private List<Chambre> chambres;
}