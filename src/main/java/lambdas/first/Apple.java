package lambdas.first;



public class Apple {
    private String farbe;
    private String gewicht;

    public Apple(String farbe, String gewicht) {
        this.farbe = farbe;
        this.gewicht = gewicht;
    }

    public String getFarbe() {
        return this.farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public String toString() {
        return "Apple{farbe='" + this.farbe + '\'' + ", gewicht='" + this.gewicht + '\'' + '}';
    }
}
