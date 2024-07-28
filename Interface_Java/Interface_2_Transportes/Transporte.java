public abstract class Transporte implements Movel{
    protected Integer capacidade, velocidade;
    
    public Integer getCapacidade(){
        return this.capacidade;
    }
    public Integer getVelocidade(){
        return this.velocidade;
    }
}