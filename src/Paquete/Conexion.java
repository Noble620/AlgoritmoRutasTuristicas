package Paquete;

import java.util.ArrayList;
import java.util.List;

public class Conexion {
    private ArrayList<Integer> conexiones = new ArrayList<Integer>();
    private ArrayList<Double> valor = new ArrayList<Double>();

    public ArrayList<Double> getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor.add(valor);
    }

    public List<Integer> getConexiones() {
        return conexiones;
    }

    public void setConexiones(int conexiones) {
        this.conexiones.add(conexiones);
    }
}