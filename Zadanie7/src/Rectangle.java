public class Rectangle implements Figura{
    private double a;
    private double b;
    private String fillColor, borderColor;
    public Rectangle(double a, double b, String fillColor, String borderColor){
        this.a = a;
        this.b = b;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @java.lang.Override
    public double perimeter() {
        return (a+b)*2;
    }

    @java.lang.Override
    public double square() {
        return a*b;
    }

    @java.lang.Override
    public String getFillColor() {
        return fillColor;
    }

    @java.lang.Override
    public String getBorderColor() {
        return borderColor;
    }
}
