/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.object;

import com.codideep.app.generic.ObjectAttribute;
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
        
        imageIconFront = new ImageIcon("");
        imageIconLeft = new ImageIcon("");
        imageIconRight = new ImageIcon("");
        imageIconDestroy = new ImageIcon("");
        
        this.dimension[0] = 90;
        this.dimension[1] = 60;
        
        this.component.setBounds(0, 0, this.dimension[0], this.dimension[1]);
        this.component.setIcon(imageIconFront);
    }

    public void setImageFront() {
        this.component.setIcon(imageIconFront);
    }

    public void setImageLeft() {
        this.component.setIcon(imageIconLeft);
    }

    public void setImageRight() {
        this.component.setIcon(imageIconRight);
    }

    public void setImageDestroy() {
        this.component.setIcon(imageIconDestroy);
    }
}
