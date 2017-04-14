package it.imolinfo.javacurse2017.Slide5_1.ConvertitoreTemperatura;

/**
 * Created by francesca on 13/04/17.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ConvertitoreTemperatura extends JFrame implements ActionListener {
    JButton btnConverti;
    JLabel lbTempCelsius, lbTempKelvin;
    JTextField txtTempCelsius, txtTempKelvin;
    JPanel pannello, pann1, pann2;

    public ConvertitoreTemperatura() {
        pannello = new JPanel();
        pann1 = new JPanel(new GridLayout(0,1));
        pann2 = new JPanel();
        txtTempCelsius = new JTextField("",10);
        txtTempKelvin = new JTextField("",10);
        lbTempCelsius = new JLabel("Temperatura in Celsius");
        lbTempKelvin = new JLabel("Temperatura in Kelvin");
        btnConverti = new JButton("Converti Temperatura");
        pann1.add(lbTempCelsius);
        pann1.add(txtTempCelsius);
        pann1.add(lbTempKelvin);
        pann1.add(txtTempKelvin);
        pann2.add(btnConverti);
        pannello.add(pann1);
        pannello.add(pann2);
        setContentPane(pannello);
        btnConverti.addActionListener(this);
        setTitle("Convertitore Temperatura ");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        pack();
        setSize(400,150);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String str = txtTempCelsius.getText();
        if (!str.equals("")) {
            double d = Double.parseDouble(str);
            d = d + 273.15;
            txtTempKelvin.setText(""+d);
        }
    }

    public static void main(String[] args) {

        ConvertitoreTemperatura frame = new ConvertitoreTemperatura();
    }
}