package poo;
import edu.princeton.cs.algs4.Draw;
public class Circulo {

    public static final int VERDE = 0;
    public static final int PRETO = 1;
    public static final int AZUL = 2; //enumeracoes = enums
    private double x;
    private double y;
    private double r;
    private Cores cor;

    public Circulo(double x, double y, double r, Cores cor) {
        this.x = x;
        this.y = y;
        this.r = r;
        //TODO switch case para garantir cores válidas
        this.cor = cor;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void desenhar(Draw d){
        d.setPenColor(cor.codigocor);
        d.filledCircle(this.x,this.y,this.r);
    }

}
