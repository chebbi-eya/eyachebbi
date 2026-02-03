package tn.esprit.eyachebbi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.eyachebbi.Entity.Bloc;

@Repository
public interface BlocRepository extends JpaRepository<Bloc, Long> {
}