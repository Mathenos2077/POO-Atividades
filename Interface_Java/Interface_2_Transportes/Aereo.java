public class Aereo extends Transporte implements Voador{
    protected String tipoMotor;
    
    public String getTipoMotor(){
        return this.tipoMotor;
    }
    
    public void acelerar(){}
    public void frear(){}
    public void voar(Double tempo){}
}
