package TP;

import bandeau.Bandeau;
import java.awt.Font;

public class Zoom extends Effet {
    private int etapes;
    private int delai;

    public Zoom(Bandeau bandeau, int etapes, int delai) {
        super(bandeau);
        this.etapes = etapes;
        this.delai = delai;
    }

    @Override
    public void jouer() {
        Font fontOrigine = bandeau.getFont();
        int tailleOrigine = fontOrigine.getSize();

        for (int i = 0; i < etapes; i++) {
            bandeau.setFont(new Font(fontOrigine.getName(), fontOrigine.getStyle(), tailleOrigine + i));
            bandeau.sleep(delai);
        }

        // Restaurer la taille d'origine
        bandeau.setFont(fontOrigine);
    }
}
