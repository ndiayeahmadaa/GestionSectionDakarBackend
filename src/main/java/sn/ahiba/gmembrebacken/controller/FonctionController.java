package sn.ahiba.gmembrebacken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.entities.Fonction;
import sn.ahiba.gmembrebacken.exception.BusinessResourceException;
import sn.ahiba.gmembrebacken.services.IFonctionService;

@CrossOrigin("*")
@RestController
@RequestMapping("/fonctions")
public class FonctionController {

    @Autowired
    private IFonctionService iFonctionService;

    @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "code", required = false) String code) {
        return ResponseEntity.ok().body(iFonctionService.findAll());
    }
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Fonction fonction) {

        return new ResponseEntity<>(iFonctionService.save(fonction).get(), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Fonction fonction) {
        return ResponseEntity.ok().body(iFonctionService.update(fonction));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(iFonctionService.getById(id));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteByCode(@RequestParam(value = "code") String code,
                                          @RequestParam(value = "logical", defaultValue = "false") boolean logical) {
        if (code != null && !code.isEmpty()) {

            boolean isDeleted = iFonctionService.deleteByCode(code);
            return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        throw new BusinessResourceException("Le champ code est requis", HttpStatus.BAD_REQUEST);
    }
}
