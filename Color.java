
public class Color
{

    private int rojo;
    private int verde;
    private int azul;

    public Color( int rojo, int verde, int azul )
    {
        this.rojo = rojo;
        this.verde = verde;
        this.azul = azul;
    }

    public int getRojo( )
    {
        return rojo;
    }

    public int getVerde( )
    {
        return verde;
    }

    public int getAzul( )
    {
        return azul;
    }

    public void setRojo( int pRojo )
    {
        rojo = pRojo;
    }

    public void setVerde( int pVerde )
    {
        verde = pVerde;
    }

    public void setAzul( int pAzul )
    {
        azul = pAzul;
    }

}