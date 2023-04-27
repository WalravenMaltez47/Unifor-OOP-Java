package src;

import java.util.ArrayList;
public class CalculoDaMedia {
    ArrayList <Double> nota;
    double media;
    public CalculoDaMedia(ArrayList <Double> nota){
        media = (nota.get(0)+nota.get(1)+nota.get(2)+nota.get(3)+nota.get(4)) / 3;
    }
    public double getCalculoDaMedia() {
        return media;
    }
}
