import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Calculadora");
        frame.setContentPane(new Calculadora().menuPrincipal);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(640,480);
        frame.setIconImage(new ImageIcon("./assets/icon/icon.png").getImage());
        frame.pack();
        frame.setVisible(true);
    }
}