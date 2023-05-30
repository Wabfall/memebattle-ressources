package fr.memebattle.ressources.modele;

public class Image {
    private String fileName;
    private byte[] imageBytes;
    private int votes;

    public Image() {
    }

    public Image(String fileName, byte[] imageBytes) {
        this.fileName = fileName;
        this.imageBytes = imageBytes;
        this.votes = 0;
    }

    // Getters and setters

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