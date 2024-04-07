public class Triangle implements Figura {
    private double a;
    private double b;
    private double c;
    private String fillColor, borderColor;
    public Triangle(double a, double b, double c, String fillColor, String borderColor){
        this.a = a;
        this.b = b;
        this.c = c;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @java.lang.Override
    public double perimeter() {
        return a+b+c;
    }

    @java.lang.Override
    public double square() {
        double p = (a+b+c)/2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
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
