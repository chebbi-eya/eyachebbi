package tn.esprit.eyachebbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.eyachebbi.Entity.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Long> {
}