package app;

public class Calculadora {

    public int multiplica( int x, int y){
        return x * y;
    }
    
    public Fraccion suma(Fraccion f1, Fraccion f2){
        int n= f1.numerador*f2.denominador + f2.numerador*f1.denominador;
        int d = f1.denominador*f2.denominador;
        return new Fraccion(n,d);
    }
}
