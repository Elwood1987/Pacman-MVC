package logica;

public class Jugador extends Elemento {
    public Jugador(int x, int y) {
        super(x, y, "img/pacman.gif");
    }

    public void arriba() {
        this.y -= 1;
    }

    public void abajo() {
        this.y += 1;
    }

    public void derecha() {
        this.x += 1;
    }

    public void izquierda() {
        this.x -= 1;
    }
}
