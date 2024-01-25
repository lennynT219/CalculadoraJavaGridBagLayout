import javax.swing.*;
import java.awt.*;
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
                System.out.println("Operación realizada");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1+numero2;



                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        RESTAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1-numero2;



                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();

                int resultado,numero1,numero2;
                numero1=Integer.parseInt(n1);
                numero2=Integer.parseInt(n2);
                resultado = numero1*numero2;




                String r3;
                r3=Integer.toString(resultado);
                resultadoLbl.setText("Resultado: "+r3);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1=numero1TextField.getText();
                String n2=numero2TextField.getText();
                float resultado,numero1,numero2;
                numero1=Float.parseFloat(n1) ;
                numero2=Float.parseFloat(n2);
                resultado = round((numero1/numero2)*1000f)/1000f;
                if (numero2 == 0){
                    resultadoLbl.setText("Resultado: Math Error");
                }else {
                    String r3;
                    r3=Float.toString(resultado);
                    resultadoLbl.setText("Resultado: "+r3);
                }

            }
        });
        porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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
                System.out.println("Operación realizada");
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

        log.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                double numero = Double.parseDouble(numero1TextField.getText());
                double resultado = Math.log(numero);
                if (!Double.isNaN(resultado)) {
                    resultadoLbl.setText("Resultado: " + resultado);
                } else {
                    resultadoLbl.setText("Error. No existe logaritmo");
                }
            }
        });
        eu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                double euler = Math.E;
                resultadoLbl.setText("Resultado: " + euler);
            }
        });

        pi.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                double npi = Math.PI;
                resultadoLbl.setText("Resultado: " + npi);
            }
        });


        raiz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                double radicando = Double.parseDouble(numero2TextField.getText());
                int indice = Integer.parseInt(numero1TextField.getText());
                double resultado = Math.pow(radicando, 1.0 / indice);
                resultadoLbl.setText("Resultado: " + resultado);
            }
        });

        abs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                double numero = Double.parseDouble(numero1TextField.getText());
                double resultado = Math.abs(numero);
                resultadoLbl.setText("Resultado: " + resultado);
            }
        });
    }
}

