public class Teste{
    public static void main(String[] args){
        FormaGeometrica formas[] = new FormaGeometrica[5];
        
        formas[0] = new Circulo(5);
        formas[1] = new Retangulo(9,6);
        formas [2] = new Quadrado(7);
        formas [3] = new Circulo (20);
        formas [4] = new Retangulo(3,1);
        
        
        for(int i=0; i<5; i++){
            System.out.println("Área da forma geometrica "+ (i+1) + ": "+ formas[i].getArea());
        }
    }
}
