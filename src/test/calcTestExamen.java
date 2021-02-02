package test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.util.*;
import app.*;

public class calcTestExamen {
    
    @Test
    @DisplayName("Un método que devuelve un valor entero dado el nombre de un número.")
    void nombreANumero() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        calcExamen calc = new calcExamen();
        // 2 - Ejecutar lo que vamos a validar
        int result = calc.devolverEntero("uno");
        // 3 - Aserciones
        assertEquals(1, result);
    }

    @Test
    @DisplayName("Un método que devuelve un valor entero dado el nombre de un número.")
    void arrayNumeros() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        calcExamen calc = new calcExamen();
        // 2 - Ejecutar lo que vamos a validar
        List<Integer> result = calc.valorDePalabras(new String[]{"uno","dos","tres"});
        // 3 - Aserciones
        List<Integer> numEsperados = new ArrayList<Integer>(Arrays.asList(1,2,3));
        assertEquals(numEsperados, result);
    }
    @Test
    @DisplayName("Otro que obtiene una lista de valores proporcionales, respecto a una lista original de valores y un valor absoluto total")
    void valoresProporcionales() {
        // fail("Not yet implemented");
        // 1 - preracion del test
        calcExamen calc = new calcExamen();
        // 2 - Ejecutar lo que vamos a validar
        int[] arrayNum = {1,2,3};
        List<Integer> result = calc.valoresProporcionales(arrayNum, 60);
        // 3 - Aserciones
        List<Integer> numEsperados = new ArrayList<Integer>(Arrays.asList(10,20,30));
        assertEquals(numEsperados, result);
    }
}
