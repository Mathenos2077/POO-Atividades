public class Retangulo implements FormaGeometrica{
    double base;
    double altura;
    
    
    public Retangulo(){}
    public Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    
    
    public String getNome(){
        return "Retangulo";
    }
    public double getArea(){
        return (this.base)*(this.altura);
    }
    public double getPerimetro(){
        return (2*this.base)+(2*this.altura);
    }
    
    
    public double getBase(){
        return this.base;
    }
    public double getAltura(){
        return this.altura;
    }
}
