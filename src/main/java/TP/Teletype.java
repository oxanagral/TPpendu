package TP;

import bandeau.Bandeau;

public class Teletype extends Effet {
    private int delai;

    public Teletype(Bandeau bandeau, int delai) {
        super(bandeau);
        this.delai = delai;
    }

    @Override
    public void jouer() {
        String message = bandeau.getMessage();
        StringBuilder affichage = new StringBuilder();

        for (char c : message.toCharArray()) {
            affichage.append(c);
            bandeau.setMessage(affichage.toString());
            bandeau.sleep(delai);
        }
    }
}
