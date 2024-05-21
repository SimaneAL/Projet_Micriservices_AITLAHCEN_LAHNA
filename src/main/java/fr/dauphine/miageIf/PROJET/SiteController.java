package fr.dauphine.miageIf.PROJET;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/sites")
public class SiteController {
    @Autowired
    private SiteRepository siteRepository;

    @GetMapping
    public List<Site> getAllSites() {
        return siteRepository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Site> getSiteById(@PathVariable Long id) {
        return siteRepository.findById(id)
                .map(site -> ResponseEntity.ok(site))
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Site createSite(@RequestBody Site site) {
        return siteRepository.save(site);
    }

    public Site findByName(@PathVariable String site_name){
        return siteRepository.findByName(site_name);
    }

//    @PutMapping("/{id}")
//    public ResponseEntity<Site> updateSite(@PathVariable Long id, @RequestBody Site siteDetails) {
//        return siteRepository.findById(id)
//                .map(site -> {
//                    site.setNomSite(siteDetails.getNomSite());
//                    site.setInfoGeographique(siteDetails.getInfoGeographique());
//                    site.setSiteParalympique(siteDetails.getSiteParalympique());
//                    return ResponseEntity.ok(siteRepository.save(site));
//                })
//                .orElse(ResponseEntity.notFound().build());
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<Void> deleteSite(@PathVariable Long id) {
//        return siteRepository.findById(id)
//                .map(site -> {
//                    siteRepository.delete(site);
//                    return ResponseEntity.ok().build();
//                })
//                .orElse(ResponseEntity.notFound().build());
//    }
}
