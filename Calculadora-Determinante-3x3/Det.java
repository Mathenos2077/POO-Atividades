
/**
 * Modela o cálculo de determinante 3x3
 * 
 * @author Matheus Teixeira Pires 
 * @version 0.1
 */
public class Det
{
    double a11, a12, a13, a21, a22, a23, a31, a32, a33;
    
    public Det() {
        this.a11 = 0;
        this.a12 = 0;
        this.a13 = 0;
        this.a21 = 0;
        this.a22 = 0;
        this.a23 = 0;
        this.a31 = 0;
        this.a32 = 0;
        this.a33 = 0;
    }
    
    /**
     * Construtor para objetos da classe Det
     */
    public Det(double a11, double a12, double a13, double a21,double a22,double a23,double a31,double a32,double a33)
    {
        this.a11 = a11;
        this.a12 = a12;
        this.a13 = a13;
        this.a21 = a21;
        this.a22 = a22;
        this.a23 = a23;
        this.a31 = a31;
        this.a32 = a32;
        this.a33 = a33;    
    }

    /**
     * Calcula o Determinante
     * 
     * @return     o valor do deteterminante pela fórmula do determinante.
     */
    public double calcular()
    {
        double det1 = (this.a11*this.a22*this.a33)+(this.a12*this.a23*this.a31)+(this.a13*this.a21*this.a32);
        double det2 = (this.a13*this.a22*this.a31)+(this.a11*this.a23*this.a32)+(this.a12*this.a21*this.a33);
        double det = det1-det2;
        return det;
    }
}
