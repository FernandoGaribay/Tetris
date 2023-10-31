package main;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

public class TetrisTablero extends JPanel {

    private int WIDTH;
    private int HEIGHT;
    private int GAP;

    private int tamanioCelda;

    private int tablero[][];

    public TetrisTablero() {
        this.GAP = 4;
        this.tamanioCelda = 25;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        this.WIDTH = (int) getPreferredSize().getWidth();
        this.HEIGHT = (int) getPreferredSize().getHeight();

        int numCeldasH = WIDTH / tamanioCelda;
        int numCeldasV = HEIGHT / tamanioCelda;
        int residuoH = WIDTH % tamanioCelda;
        int residuoV = HEIGHT % tamanioCelda;
        int margenH = residuoH / 2;
        int margenV = residuoV / 2;

        for (int i = 0; i < numCeldasH; i++) { // Filas
            for (int j = 0; j < numCeldasV; j++) { // Columnas
                int x = margenH + i * tamanioCelda + GAP / 2;
                int y = margenV + j * tamanioCelda + GAP / 2;

                g.setColor(new Color(240, 240, 240));
                g.fillRect(x, y, tamanioCelda - GAP, tamanioCelda - GAP);
            }
        }
    }
}
