import org.example.Calculadora;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraTest {
    //HAHAHAHAHAHAHAHA
    // +-*/

    private Calculadora calc;

    @BeforeEach
    void declaracaoObjetos(){
        calc = new Calculadora();
    }

    @Test
    void deveSomardoisNumeros(){
        int resultado = calc.soma(5,5);
        assertEquals(10, resultado);
    }

    @Test
    void deveSubtrairDoisNumeros(){
        int resultado = calc.subtracao(10,5);
        assertEquals(5, resultado);
    }

    @Test
    void deveMultiplicarDoisNumeros(){
        int resultado = calc.multiplicacao(2,5);
        assertEquals(10, resultado);
    }

    @Test
    void deveDividirDoisNumeros(){
        int resultado = calc.divisao(10,2);
        assertEquals(5, resultado);
    }

}

