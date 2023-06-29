package fr.memebattle.ressources.service;

import fr.memebattle.ressources.modele.Image;
import fr.memebattle.ressources.repository.ImageRepository;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ImageService {
    private final ImageRepository imageRepository;

    public ImageService(ImageRepository imageRepository) {
        this.imageRepository = imageRepository;
    }

    // Méthode pour charger une image
    public Image uploadImage(MultipartFile file) throws IOException {
        // Logique pour charger l'image, par exemple enregistrer l'image dans un répertoire ou dans une base de données
        // et retourner l'objet Image correspondant
        // Exemple :
        String fileName = file.getOriginalFilename();
        byte[] imageBytes = file.getBytes();
        Image image = new Image(fileName, imageBytes);
        return imageRepository.save(image);
    }

    // Méthode pour afficher une image
    public byte[] getImageBytes(String imageId) {
        // Logique pour récupérer les données de l'image à partir de l'identifiant de l'image
        // et renvoyer les données de l'image sous forme de tableau d'octets
        // Exemple :
        Optional<Image> optionalImage = imageRepository.findById(new ObjectId(imageId));
        if (optionalImage.isPresent()) {
            return optionalImage.get().getImageBytes();
        }
        return null;
    }
    // Méthode pour classer les images
        public List<Image> rankImages() {
            // Logique pour classer les images en fonction des votes ou d'autres critères
            // et renvoyer la liste des images classées
            // Exemple :
            return imageRepository.findAllByOrderByVotesDesc();
        }

    public Image getRandomImage() {
        List<Image> imagesGlobales = imageRepository.findAll();
        List<Image> imagesTemplates = new ArrayList<>();
        for(Image  image : imagesGlobales){
            if(image.isTemplate()){
                imagesTemplates.add(image);
            }
        }

        int randomIndex = (int) (Math.random() * imagesTemplates.size());

        return imagesTemplates.get(randomIndex);
    }





    // Getters et setters
}
