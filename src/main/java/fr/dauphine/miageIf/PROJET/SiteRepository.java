package fr.dauphine.miageIf.PROJET;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

// Creation du JPA Repository basé sur Spring Data
public interface SiteRepository extends JpaRepository<Site, Long> {
    Site findByName(String nom_site);

    @Override
    List<Site> findAll();
}
