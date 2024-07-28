public class Circulo implements FormaGeometrica{
    private double raio;
    
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    
    public String getNome(){
        return "Circulo";
    }
    public double getArea(){
        return (Math.PI)*(Math.pow(this.raio, 2));
    }
    public double getPerimetro(){
        return (Math.PI)*(this.raio)*2;
    }
    
    
    public double getRaio(){
        return this.raio;
    }
}
