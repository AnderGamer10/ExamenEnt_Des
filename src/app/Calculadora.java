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
    public String diaDeLaSemanaString(int n) {
        String d = "no lo se";
        if (n == 1)
            d = "lunes";
        if (n == 2)
            d = "martes";
        return d;
    }

    public int diaDeLaSemanaInt(String s ) {
        int d=0;
        String dia = s.trim().toLowerCase();
        System.out.println("s="+s+".");
        System.out.println("dia="+dia+".");
        if (dia.equals("lunes")) d=1;

        return  d;
    }

    public List<Integer> valoresDePalabras(String str ) {
        List<Integer> valores = new ArrayList<Integer>();;

        //Normalizacion de las palabras
        String[] palabras = str.trim().split("\s+");

        // Por cada palabra se invoca al metodo
        for(int i=0;i<palabras.length;i++){
           // y el valor se añade a una Lista
           valores.add(diaDeLaSemanaInt(palabras[i]));
        }
        return valores;
    }
    


}
