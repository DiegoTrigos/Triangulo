public class Triangulo
{
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;
    private Color colorLineas;
    private Color colorRelleno;

    public Triangulo(   )
    {
        punto1 = new Punto( 200, 50 );
        punto2 = new Punto( 300, 200 );
        punto3 = new Punto( 100, 200 );

        colorRelleno = new Color( 60, 168, 56 );
        colorLineas = new Color( 0, 83, 24 );
    }

    public Punto getPunto1( )
    {
        return punto1;
    }

    public Punto getPunto2( )
    {
        return punto2;
    }

    public Punto getPunto3( )
    {
        return punto3;
    }

    public Color getColorLineas( )
    {
        return colorLineas;
    }

    public Color getColorRelleno( )
    {
        return colorRelleno;
    }

    public double getPerimetro( )
    {
        return calcularLado1( ) + calcularLado2( ) + calcularLado3( );
    }

    public double darArea( )
    {

        double perimetro = getPerimetro( );
        double s = perimetro / 2;

        double valorLado1 = s - calcularLado1( );
        double valorLado2 = s - calcularLado2( );
        double valorLado3 = s - calcularLado3( );

        double area = Math.sqrt( s * valorLado1 * valorLado2 * valorLado3 );
        return area;
    }

    public double getAltura( )
    {
        double area = darArea( );
        double base = calcularLado1( );
        double altura = ( area / base ) * 2;
        return altura;
    }

    private double calcularLado1( )
    {

        double valorX = Math.pow( punto1.getX( ) - punto2.getX( ), 2 );
        double valorY = Math.pow( punto1.getY( ) - punto2.getY( ), 2 );

        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    private double calcularLado2( )
    {
        double valorX = Math.pow( punto2.getX( ) - punto3.getX( ), 2 );
        double valorY = Math.pow( punto2.getY( ) - punto3.getY( ), 2 );

        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    private double calcularLado3( )
    {

        double valorX = Math.pow( punto3.getX( ) - punto1.getX( ), 2 );
        double valorY = Math.pow( punto3.getY( ) - punto1.getY( ), 2 );

        double distancia = Math.sqrt( valorX + valorY );
        return distancia;
    }

    public void setPunto1( double x, double y )
    {
        punto1.setX( x );
        punto1.setY( y );
    }

    public void setPunto2( double x, double y )
    {
        punto2.setX( x );
        punto2.setY( y );
    }

    public void setPunto3( double x, double y )
    {
        punto3.setX( x );
        punto3.setY( y );
    }

    public void setColorRelleno( int rojo, int verde, int azul )
    {
        colorRelleno.setRojo( rojo );
        colorRelleno.setVerde( verde );
        colorRelleno.setAzul( azul );
    }

    public void setColorLineas( int rojo, int verde, int azul )
    {
        colorLineas.setRojo( rojo );
        colorLineas.setVerde( verde );
        colorLineas.setAzul( azul );
    }

}
