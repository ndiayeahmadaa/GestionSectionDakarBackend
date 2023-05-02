package sn.ahiba.gmembrebacken.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.services.IMembreService;
@CrossOrigin("*")
@RestController
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private IMembreService imembreService;

   @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "matricule",required = false) String matricule){
       return ResponseEntity.ok().body(imembreService.findAll());
   }
   @PostMapping()
    public ResponseEntity<?> create(@RequestBody Membre membre){
       return ResponseEntity.ok().body(imembreService.save(membre).get());
   }
   @PutMapping
    public ResponseEntity<?> update(@RequestBody Membre membre){
       return ResponseEntity.ok().body(imembreService.update(membre));
   }

   @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id){
       return ResponseEntity.ok().body(imembreService.getById(id));
   }
}
