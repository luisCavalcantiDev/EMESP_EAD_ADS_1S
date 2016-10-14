package tdd.exercicio4;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * As pessoas que trabalham  no regime CLT pagam, mensalmente, o
 * imposto de renda baseado no seu salário, conforme a seguir:
 *
 * a) Salário de até 1.903,98 são isentos de imposto de renda;
 * b) Salário de de 1.903,99 até 2.826,65 pagam 7,5% de imposto de renda;
 * c) Salário de 2.826,66 até 3.751,05 pagam 15% de imposto de renda;
 * d) Salário de 3.751,06 até 4.664,68 pagam 22,5% de imposto de renda;
 * e) Salário acima de 4.664,68 pagam 27,5% de imposto de renda.
 *
 * Crie uma aplicação em Java para calcular o valor de imposto que uma pessoa deve
 * pagar no final do ano. Siga as boas práticas do desenvolvimento guiado por testes
 * e tente criar uma quantidade de testes que de para verificar se o calculo está correto.
 *
 *
 * @author Rafael Guimarães Sakurai
 */
public class ImpostoTest {

  private ImpostoRenda imposto;

  @Before
  public void inicializar() {
    imposto = new ImpostoRenda();
  }

  @Test
  public void testarSalarioIsentoDeImposto() {
    assertTrue(imposto.calcularImpostoMensal(1000) == 0);
    assertTrue(imposto.calcularImpostoMensal(1903.98) == 0);
    assertFalse(imposto.calcularImpostoMensal(2000) == 0);
  }

  @Test
  public void testarImpostoSalarioNaPrimeiraFaixa() {
    assertTrue(imposto.calcularImpostoMensal(1903.99) == 142.8);
    assertTrue(imposto.calcularImpostoMensal(2826.65) == 212.0);
    assertFalse(imposto.calcularImpostoMensal(3000.50) == 225.04);
  }

  @Test
  public void testarImpostoSalarioNaSegundaFaixa() {
    assertTrue(imposto.calcularImpostoMensal(2826.66) == 424.0);
    assertTrue(imposto.calcularImpostoMensal(3271.38) == 490.71);
    assertFalse(imposto.calcularImpostoMensal(4000) == 600);
  }

  @Test
  public void testarImpostoSalarioNaTerceiraFaixa() {
    assertTrue(imposto.calcularImpostoMensal(3751.06) == 843.99);
    assertTrue(imposto.calcularImpostoMensal(4664.68) == 1049.56);
    assertFalse(imposto.calcularImpostoMensal(5000) == 1125);
  }

  @Test
  public void testarImpostoSalarioNaQuartaFaixa() {
    assertTrue(imposto.calcularImpostoMensal(4664.69) == 1282.79);
    assertTrue(imposto.calcularImpostoMensal(5000) == 1375);
    assertFalse(imposto.calcularImpostoMensal(3000) == 825);
  }

  @Test
  public void testarPercentualImposto() {
    assertTrue(imposto.percentualImposto(1000) == 0);
    assertTrue(imposto.percentualImposto(2000) == 0.075);
    assertTrue(imposto.percentualImposto(3000) == 0.15);
    assertTrue(imposto.percentualImposto(4000) == 0.225);
    assertTrue(imposto.percentualImposto(5000) == 0.275);
  }
}
