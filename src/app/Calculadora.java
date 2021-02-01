package app;

import java.util.ArrayList;
import java.util.List;

public class Calculadora {

    public int multiplica(int x, int y) {
        return x * y;
    }

    public Fraccion suma(Fraccion f1, Fraccion f2) {
        int n = f1.numerador * f2.denominador + f2.numerador * f1.denominador;
        int d = f1.denominador * f2.denominador;
        int mDiv = mcd(n, d);
        return new Fraccion(n / mDiv, d / mDiv);
    }

    // Máximo común divisor
    int mcd(int x, int y) {
        while (x != y)
            if (x > y)
                x = x - y;
            else
                y = y - x;
        return x;
    }
    public  String diaDeLaSemana(int n){
        String d="no lo sé";

        if(n==1) d ="Lunes";
        if(n==2) d ="Martes";
        if(n==3) d ="Miercooles";
        if(n==4) d ="Jueves";
        if(n==5) d ="Viernes";
        if(n==6) d ="Sabado";
        if(n==7) d ="Domingo";
        return d;
    }

    public int numDiaDeLaSemana(String s){
        int d = 0;
        String dia = s.trim().toLowerCase();
        if(dia.equals("lunes"))
            d = 1;

        return d;
    }

    public List<Integer> valoresDePalabras(String str ) {
        List<Integer> valores = new ArrayList<Integer>();;

        //Normalizacion de las palabras
        String[] palabras = str.trim().split("\s+");

        // Por cada palabra se invoca al metodo
        for(int i=0;i<palabras.length;i++){
           // y el valor se añade a una Lista
           valores.add(numDiaDeLaSemana(palabras[i]));
        }
        return valores;
    }
    


}
