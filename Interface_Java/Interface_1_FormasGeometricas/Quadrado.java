public class Quadrado extends Retangulo{

    
    public Quadrado(double lado){
        this.base = this.altura = lado;
    }
    
    
    public String getNome(){
        return "Quadrado";
    }
    public double getArea(){
        return (this.base)*(this.altura);
    }
    public double getPerimetro(){
        return (this.base)*4;
    }
    

    public double getLado(){
        return this.base;
    }
}
