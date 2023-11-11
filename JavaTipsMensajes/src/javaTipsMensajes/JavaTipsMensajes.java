package javaTipsMensajes;

import java.awt.EventQueue;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JavaTipsMensajes {

    private JFrame frame;

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JavaTipsMensajes window = new JavaTipsMensajes();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public JavaTipsMensajes() {
        initialize();
    }

    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 450, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.getContentPane().setLayout(new FlowLayout());

        JButton btn1 = new JButton("Botón 1");
        frame.getContentPane().add(btn1);

        JButton btn2 = new JButton("Botón 2");
        frame.getContentPane().add(btn2);

        btn1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Has pulsado el Botón 1");
                mostrarMensaje("¡¡¡Premio has dado con el Botón 1!!!");
            }
        });

        btn2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("has pulsado el Botón 2");
                mostrarMensaje("¡¡¡Premio has dado con el Botón 2!!!");
            }
        });

        btn1.setToolTipText("Haz clic aquí para activar el Botón 1");
        btn2.setToolTipText("Haz clic aquí para activar el Botón 2");
    }

    private void mostrarMensaje(String mensaje) {
        JOptionPane.showMessageDialog(frame, mensaje, "Aviso", JOptionPane.INFORMATION_MESSAGE);
    }
}
