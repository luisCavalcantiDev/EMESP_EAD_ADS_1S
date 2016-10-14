package tdd.exercicio3;

import java.math.BigDecimal;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Exercício 4 - Vamos criar uma aplicação para fazer conversão entre moedas Real,
 * Dólar e Euro. Se $1 dólar equivale R$3,03 Real e €1 Euro equivale a R$3,48 Reais.
 * Crie pelo menos quatro testes, usando o jUnit, para criar esta aplicação que faz a
 * conversão das moedas.
 *
 * Sugestão: utilize a classe java.math.BigDecimal para cálculos com números
 * decimais, principalmente valores monetários, pois esta classe possui mais precisão
 * nas casas decimais, também permite arredondar e comparar números, mais
 * informações podem ser encontradas na  documentação da linguagem Java, em:
 * http://docs.oracle.com/javase/7/docs/api/java/math/BigDecimal.html.
 *
 * @author Rafael Guimarães Sakurai
 */
public class ConversaoMoedaTest {

  @Test
  public void converterRealParaDolar() {
    ConverterMoeda converterMoeda = new ConverterMoeda();
    assertTrue(converterMoeda.converter("R$", "$", 3.03).equals(new BigDecimal(1)));
    assertTrue(converterMoeda.converter("R$", "$", 6.06).equals(new BigDecimal(2)));
  }

  @Test
  public void converterDolarParaReal() {
    ConverterMoeda converterMoeda = new ConverterMoeda();
    assertTrue(converterMoeda.converter("$", "R$", 1).equals(new BigDecimal(3.03)));
    assertTrue(converterMoeda.converter("$", "R$", 2).equals(new BigDecimal(6.06)));
  }

  @Test
  public void converterRealParaEuro() {
    ConverterMoeda converterMoeda = new ConverterMoeda();
    assertTrue(converterMoeda.converter("R$", "€", 3.48).equals(new BigDecimal(1)));
    assertTrue(converterMoeda.converter("R$", "€", 6.96).equals(new BigDecimal(2)));
  }

  @Test
  public void converterEuroParaReal() {
    ConverterMoeda converterMoeda = new ConverterMoeda();
    assertTrue(converterMoeda.converter("€", "R$", 1).equals(new BigDecimal(3.48)));
    assertTrue(converterMoeda.converter("€", "R$", 2).equals(new BigDecimal(6.96)));
  }

}
