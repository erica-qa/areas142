// FTS 142 - Lista 06 - Testes de Unidade

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import com.areas142.Main;

public class testAreas142 {

    @Test
    public void testeQuadrado(){
    //Configura
        //Dados de Entrada
        float lado = 5;
        //Dados de Saída ou Resultado Esperado
        float resultadoEsperado = 25;
    //Executa
        float resultadoAtual = Main.quadrado(lado);
    //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }
 
    @Test
    public void testeCirculo(){
    //Configura
        //Dados de Entrada
        double raio = 15;
        //Dados de Saída ou Resultado Esperado
        String resultadoEsperado = "706,86";
    //Executa
        String resultadoAtual = Main.circulo(raio);
    //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

//Área do Retângulo = Testar com Data-driven lendo uma lista de valores fornecidas no próprio script
    @ParameterizedTest
    @CsvSource(value ={
        "2,4,8",
        "3,6,18",
        "5,7,35",
        "6,0,0",
        "9,13,117",
        "10,14,140",
        "0,15,0",
        "13,18,234",
        "14,32,448",
        "21,33,693"
    }, delimiter = ','
    )
    public void testeRetanguloDDT(float baser, float alturar, float resultadoEsperado){
    //Configura - Os dados de entrada, saída e resultado esperado são lidos da massa de teste acima
        
    //Executa
        float resultadoAtual = Main.retangulo(baser, alturar);
    //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

//Área do Triângulo = Testar com Data-driven lendo um arquivo CSV
    @ParameterizedTest
    @CsvFileSource(resources = "/csv/massaTriangulo.csv", numLinesToSkip = 1, delimiter = ',')
    public void testeTrianguloCSV(float baset, float alturat, float resultadoEsperado){
    //Configura - Os dados de entrada, saída e resultado esperado são lidos da massa de teste acima
        
    //Executa
        double resultadoAtual = Main.triangulo(baset, alturat);
    //Valida
        assertEquals(resultadoEsperado, resultadoAtual);
    }

}