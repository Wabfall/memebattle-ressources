package fr.memebattle.ressources.modele;

public class RequeteSalon {
    private String salonName;
    private int maxJoueurs;
    private String gameMode;

    // Constructeur, getters et setters

    public RequeteSalon(String salonName, int maxJoueurs, String gameMode) {
        this.salonName = salonName;
        this.maxJoueurs = maxJoueurs;
        this.gameMode = gameMode;
    }

    public String getSalonName() {
        return salonName;
    }

    public void setSalonName(String salonName) {
        this.salonName = salonName;
    }

    public int getMaxJoueurs() {
        return maxJoueurs;
    }

    public void setMaxJoueurs(int maxJoueurs) {
        this.maxJoueurs = maxJoueurs;
    }

    public String getGameMode() {
        return gameMode;
    }

    public void setGameMode(String gameMode) {
        this.gameMode = gameMode;
    }
}
