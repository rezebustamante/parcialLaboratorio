/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parcialbustamanterodrigo;

/**
 *
 * @author Punto Digital
 */
public class Motor {
    boolean enciendeMotor = false;
    
    public void apagarMotor()
    {
        if (enciendeMotor == true)
        {
            enciendeMotor = false;
            System.out.println("El motor ha sido apagado");
        }
        else 
        {
            System.out.println("El motor ha sido apagado");
        }
    }
    
    public void encenderMotor()
    {
        if (enciendeMotor == false)
        {
            enciendeMotor = true;
            System.out.println("El motor ha sido encendido");
        }
        else 
        {
            System.out.println("El motor está encendido");
        }
    }

    public boolean getEnciendeMotor() {
        return enciendeMotor;
    }
}
