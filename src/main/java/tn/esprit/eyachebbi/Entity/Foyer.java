package tn.esprit.eyachebbi.Entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
@Entity
public class Foyer {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long idFoyer;
	    private String nomFoyer;
	    private Long capaciteFoyer;
	    @OneToOne
	    private Universite universite;
	    
	    @OneToMany(mappedBy = "foyer")
	    private List<Bloc> blocs;
}
