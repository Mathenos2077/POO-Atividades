public class Aviao extends Aereo{
    private String tipo;
    private boolean comercial;
    
    public Aviao(Integer capacidade, Integer velocidade, String tipoMotor, String tipo, boolean comercial){
        this.capacidade = capacidade;
        this.velocidade = velocidade;
        this.tipoMotor = tipoMotor;
        this.tipo = tipo;
        this.comercial = comercial;
    }
    
    public void acelerar(){
        this.velocidade += 30;
    }
    public void frear(){
        this.velocidade -= 30;
    }
    public void voar(Double tempo){
        System.out.println("O avião voou por "+tempo+" horas.");
    }
    public boolean isComercial(){
        return this.comercial;
    }
}
