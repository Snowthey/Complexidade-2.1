import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
@Nested
public class Teste_Potenciacao {

    @Test
    void teste1(){
        Potenciacao objeto = new Potenciacao();

        int retorno1 = objeto.PotenciacaoIterativa(0, 2);
        int retorno2 = objeto.PotenciacaoRecursiva(0, 2);
        assertEquals(1, retorno1, retorno2);
    }
    @Test
    void teste2(){
        Potenciacao objeto = new Potenciacao();

        int retorno1 = objeto.PotenciacaoIterativa(2, 2);
        int retorno2 = objeto.PotenciacaoRecursiva(2, 2);
        assertEquals(4, retorno1, retorno2);
    }
    @Test
    void teste3(){
        Potenciacao objeto = new Potenciacao();

        int retorno1 = objeto.PotenciacaoIterativa(3, 3);
        int retorno2 = objeto.PotenciacaoRecursiva(3, 3);
        assertEquals(27, retorno1, retorno2);
    }
}
