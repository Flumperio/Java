/*
 * Created by JFormDesigner on Fri Dec 05 17:34:01 CET 2025
 */

package Tema_3.Ejercicio_Integrador;

import Tema_3.Ejercicios_Colecciones.Alumnos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;


public class CrearVentana extends JPanel {
    private JFrame frame;
    private JLabel etiqueta;
    private JButton boton;
    private JComboBox <Object> desplegablePersonal;

    public CrearVentana(String titulo, int ancho, int alto, List<Alumno> alumnosESO, List<PersonalAdmin> adminsCentro, List<PersonalProfesor> profCentro) {
        // Crear el JFrame
        frame = new JFrame(titulo);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(ancho, alto);

        // Crear componentes
        etiqueta = new JLabel("Ver sueldo del personal", SwingConstants.CENTER);
        boton = new JButton("Click");
        desplegablePersonal = new JComboBox<>();

        //Logica
        for (PersonalProfesor prof : profCentro) {
            desplegablePersonal.addItem(prof);
        }

        // Evento del botón
        boton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                etiqueta.setText("¡Botón presionado!");
            }
        });

        // Layout con GroupLayout
        GroupLayout layout = new GroupLayout(frame.getContentPane());
        frame.getContentPane().setLayout(layout);
        layout.setAutoCreateGaps(true);
        layout.setAutoCreateContainerGaps(true);

        // Configuración horizontal
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.CENTER)
                        .addComponent(etiqueta)
                        .addComponent(boton)
                        .addComponent(desplegablePersonal)
        );

        // Configuración vertical
        layout.setVerticalGroup(
                layout.createSequentialGroup()
                        .addComponent(etiqueta)
                        .addGap(30)
                        .addComponent(boton)
                        .addGap(30)
                        .addComponent(desplegablePersonal)
        );

        // Mostrar ventana centrada
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}