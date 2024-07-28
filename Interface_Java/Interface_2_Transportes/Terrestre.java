public class Terrestre extends Transporte{
    protected Integer numRodas;
    
    public Integer getNumRodas(){return this.numRodas;}
    public void acelerar(){
        this.velocidade += 5;
    }
    public void frear(){
        this.velocidade -= 5;
    }
}
