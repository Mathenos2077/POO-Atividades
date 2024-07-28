public class Moto extends Terrestre implements Licenciado{
    private String cor, placa;
    private Integer marcha;
    
    public Moto(Integer capacidade, Integer velocidade, String cor, String placa, Integer marcha){
        this.cor = cor;
        this.placa = placa;
        this.marcha = marcha;
        this.capacidade = capacidade;
        this.velocidade = velocidade;
    }
    
    public Integer getNumRodas(){
        this.numRodas = 2;
        return 2;
    }
    public String getCor(){
        return this.cor;
    }
    public String getPlaca(){
        return this.placa;
    }
    public Integer getMarcha(){
        return this.marcha;
    }
    public void trocarMarcha(Integer marcha){
        this.marcha = marcha;
    }
    
    public void emplacar(String placa){
        this.placa = placa;
    }
}
