/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codideep.app.main;

import com.codideep.app.generic.Screen;
import com.codideep.app.object.Ship;
import com.codideep.app.view.FrmGeneral;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author KAAF0
 */
public class Main {

    public static void main(String[] args) {

        Ship ship = new Ship();
        JLabel component = ship.getComponent();

        FrmGeneral frmGeneral = new FrmGeneral(ship);
        Screen screen = new Screen();

        frmGeneral.setExtendedState(JFrame.MAXIMIZED_BOTH);

        frmGeneral.setSize(screen.getWidth(), screen.getHeight());
        
        frmGeneral.setVisible(true);


        component.setText("Aquí debe estar mi nave.");
//        frmGeneral.add(component);
        
        frmGeneral.repaint();
    }
}
