package poo;
import edu.princeton.cs.algs4.Draw;
import java.awt.Color;

public enum Cores {

    PRETO(Color.BLACK),
    VERDE(Color.GREEN),
    AZUL(Color.BLUE);

    public final Color codigocor;

    Cores(Color c){
        codigocor = c;
    }
}
