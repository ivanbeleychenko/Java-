public class Round implements Figura{
    private double r;
    private String fillColor, borderColor;
    public Round(double r,String fillColor, String borderColor) {
        this.r = r;
        this.fillColor = fillColor;
        this.borderColor = borderColor;
    }

    @java.lang.Override
    public double square() {
        return Math.PI*Math.pow(r,2);
    }

    @java.lang.Override
    public double perimeter() {
        return Math.PI*r*2;
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
