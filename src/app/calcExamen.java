package app;

import java.util.ArrayList;
import java.util.List;

public class calcExamen {

    public int devolverEntero(String num){
        String numero = num.toLowerCase().trim();
        if(numero.equalsIgnoreCase("uno")) return 1;
        else if(numero.equalsIgnoreCase("dos")) return 2;
        else if(numero.equalsIgnoreCase("tres")) return 3;
        else if(numero.equalsIgnoreCase("cuatro")) return 4;
        else if(numero.equalsIgnoreCase("cinco")) return 5;
        else if(numero.equalsIgnoreCase("seis")) return 6;
        else if(numero.equalsIgnoreCase("siete")) return 7;
        else if(numero.equalsIgnoreCase("ocho")) return 8;
        else if(numero.equalsIgnoreCase("nueve")) return 9;
        else return 0;
    }
    public List<Integer> valorDePalabras(String[] numerosPal) {
        List<Integer> numeros = new ArrayList<Integer>();
        for(int i=0;i<numerosPal.length;i++){
           numeros.add(devolverEntero(numerosPal[i]));
        }
        return numeros;
    }
    public List<Integer> valoresProporcionales(int[] numeros, int valorAbsoluto){
        List<Integer> numerosresult = new ArrayList<Integer>();
        int numeroGu;
        for(int i = 0; i < numeros.length;i++){
            numeroGu = numeros[i] * 10;
            numerosresult.add(numeroGu);
        }
        return numerosresult;
    }
    double to2dec(double valor) {
        return Math.floor(valor * 100) / 100d;
    }

}
