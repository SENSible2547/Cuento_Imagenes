package main;
import modelito.Modelo;
import vista.CuentoVista;
import controlador.CuentoController;

public class CuentoApp {
    public static void main(String[] args) {
        // Instanciar el modelo
        Modelo modelo = new Modelo();

        // Instanciar la vista
        CuentoVista vista = new CuentoVista();

        // Instanciar el controlador y conectar el modelo y la vista
        CuentoController controlador = new CuentoController(modelo, vista);

        // Hacer que la vista sea visible
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                vista.setVisible(true);
            }
        });
    }
}
