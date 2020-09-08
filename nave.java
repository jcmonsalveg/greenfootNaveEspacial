import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que implementa la nave, con sus variables y métodos o procedimientos
 * 
 * @author Juan Carlos Monsalve G
 * @version 1.5 08.09.2020
 */

public class nave extends Actor
{
    //Atributos,Parámetros o propiedades de la clase.

    //Constantes declaradas
    private static final int UP=0;//constante
    private static final int DOWN=1;//constante
    private static final int LEFT=2;//constante
    private static final int RIGHT=3;//constante

    //Varables declaras
    private int direccionDisparo = 2;// direccion del disparo de acuerdo al movimiento que lleva la nave
    private boolean isShot =false;//bandera que permite entrar al estado de disparo.

    //Método constructor
    public nave(){}

    //Métodos getter and setter
    public int getDireccionDisparo(){
        return this.direccionDisparo;
    }

    public void setDireccionDisparo(int nuevaDireccionDisparo){
        this.direccionDisparo = nuevaDireccionDisparo;
    }

    public int getDOWN(){
        return this.DOWN;
    }

    public int getLEFT(){
        return this.LEFT;
    }

    public int getRIGHT(){
        return this.RIGHT;
    }

    public int getUP(){
        return this.UP;
    }

    //Procedemiento de escucha
    public void act()
    {
        moverNave();
        setShot(getDireccionDisparo());
    }//fin del act

    //Control de mover la nave bajo apoyo de otros procedemientos
    private void moverNave()
    {
        if(Greenfoot.isKeyDown("up")){
            setDireccion(getUP());
            setDireccionDisparo(0);
        }
        if(Greenfoot.isKeyDown("down")){
            setDireccion(getDOWN());
            setDireccionDisparo(1);
        }
        if(Greenfoot.isKeyDown("left")){
            setDireccion(getLEFT());
            setDireccionDisparo(3);
        }
        if(Greenfoot.isKeyDown("right")){
            setDireccion(getRIGHT());
            setDireccionDisparo(2);
        }

    }//fin de moverNave

    //Procedimeinto de disparos de la nave
    public void setShot(int disparo)
    {
        if(isShot && Greenfoot.isKeyDown("z")){
            shot bala = new shot(getDireccionDisparo());
            getWorld().addObject(bala, getX(),getY());
            this.isShot=false;
        }
        if(!isShot && !Greenfoot.isKeyDown("x")){
            this.isShot=true;
        }

    }//fin de setShot

    //Procedimiento que permite dar dirección a la nave
    public void setDireccion(int direccion){
        switch(direccion){
            case 0:
            setRotation(270);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()-10);
            }else{
                setLocation(getX(), getY()-2);
            }
            break;

            case 1:
            setRotation(90);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX(), getY()+10);
            }else{
                setLocation(getX(), getY()+2);
            }
            break;

            case 2:
            setRotation(180);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()-10, getY());
            }else{
                setLocation(getX()-2, getY());
            }
            break;

            case 3:
            setRotation(0);
            if(Greenfoot.isKeyDown("space"))
            {
                setLocation(getX()+10, getY());
            }else{
                setLocation(getX()+2, getY());
            }
            break;
        }
    }//fin procedimiento de direccion

}//fin clase
