/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package codsoftgrp.codsoftproject3;

/**
 *
 * @author hp
 */
import javax.swing.SwingUtilities;



public class MainClass {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new SMSInterface().setVisible(true);
            }
        });
    }
}

