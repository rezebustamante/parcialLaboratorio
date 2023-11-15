/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialbustamanterodrigo;

/**
 *
 * @author Punto Digital
 */
public class TanqueCombustible {
    private int capacidadTanque;
    private double cantidadCombustibleTanque = 0;

    public TanqueCombustible(int capacidad) {
        this.capacidadTanque = capacidad;
    }

    public void setCantidadCombustibleTanque(double capacidad) {
        this.cantidadCombustibleTanque = capacidad;
    }

    public double getCantidadCombustibleTanque() {
        return cantidadCombustibleTanque;
    }
    
    public void agregarCombustible(double cantidad)
    {
        if (cantidad > capacidadTanque || capacidadTanque == cantidad)
        {
            System.out.println("La cantidad a cargar sobrepasa la capacidad del tanque");
        }
        if (cantidad < capacidadTanque && cantidad > 0)
        {
            capacidadTanque+=cantidad;
            System.out.println("Se cargó: " + cantidad + "litros");
        }
        
    }
}
