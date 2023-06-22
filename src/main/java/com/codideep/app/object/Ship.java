/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.object;

import com.codideep.app.generic.ObjectAttribute;
import com.codideep.app.generic.Screen;

import javax.swing.ImageIcon;
import javax.swing.JLabel;


/**
 *
 * @author KAAF0
 */
public class Ship extends ObjectAttribute {

    private ImageIcon imageIconFront = null;
    private ImageIcon imageIconLeft = null;
    private ImageIcon imageIconRight = null;
    private ImageIcon imageIconDestroy = null;

    public Ship() {
        this.component = new JLabel();
        Screen screen = new Screen();

        this.dimension[0] = 60;
        this.dimension[1] = 60;

        this.position[0] = (screen.getWidth() / 2) - (this.dimension[0] / 2);
        this.position[1] = screen.getHeight() - (this.dimension[1] + 50);

        imageIconFront = new ImageIcon("assets/spaceship.png");
        imageIconLeft = new ImageIcon("assets/spaceship_left.png");
        imageIconRight = new ImageIcon("assets/spaceship_right.png");
        imageIconDestroy = new ImageIcon("");

        imageIconFront = new ImageIcon(imageIconFront.getImage().getScaledInstance(this.dimension[0], this.dimension[1], java.awt.Image.SCALE_SMOOTH));
        imageIconRight = new ImageIcon(imageIconRight.getImage().getScaledInstance(this.dimension[0]+10, this.dimension[1]+10, java.awt.Image.SCALE_SMOOTH));
        imageIconLeft = new ImageIcon(imageIconLeft.getImage().getScaledInstance(this.dimension[0]+10, this.dimension[1]+10, java.awt.Image.SCALE_SMOOTH));

        this.component.setBounds(this.position[0], this.position[1], this.dimension[0], this.dimension[1]);
        this.component.setIcon(imageIconFront);
    }

    public JLabel getComponent() {
        return this.component;
    }

    public void setImageFront() {
        this.component.setIcon(imageIconFront);
    }

    public void setImageLeft() {
        this.component.setIcon(imageIconLeft);
    }

    public void setImageRight() {

        System.out.println("Icono : "+ imageIconRight.getImage().toString());
        this.component.setIcon(imageIconRight);
    }

    public void setImageDestroy() {
        this.component.setIcon(imageIconDestroy);
    }
}
