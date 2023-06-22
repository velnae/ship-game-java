package com.codideep.app.generic;

import java.awt.*;

public class Screen {


    private int width;

    private int height;

    public Screen(){
        Toolkit toolkit = Toolkit.getDefaultToolkit();

        // Obtiene la dimensión de la pantalla
        Dimension screenSize = toolkit.getScreenSize();

        // Obtiene la altura y el ancho del monitor
        this.width = (int) screenSize.getWidth();
        this.height = (int) screenSize.getHeight();

        // Imprime la altura y el ancho del monitor
        System.out.println("Ancho del monitor: " + this.width);
        System.out.println("Altura del monitor: " + this.height);
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
}
