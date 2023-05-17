package sn.ahiba.gmembrebacken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Dahira;
import sn.ahiba.gmembrebacken.exception.BusinessResourceException;
import sn.ahiba.gmembrebacken.services.IDahiraService;

@CrossOrigin("*")
@RestController
@RequestMapping("/dahiras")
public class DahiraController {

    @Autowired
    private IDahiraService iDahiraService;

    @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "code", required = false) String code) {
        return ResponseEntity.ok().body(iDahiraService.findAll());
    }
    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Dahira dahira) {

        return new ResponseEntity<>(iDahiraService.save(dahira).get(), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Dahira dahira) {
        return ResponseEntity.ok().body(iDahiraService.update(dahira));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(iDahiraService.getById(id));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteByCode(@RequestParam(value = "code") String code,
                                          @RequestParam(value = "logical", defaultValue = "false") boolean logical) {
        if (code != null && !code.isEmpty()) {

            boolean isDeleted = iDahiraService.deleteByCode(code);
            return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        throw new BusinessResourceException("Le champ code est requis", HttpStatus.BAD_REQUEST);
    }
}
