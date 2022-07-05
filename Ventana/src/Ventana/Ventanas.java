
package Ventana;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class Ventanas extends JFrame{
     JPanel panel;
    public Ventanas (){
        this.setSize(500, 500);
        this.setTitle("Mundial 2021");
        this.setLocationRelativeTo(null);
        //this.setResizable(true);
        this.setMinimumSize(new Dimension (100,100));
        this.getContentPane().setBackground(Color.black);
        
        iniciarFunciones();
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        
    }
    
    private void iniciarFunciones(){
       
       colocarPanel();
       //colocarEtiqueta();
       //colocarBoton();
       //colocarRadioBotones();
       //colocarBotAvtivacion();
       colocarCajaText ();
    }
    
    private void colocarPanel(){
        panel = new JPanel();

        this.getContentPane().add(panel);
       //panel.setBackground(Color.green);
        panel.setLayout(null);
        
    }
    
    private void colocarEtiqueta(){
        JLabel etiqueta = new JLabel();
       
       panel.add(etiqueta);
       etiqueta.setText("Mundial 2022");
       etiqueta.setBounds(85, 10, 300, 80);
       etiqueta.setForeground(Color.black);
       //etiqueta.setOpaque(true);
       //etiqueta.setBackground(Color.black);
       etiqueta.setHorizontalAlignment(SwingConstants.CENTER);
       etiqueta.setFont(new Font("chiller",3,30));
       
       //Etiqueta imagen
       ImageIcon imagen = new ImageIcon ("Balon.jpg");
       JLabel etiqueta2 = new JLabel();
       etiqueta2.setBounds(120, 80, 300, 300);
       
       etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(etiqueta2.getWidth(), etiqueta2.getHeight(), Image.SCALE_SMOOTH)));
       panel.add(etiqueta2);
    }
    
    private void colocarBoton(){
        //Boton1 de texto
        JButton boton1=new JButton();
        boton1.setBounds(50, 50, 120, 50);
        panel.add(boton1);
        boton1.setText("click");
        boton1.setEnabled(true);
        boton1.setMnemonic('q');
        boton1.setForeground(Color.white);
        boton1.setBackground(Color.black);
        boton1.setFont(new Font("cooper black",3,30));
        
        //Boton2 de imagen
        JButton boton2 = new JButton();
        boton2.setBounds(50, 150, 200, 100);
        panel.add(boton2);
        //boton2.setOpaque(true);
        boton2.setBackground(Color.orange);
        ImageIcon clickAqui = new ImageIcon("Click.png");
        boton2.setIcon(new ImageIcon(clickAqui.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));
        
        //Boton3 
        
        JButton boton3 = new JButton ();
        boton3.setBounds(50, 300, 120, 50);
        panel.add(boton3);
        boton3.setBorder(BorderFactory.createLineBorder(Color.black,4, false));
    }
    
    private void colocarRadioBotones(){
        JRadioButton radioboton1 = new JRadioButton("opcion1",false);    
        radioboton1.setBounds(50, 100, 100, 50);
        panel.add(radioboton1);
        
        JRadioButton radioboton2 = new JRadioButton("opcion1",false);
        radioboton2.setBounds(50, 150, 100, 50);
        panel.add(radioboton2);
        
        JRadioButton radioboton3 = new JRadioButton("opcion1",false);
        radioboton3.setBounds(50, 200, 100, 50);
        panel.add(radioboton3);
        
        ButtonGroup gruporadiobotones= new ButtonGroup();
        gruporadiobotones.add(radioboton1);
        gruporadiobotones.add(radioboton2);
        gruporadiobotones.add(radioboton3);
        
    }
    
    private void colocarBotAvtivacion(){
        JToggleButton botonact1= new JToggleButton ("Clave 1", false);
        botonact1.setBounds(50, 100, 100, 40);
        panel.add(botonact1);
        
        JToggleButton botonact2= new JToggleButton ("Clave 2", false);
        botonact2.setBounds(50, 150, 100, 40);
        panel.add(botonact2);
        
        JToggleButton botonact3= new JToggleButton ("Clave 3", false);
        botonact3.setBounds(50, 200, 100, 40);
        panel.add(botonact3);
        
        ButtonGroup botonesActivacion = new ButtonGroup();
        botonesActivacion.add(botonact1);
        botonesActivacion.add(botonact2);
        botonesActivacion.add(botonact3);
    }
   
    private void colocarCajaText (){
        JTextField cajaTexto = new JTextField ();
        cajaTexto.setBounds(50, 50, 200, 30);
        cajaTexto.setText("Hola");
        
        panel.add(cajaTexto);
    }
}
