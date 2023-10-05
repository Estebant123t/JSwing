/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jframepoo;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFramePOO {
    public static void main(String[] args) {
        Ventanita();
    }
    public static void Ventanita(){
        
        JFrame frame = new JFrame("Ejemplo de WindowListener");
        frame.setBounds(350,100,700, 200);
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);

        JPanel panel = new JPanel();
        JButton button = new JButton("Haz clic aquí");
        panel.add(button);
        frame.add(panel);

        /*panel.addMouseListener(new MouseAdapter(){
            @Override
            public void mouseEntered(MouseEvent e){
                System.out.println("Hola");
            }
        });*/
        button.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                System.out.println("Clic en el boton.");
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                System.out.println("Mouse entro en el boton.");
            }

            @Override
            public void mouseExited(MouseEvent e) {
                System.out.println("Mouse salio del boton.");
            }
        });

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                int confirmacion = javax.swing.JOptionPane.showConfirmDialog(
                        null,
                        "¿Estás seguro de que quieres salir?",
                        "Confirmar cierre",
                        javax.swing.JOptionPane.YES_NO_OPTION
                );

                if (confirmacion == javax.swing.JOptionPane.YES_OPTION) {
                    System.exit(0);
                }
            }
        });

        frame.setVisible(true);
    }
    
}




