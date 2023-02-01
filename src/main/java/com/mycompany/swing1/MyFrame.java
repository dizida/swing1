package com.mycompany.swing1;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sarkissian
 */
public class MyFrame extends JFrame{
    
    public MyFrame() {
        super();
        
        JFrame myWindow = new JFrame();//création de ma nouvelle fenetre
        JButton jb = new JButton("Click me!");//creation bouton
        JButton jb2 = new JButton("Coucou!");
        JPanel jp = new JPanel();
        
        jp.add(jb);
        jp.add(jb2);
        
        this.add(jp); //j'ajoute mon bouton dans ma fenetre
        
        jb.addActionListener((e) -> { System.out.println("Coucou");
        
    }); //quand le bouton va emettre un evenement de type action on capture ce qui est dans l'accolade
        
        this.setSize(200, 200);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setVisible(true);
    }
    }
    
    

