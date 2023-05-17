package sn.ahiba.gmembrebacken.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Section;
import sn.ahiba.gmembrebacken.exception.BusinessResourceException;
import sn.ahiba.gmembrebacken.services.ISectionService;

@CrossOrigin("*")
@RestController
@RequestMapping("/sections")
public class SectionController {

    @Autowired
    private ISectionService iSectionService;

    @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "code", required = false) String code) {
        return ResponseEntity.ok().body(iSectionService.findAll());
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Section section) {

        return new ResponseEntity<>(iSectionService.save(section).get(), HttpStatus.CREATED);
    }
    @PutMapping
    public ResponseEntity<?> update(@RequestBody Section section) {
        return ResponseEntity.ok().body(iSectionService.update(section));
    }
    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(iSectionService.getById(id));
    }
    @DeleteMapping
    public ResponseEntity<?> deleteByCode(@RequestParam(value = "code") String code,
                                          @RequestParam(value = "logical", defaultValue = "false") boolean logical) {
        if (code != null && !code.isEmpty()) {

            boolean isDeleted = iSectionService.deleteByCode(code);
            return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        throw new BusinessResourceException("Le champ code est requis", HttpStatus.BAD_REQUEST);
    }
}
