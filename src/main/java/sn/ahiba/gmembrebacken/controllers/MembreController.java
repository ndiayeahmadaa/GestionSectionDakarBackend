package sn.ahiba.gmembrebacken.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.services.ImembreService;
import sn.ahiba.gmembrebacken.serviveImp.MembreServiceImp;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private ImembreService imembreService;

   @GetMapping("/liste")
    public List<Membre> membres(){
       return imembreService.findAllMembres();
   }
   @PostMapping("/save")
    public ResponseEntity<Membre> createMembre(@RequestBody Membre membre){
       return ResponseEntity.ok().body(imembreService.saveMembres(membre));
   }

}
