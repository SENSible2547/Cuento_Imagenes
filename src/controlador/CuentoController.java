package controlador;

import vista.CuentoVista;
import modelito.Modelo;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class CuentoController {
    private Modelo modelo;
    private CuentoVista vista;

    public CuentoController(Modelo modelo, CuentoVista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        // Configurar listeners para los botones
        this.vista.addMarvelButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarCuentoMarvel();
            }
        });

        this.vista.addDcButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarCuentoDc();
            }
        });

        this.vista.addOsitoButtonListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                mostrarCuentoOsito();
            }
        });
    }

    private void mostrarCuentoMarvel() {
        modelo.mv(); // Establecer la fábrica de Marvel en el modelo
        actualizarVista();
    }

    private void mostrarCuentoDc() {
        modelo.dc(); // Establecer la fábrica de DC en el modelo
        actualizarVista();
    }

    private void mostrarCuentoOsito() {
        modelo.Osito(); // Establecer la fábrica de Osito en el modelo
        actualizarVista();
    }

    private void actualizarVista() {
        vista.setInicio(modelo.getInicio().getTipo());
        vista.setNudo(modelo.getNudo().getTipo());
        vista.setDesenlace(modelo.getDesenlace().getTipo());
        
        ArrayList<String> imagenes = modelo.getImagenes().getTipo();
        vista.setImagenes(imagenes);
        
        }
    }

