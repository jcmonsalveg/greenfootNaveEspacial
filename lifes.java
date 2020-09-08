import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Clase que permite establecer el valor inicial de vidas y detener el juego cuando se pierden todas las vidas
 * 
 * @author Juan Carlos Monsalve G
 * @version 1.5 08.09.2020
 */
public class lifes extends Actor
{
    //Atributos,Parámetros o propiedades de la clase lifes.
    private int c = 5;

    //Método Constructor
    public lifes(){}

    //Métodos Get a set

    public int getLifes()
    {
        return this.c;
    }//fin delgetLifes

    //procedemiento de escucha
    public void act(){}    

    //Procedimiento de edición de la cantidad de las vidas.
    public void Disminuir(){
        this.c--;
        if(this.c == 0)
        {
            Greenfoot.stop();
        }

    }//fin de Disminuir
}//Fin de la clase
