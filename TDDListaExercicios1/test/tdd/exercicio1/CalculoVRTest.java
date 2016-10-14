package tdd.exercicio1;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Dado a seguinte solicitação:
 * "Foi acordado com o sindicato que a empresa deve fornecer vale refeição (VR) a todos os
 * colaboradores, sendo que o valor diário do VR é de R$23,00 e que a empresa pode descontar
 * da folha de pagamento do colaborador 10% do valor mensal fornecido de VR.”
 *
 * Crie uma aplicação para calcular o valor que o colaborador irá receber por mês e o valor
 * que deve ser descontado da folha de pagamento do colaborador.
 * @author Rafael Guimarães Sakurai
 */
public class CalculoVRTest {

  CalculoVR calc = new CalculoVR();

  @Test
  public void testarValorPagoDeVRPorDia() {
    assertTrue(calc.valorPago(1) == 26.0);
    assertTrue(calc.valorPago(29) == 754.0);
    assertTrue(calc.valorPago(30) == 780.0);
  }

  @Test
  public void testarValorDescontadoVRPorDia() {
    assertTrue(calc.valorDescontado(1) == 2.6);
    assertTrue(calc.valorDescontado(29) == 75.4);
    assertTrue(calc.valorDescontado(30) == 78.0);
  }

}
