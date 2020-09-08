import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Clase que establece el tablero de finalización del juego
 * 
 * @author Juan Carlos Monsalve G
 * @version 1.5 08.09.2020
   */

public class JuegoTerminado extends Actor
{
    GreenfootImage imagen;
    String mensaje;
    
    //Método constructor    
    public JuegoTerminado()
    {
        imagen = new GreenfootImage(512,390);
        Color color = getImage().getColor();
        imagen.setColor(color.RED);
        imagen.drawString("Juego Terminado", 0, 100);
        setImage(imagen);
        Greenfoot.stop();
    }//Fin del constructor
    
    //Métodos getter and setter
    
    public GreenfootImage getImagen()
    {
        return this.imagen;
    }

    public void setImagen(GreenfootImage imagen)
    {
        this.imagen = imagen;
    }

    public String getMensaje()
    {
        return this.mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }
    
    public void act() 
    {
    }    
}
