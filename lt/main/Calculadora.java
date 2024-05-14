import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import static java.lang.Math.*;
import org.jdesktop.swingx.*;

public class Calculadora {
    public JPanel menuPrincipal = new JPanel(new GridBagLayout());

    private JXTextField numero1TextField = new JXTextField();
    private JXTextField numero2TextField = new JXTextField();

    private JLabel resultadoLbl = new JLabel("Resultado: ");
    private JLabel ingresar_numero = new JLabel("Ingrese los números");

    private JButton SUMAButton = new JButton("+");
    private JButton RESTAButton1 = new JButton("-");
    private JButton xButton = new JButton("x");
    private JButton button2 = new JButton("/");
    private JButton cuadrado = new JButton("x^2");
    private JButton cubo = new JButton("x^3");
    private JButton tan = new JButton("tan");
    private JButton sen = new JButton("sen");
    private JButton cos = new JButton("cos");
    private JButton log = new JButton("log");
    private JButton potencia = new JButton("x^y");
    private JButton eu = new JButton("e");
    private JButton pi = new JButton("π");
    private JButton raiz = new JButton("√");
    private JButton abs = new JButton("abs");
    private JButton porcentaje = new JButton("%");

    GridBagConstraints gbc = new GridBagConstraints();

    Color colorBoton = new Color(235, 28, 36);
    Color colorTextBoton = new Color(255, 255, 255);
    Dimension dimensionBoton = new Dimension(50, 50);

    public Calculadora() {
        menuPrincipal.setBackground(Color.BLACK);
        gbc.insets = new Insets(5, 5, 5, 5);

        // textfield1
        numero1TextField.setPrompt("Número 1");
        numero1TextField.setPreferredSize(new Dimension(Integer.MAX_VALUE, 80));
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 0;
        gbc.weighty = 1.0;
        menuPrincipal.add(numero1TextField, gbc);

        // textfield2
        numero2TextField.setPrompt("Número 2");
        numero2TextField.setPreferredSize(new Dimension(Integer.MAX_VALUE, 80));
        gbc.gridy = 2;
        menuPrincipal.add(numero2TextField, gbc);

        // Ingresa los numeros
        ingresar_numero.setForeground(Color.WHITE);
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        menuPrincipal.add(ingresar_numero, gbc);

        // Suma
        SUMAButton.setBackground(colorBoton);
        SUMAButton.setForeground(colorTextBoton);
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;
        gbc.fill = GridBagConstraints.BOTH;
        menuPrincipal.add(SUMAButton, gbc);

        // Potencia
        potencia.setBackground(colorBoton);
        potencia.setForeground(colorTextBoton);
        gbc.gridx = 2;
        menuPrincipal.add(potencia, gbc);

        // log
        log.setBackground(colorBoton);
        log.setForeground(colorTextBoton);
        gbc.gridx = 3;
        menuPrincipal.add(log, gbc);

        // e
        eu.setBackground(colorBoton);
        eu.setForeground(colorTextBoton);
        gbc.gridx = 4;
        menuPrincipal.add(eu, gbc);

        //division
        button2.setBackground(colorBoton);
        button2.setForeground(colorTextBoton);
        gbc.gridx = 1;
        gbc.gridy = 1;
        menuPrincipal.add(button2, gbc);

        //cubo
        cubo.setBackground(colorBoton);
        cubo.setForeground(colorTextBoton);
        gbc.gridx = 2;
        menuPrincipal.add(cubo, gbc);

        //tan
        tan.setBackground(colorBoton);
        tan.setForeground(colorTextBoton);
        gbc.gridx = 3;
        menuPrincipal.add(tan, gbc);

        //pi
        pi.setBackground(colorBoton);
        pi.setForeground(colorTextBoton);
        gbc.gridx = 4;
        menuPrincipal.add(pi, gbc);

        //multiplicacion
        xButton.setBackground(colorBoton);
        xButton.setForeground(colorTextBoton);
        gbc.gridx = 1;
        gbc.gridy = 2;
        menuPrincipal.add(xButton, gbc);

        //cuadrado
        cuadrado.setBackground(colorBoton);
        cuadrado.setForeground(colorTextBoton);
        gbc.gridx = 2;
        menuPrincipal.add(cuadrado, gbc);

        //sen
        sen.setBackground(colorBoton);
        sen.setForeground(colorTextBoton);
        gbc.gridx = 3;
        menuPrincipal.add(sen, gbc);

        //raiz
        raiz.setBackground(colorBoton);
        raiz.setForeground(colorTextBoton);
        gbc.gridx = 4;
        menuPrincipal.add(raiz, gbc);

        //resta
        RESTAButton1.setBackground(colorBoton);
        RESTAButton1.setForeground(colorTextBoton);
        gbc.gridx = 1;
        gbc.gridy = 3;
        menuPrincipal.add(RESTAButton1, gbc);

        //porcentaje
        porcentaje.setBackground(colorBoton);
        porcentaje.setForeground(colorTextBoton);
        gbc.gridx = 2;
        menuPrincipal.add(porcentaje, gbc);

        //cos
        cos.setBackground(colorBoton);
        cos.setForeground(colorTextBoton);
        gbc.gridx = 3;
        menuPrincipal.add(cos, gbc);

        //abs
        abs.setBackground(colorBoton);
        abs.setForeground(colorTextBoton);
        gbc.gridx = 4;
        menuPrincipal.add(abs, gbc);

        //resultado
        resultadoLbl.setForeground(Color.WHITE);
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        menuPrincipal.add(resultadoLbl, gbc);

        SUMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                int resultado, numero1, numero2;
                numero1 = Integer.parseInt(n1);
                numero2 = Integer.parseInt(n2);
                resultado = numero1 + numero2;

                String r3;
                r3 = Integer.toString(resultado);
                resultadoLbl.setText("Resultado: " + r3);

            }
        });
        RESTAButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                int resultado, numero1, numero2;
                numero1 = Integer.parseInt(n1);
                numero2 = Integer.parseInt(n2);
                resultado = numero1 - numero2;

                String r3;
                r3 = Integer.toString(resultado);
                resultadoLbl.setText("Resultado: " + r3);

            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                int resultado, numero1, numero2;
                numero1 = Integer.parseInt(n1);
                numero2 = Integer.parseInt(n2);
                resultado = numero1 * numero2;

                String r3;
                r3 = Integer.toString(resultado);
                resultadoLbl.setText("Resultado: " + r3);

            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();
                float resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = round((numero1 / numero2) * 1000f) / 1000f;
                if (numero2 == 0) {
                    resultadoLbl.setText("Resultado: Math Error");
                } else {
                    String r3;
                    r3 = Float.toString(resultado);
                    resultadoLbl.setText("Resultado: " + r3);
                }

            }
        });
        porcentaje.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                float resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = (numero1 * numero2) / 100;

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        cuadrado.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = pow(numero1, 2);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        cubo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = pow(numero1, 3);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        potencia.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = pow(numero1, numero2);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        cos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = cos(numero1);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        sen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = sin(numero1);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
            }
        });
        tan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Operación realizada");
                String n1;
                n1 = numero1TextField.getText();
                String n2 = numero2TextField.getText();

                double resultado, numero1, numero2;
                numero1 = Float.parseFloat(n1);
                numero2 = Float.parseFloat(n2);
                resultado = tan(numero1);

                String r3;
                r3 = Float.toString(round(resultado * 100f) / 100f);
                resultadoLbl.setText("Resultado: " + r3);
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
