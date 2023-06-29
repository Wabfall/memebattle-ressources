/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (5.1.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package fr.memebattle.ressources.api;

import fr.memebattle.ressources.modele.api.CreerSalon;
import fr.memebattle.ressources.modele.api.RejoindreSalon;
import fr.memebattle.ressources.modele.api.ReponseCodeSalon;
import fr.memebattle.ressources.modele.api.ReponseErreur;
import fr.memebattle.ressources.modele.api.ReponseSalon;
import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import springfox.documentation.annotations.ApiIgnore;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-06-29T15:38:46.103042800-04:00[America/New_York]")
@Validated
@Api(value = "salon", description = "the salon API")
public interface SalonApi {

    /**
     * POST /salon/commencer : Commencer la partie
     *
     * @param commencerPartie joueur qui lance la partie (required)
     * @return La partie va commencer (status code 200)
     */
    @ApiOperation(value = "Commencer la partie", nickname = "commencerPartie", notes = "", tags={ "Salon", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "La partie va commencer") })
    @PostMapping(
        value = "/salon/commencer",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> commencerPartie(@ApiParam(value = "joueur qui lance la partie" ,required=true )  @Valid @RequestBody String commencerPartie);


    /**
     * POST /salon/creer : Créer un nouveau salon
     *
     * @param creerSalon Informations du salon à créer (required)
     * @return Salon créé avec succès (status code 200)
     */
    @ApiOperation(value = "Créer un nouveau salon", nickname = "creerSalon", notes = "", response = ReponseCodeSalon.class, tags={ "Salon", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Salon créé avec succès", response = ReponseCodeSalon.class) })
    @PostMapping(
        value = "/salon/creer",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ReponseCodeSalon> creerSalon(@ApiParam(value = "Informations du salon à créer" ,required=true )  @Valid @RequestBody CreerSalon creerSalon);


    /**
     * POST /salon/quitterSalon : Quitter salon
     *
     * @param leJoueurQuiQuitteLeSalon joueur qui quitte le salon (required)
     * @return le joueur quitte le salon (status code 200)
     */
    @ApiOperation(value = "Quitter salon", nickname = "quitterSalon", notes = "", tags={ "Salon", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "le joueur quitte le salon") })
    @PostMapping(
        value = "/salon/quitterSalon",
        consumes = { "application/json" }
    )
    ResponseEntity<Void> quitterSalon(@ApiParam(value = "joueur qui quitte le salon" ,required=true )  @Valid @RequestBody String leJoueurQuiQuitteLeSalon);


    /**
     * GET /salon/listeAttente : Recuperer liste attente
     *
     * @return La liste de joueurs en attente (status code 200)
     */
    @ApiOperation(value = "Recuperer liste attente", nickname = "recupererListeAttente", notes = "", response = String.class, responseContainer = "List", tags={ "Salon", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "La liste de joueurs en attente", response = String.class, responseContainer = "List") })
    @GetMapping(
        value = "/salon/listeAttente",
        produces = { "application/json" }
    )
    ResponseEntity<List<String>> recupererListeAttente();


    /**
     * POST /salon/rejoindre : Rejoindre un salon existant
     *
     * @param requeteJoueur Informations du joueur à créer (required)
     * @return Succès - Le joueur a été créé avec succès (status code 200)
     *         or Requête invalide (status code 400)
     */
    @ApiOperation(value = "Rejoindre un salon existant", nickname = "rejoindreSalon", notes = "", response = ReponseSalon.class, tags={ "Salon", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Succès - Le joueur a été créé avec succès", response = ReponseSalon.class),
        @ApiResponse(code = 400, message = "Requête invalide", response = ReponseErreur.class) })
    @PostMapping(
        value = "/salon/rejoindre",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    ResponseEntity<ReponseSalon> rejoindreSalon(@ApiParam(value = "Informations du joueur à créer" ,required=true )  @Valid @RequestBody RejoindreSalon requeteJoueur);

}
