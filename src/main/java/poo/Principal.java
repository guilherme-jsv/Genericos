package poo;
import edu.princeton.cs.algs4.Draw;
import edu.princeton.cs.algs4.DrawListener;

public class Principal implements DrawListener {

    private Draw desenho;

    public Principal(){
        this.desenho = new Draw();
        this.desenho.setXscale(0, 800);
        this.desenho.setYscale(0, 800);
        this.desenho.enableDoubleBuffering();

        this.desenho.addListener(this);
    }

    public void desenharTela(){
        Circulo c = new Circulo(400, 400, 100, Cores.AZUL);
        this.desenho.clear();
        c.desenhar(this.desenho);
        this.desenho.show();
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.desenharTela();
    }

    @Override
    public void mousePressed(double v, double v1) {
        Circulo c = new Circulo(v, v1, 100, Cores.AZUL);
        c.desenhar(desenho);
        this.desenho.show();
    }

    @Override
    public void mouseDragged(double v, double v1) {

    }

    @Override
    public void mouseReleased(double v, double v1) {

    }

    @Override
    public void mouseClicked(double v, double v1) {

    }

    @Override
    public void keyTyped(char c) {

    }

    @Override
    public void keyPressed(int i) {

    }

    @Override
    public void keyReleased(int i) {

    }
}
