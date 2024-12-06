package TP;

import bandeau.Bandeau;
import java.awt.Color;

public class Clignotant extends Effet {
    private int repetitions;
    private int delai;

    public Clignotant(Bandeau bandeau, int repetitions, int delai) {
        super(bandeau);
        this.repetitions = repetitions;
        this.delai = delai;
    }

    @Override
    public void jouer() {
        for (int i = 0; i < repetitions; i++) {
            bandeau.setForeground(Color.BLACK);
            bandeau.sleep(delai);
            bandeau.setForeground(Color.WHITE);
            bandeau.sleep(delai);
        }
    }
}
