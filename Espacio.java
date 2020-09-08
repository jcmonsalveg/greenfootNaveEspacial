import greenfoot.*;  

/**
 * Clase ESPACIO. Diseña el espacio donde se ubican los elementos.
 * 
 * @author Juan Carlos Monsalve G
 * @version 1.5 08.09.2020
 */
public class Espacio extends World
{
    private lifes ObjetoLife; 
    private Tablero vidas;

    //Método contructor de la clase    
    public Espacio()
    {    
        super(1024, 780, 1); 
        setPaintOrder(Tablero.class, roca.class, nave.class);//aparecer en orden en el espacio
        prepare();
    }//Fin del contructor

    //Métodos getter and setter
    public Tablero getVidas()
    {
        return this.vidas;
    }

    public void setVidas(Tablero vidas){
        this.vidas = vidas;
    }

    public lifes getObjetoLife(){
        return this.ObjetoLife;
    }//fin del get

    public void setObjetoLife(lifes nuevoObjeto){
        this.ObjetoLife = nuevoObjeto;
    }// Fin  del set de objetolife

    //Procedemiento de llamado para creación de elementos del mundo
    private void prepare()
    {
        crearVidas();
        crearRocas(15);
        crearNave();
    }//Fin de prepare
    
    //Procedimientos de creación de objetos en el Espacio de trabajo
    //Procedimiento de  creación de la nave
    private void crearNave(){
        nave nave = new nave();
        addObject(nave,270,340);
    }//Fin de crearNave

    //Procedimiento de creación de rocas
    private void crearRocas(int cantidadRocas){
        for(int i = 0; i < cantidadRocas; i++){
            roca r = new roca();
            int x=Greenfoot.getRandomNumber(getWidth());
            int y=Greenfoot.getRandomNumber(getHeight());
            addObject(r, x, y);
        }
    }//fin de crearRocas

    //procedimiento de creación de vidas
    private void crearVidas()
    {
        this.ObjetoLife = new lifes();
        vidas = new Tablero(ObjetoLife.getLifes(), "Vidas -->");
        addObject(vidas, 150, 85);
    }//fin crearVidas
}//Fin de la clase
