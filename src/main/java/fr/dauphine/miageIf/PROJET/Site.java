package fr.dauphine.miageIf.PROJET;

import jakarta.persistence.*;
// Classe persistente representant un "tsite"
@Entity
public class Site {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nomSite;
    private String infoGeographique;
    private Boolean siteParalympique;

    // Getters et setters
}
