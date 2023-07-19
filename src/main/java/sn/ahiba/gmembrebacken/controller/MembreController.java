package sn.ahiba.gmembrebacken.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Membre;
import sn.ahiba.gmembrebacken.exception.BusinessResourceException;
import sn.ahiba.gmembrebacken.services.IMembreService;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/membres")
public class MembreController {

    @Autowired
    private IMembreService imembreService;

    @Operation(summary = "membres", tags = { "membres", "get", "filter" })
    @ApiResponses({
            @ApiResponse(responseCode = "201", content = {
                    @Content(schema = @Schema(implementation = Membre.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "204", description = "Il y a pas de mebres trouvés", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
    @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "matricule", required = false) String matricule,
                                     @RequestParam(value = "codeFonction",  required = false) String codeFonction,
                                     @RequestParam(value = "codeDahira",  required = false) String codeDahira) {
        return ResponseEntity.ok().body(imembreService.findAll(codeDahira,codeFonction));
    }

    @PostMapping()
    public ResponseEntity<?> create(@RequestBody Membre membre) {

        return new ResponseEntity<>(imembreService.save(membre).get(), HttpStatus.CREATED);
    }
    @PostMapping("/all")
    public ResponseEntity<List<Membre>> createAll(@RequestBody List<Membre> membres) {
        return ResponseEntity.ok().body(imembreService.createAll(membres));
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody Membre membre) {
        return ResponseEntity.ok().body(imembreService.update(membre));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> findById(@PathVariable Long id) {
        return ResponseEntity.ok().body(imembreService.getById(id));
    }

    @DeleteMapping
    public ResponseEntity<?> deleteByCode(@RequestParam(value = "code") String code,
            @RequestParam(value = "logical", defaultValue = "false") boolean logical) {
        if (code != null && !code.isEmpty()) {

            boolean isDeleted = imembreService.deleteByCode(code);
            return isDeleted ? new ResponseEntity<>(HttpStatus.NO_CONTENT) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        throw new BusinessResourceException("Le champ matricule est requis", HttpStatus.BAD_REQUEST);
    }
}
