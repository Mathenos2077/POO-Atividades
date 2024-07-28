public class Barco extends Aquatico{
    private boolean comercial;
    
    public Barco(Integer capacidade, Integer velocidade, String tipo, boolean comercial){
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipo = tipo;
        this.comercial = comercial;
    }
    
    public boolean isComercial(){
        return this.comercial;
    }
    public void acelerar(){
        this.velocidade += 3;
    }
    public void frear(){
        this.velocidade -= 3;
    }
}
