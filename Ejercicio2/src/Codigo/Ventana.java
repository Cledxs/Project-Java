
package Codigo;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Ventana extends JFrame{
    private JPanel panel;
    private JLabel etiqueta, imagen;
    private JRadioButton rb1,rb2,rb3,rb4;
    
    public Ventana (){
       this.setSize(700, 400);
       this.setTitle("Ejercicio 2");
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(EXIT_ON_CLOSE);
       
       iniciarComponentes();
    }
    
    private void iniciarComponentes(){
        colocarPanel();
        colocarEtiqueta();
        colocarRadioBotones();
    }
    private void colocarPanel(){
        panel = new JPanel();
        panel.setLayout(null);
        this.add(panel);
        
    }
    
    private void colocarEtiqueta(){
        etiqueta = new JLabel ();
        etiqueta.setBounds(20, 5, 250, 40);
        etiqueta.setText("Escoja su anime favorito: ");
        etiqueta.setFont(new Font("cooper black",3,15));
        panel.add(etiqueta);
    }
    
    private void colocarRadioBotones(){
        rb1=new JRadioButton ();
        rb1.setText("DragonBall Z");
        rb1.setBounds(20, 40, 100, 40);
        rb1.setFont(new Font("arial",2,12));
        panel.add(rb1);
        
        rb2=new JRadioButton ();
        rb2.setText("Naruto");
        rb2.setBounds(20, 100, 100, 40);
        rb2.setFont(new Font("arial",2,12));
        panel.add(rb2);
       
        rb3=new JRadioButton ();
        rb3.setText("Pokemon");
        rb3.setBounds(20, 160, 100, 40);
        rb3.setFont(new Font("arial",2,12));
        panel.add(rb3);
        
        rb4=new JRadioButton ();
        rb4.setText("Caballeros del Zodiaco");
        rb4.setBounds(20, 220, 200, 40);
        rb4.setFont(new Font("arial",2,12));
        panel.add(rb4);
        
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(rb1);
        grupo.add(rb2);
        grupo.add(rb3);
        grupo.add(rb4);
        
        eventoDeAccion();
        
    }
    
    private void eventoDeAccion(){
        imagen = new JLabel();
        imagen.setBounds(300, 60, 350, 250);
        panel.add(imagen);
        
        final ImageIcon imagenDbz = new ImageIcon(getClass().getResource("/Imagenes/DBZ.jpg"));
        final ImageIcon imagenNaruto = new ImageIcon(getClass().getResource("/Imagenes/naruto.jpg"));
        final ImageIcon imagenPoke = new ImageIcon(getClass().getResource("/Imagenes/poke.jpg"));
        final ImageIcon imagenCaballeros = new ImageIcon(getClass().getResource("/Imagenes/caballeros.jpg"));
        
        ActionListener imagen1 = (ActionEvent e) -> {
            imagen.setIcon(new ImageIcon(imagenDbz.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        };
        rb1.addActionListener(imagen1);
        
        ActionListener imagen2 = (ActionEvent e) -> {
            imagen.setIcon(new ImageIcon(imagenNaruto.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        };
        rb2.addActionListener(imagen2);
        
        ActionListener imagen3 = (ActionEvent e) -> {
            imagen.setIcon(new ImageIcon(imagenPoke.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        };
        rb3.addActionListener(imagen3);
        
        ActionListener imagen4 = (ActionEvent e) -> {
            imagen.setIcon(new ImageIcon(imagenCaballeros.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH)));
        };
        rb4.addActionListener(imagen4);
      
    }
         
}
