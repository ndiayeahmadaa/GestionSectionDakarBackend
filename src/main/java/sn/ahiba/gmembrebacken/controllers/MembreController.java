package sn.ahiba.gmembrebacken.controllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sn.ahiba.gmembrebacken.entities.Membre;
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
            @ApiResponse(responseCode = "200", content = {
                    @Content(schema = @Schema(implementation = Membre.class), mediaType = "application/json") }),
            @ApiResponse(responseCode = "204", description = "Il y a pas de mebres trouvés", content = {
                    @Content(schema = @Schema()) }),
            @ApiResponse(responseCode = "500", content = { @Content(schema = @Schema()) }) })
   @GetMapping()
    public ResponseEntity<?> findAll(@RequestParam(value = "matricule",required = false) String matricule){
       return ResponseEntity.ok().body(imembreService.findAll());
   }


}
