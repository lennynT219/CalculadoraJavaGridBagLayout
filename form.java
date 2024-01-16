import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.lang.Math.*;

public class form1 {
    public JPanel  menuPrincipal;
    private JTextField numero1TextField;
    private JTextField numero2TextField;
    private JLabel resultadoLbl;

    private JButton SUMAButton;
    private JButton RESTAButton1;
    private JButton xButton;
    private JButton button2;
    private JButton cuadrado;
    private JButton cubo;
    private JButton tan;
    private JButton sen;
    private JButton cos;
    private JButton log;
    private JButton potencia;
    private JButton eu;
    private JButton pi;
    private JButton raiz;
    private JButton abs;
    private JButton porcentaje;


    public form1 (){
        SUMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1+numero2;


                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);

                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        RESTAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1-numero2;


                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);

                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1*numero2;


                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);

                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hola a todos");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                float resultado,numero1,numero2;
                numero1=Float.parseFloat(n1) ;
                numero2=Float.parseFloat(n2);
                resultado = round((numero1/numero2)*1000f)/1000f;


                System.out.println(n1);
                System.out.println(n2);
                System.out.println(resultado);

                String r3;
                r3=Float.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                float resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = (numero1*numero2)/100;

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        cuadrado.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = pow(numero1,2);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        cubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = pow(numero1,3);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = pow(numero1,numero2);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = cos(numero1);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        sen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = sin(numero1);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                double resultado,numero1,numero2;
                numero1=Float.parseFloat(n1);
                numero2=Float.parseFloat(n2);
                resultado = tan(numero1);

                String r3;
                r3=Float.toString(round(resultado*100f)/100f);
                resultadoLbl.setText("Resultado: "+r3);
            }
        });

    }
}

