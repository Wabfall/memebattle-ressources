package fr.memebattle.ressources.modele;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "images")
public class Image {
    @Id
    private String id;

    @Field("file_name")
    private String fileName;

    @Field("image_bytes")
    private byte[] imageBytes;

    private int votes;

    public Image() {
    }

    public Image(String fileName, byte[] imageBytes) {
        this.fileName = fileName;
        this.imageBytes = imageBytes;
        this.votes = 0;
    }

    public String getId() {
        return id;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public byte[] getImageBytes() {
        return imageBytes;
    }

    public void setImageBytes(byte[] imageBytes) {
        this.imageBytes = imageBytes;
    }

    public int getVotes() {
        return votes;
    }

    public void setVotes(int votes) {
        this.votes = votes;
    }
}
