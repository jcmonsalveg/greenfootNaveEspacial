import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que implementa el tablero
 * 
 * @author Juan Carlos Monsalve G
 * @version 1.5 08.09.2020
 */

public class Tablero extends Actor
{
    private GreenfootImage imagen;//Variable que permite tener una variable que administra una imagen
    private int contador;
    private String mensaje;// variable que recibe el menasaje de forma global

    //Método constructor

    public Tablero(int contador, String mensaje)
    {
        this.contador = contador;
        this.mensaje = mensaje;
        this.imagen = new GreenfootImage(250,150);
        funcionalidad();
    }

    //Métodos getter  and setter

    public GreenfootImage getImagen()
    {
        return this.imagen;
    }

    public void setImagen(GreenfootImage imagen)
    {
        this.imagen = imagen;
    }

    public int getContador()
    {
        return this.contador;
    }

    public void setContador(int contador)
    {
        this.contador = contador;
    }

    public String getMensaje()
    {
        return this.mensaje;
    }

    public void setMensaje(String mensaje)
    {
        this.mensaje = mensaje;
    }

    //Método de escucha indefinida
    public void act() 
    {

    }    

    //Procedimiento de funcionalidad general
    private void funcionalidad()
    {
        Color color = getImage().getColor();
        this.imagen.setColor(color.YELLOW);
        dibujar();
    }//fin funcionalidad

    //Procedimiento para dibujar los mensajes enviados a la instancia de tipo tablero
    private void dibujar()
    {
        imagen.clear();
        imagen.drawString(getMensaje()+": "+getContador(), 20, 20);
        setImage(imagen);
    }//Fin dibujar

    //Procedimiento para sumar 1 a la varible contador
    public void incrementar()
    {
        this.contador++;
        dibujar();
    }//fin incrementar

    //procedimiento para restar 1 a la variable contador
    public void decrementar()
    {
        this.contador--;
        dibujar();
    }//fin decrementar
}//fin de la clase
