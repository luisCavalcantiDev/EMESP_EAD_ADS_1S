package tdd.exercicio4;

import java.math.BigDecimal;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class ImpostoRenda {

  public double calcularImpostoMensal(double salario) {
    if(isIsento(salario)) {
      return 0;
    } else {
      return new BigDecimal(salario * percentualImposto(salario)).setScale(2, BigDecimal.ROUND_UP).doubleValue();
    }
  }

  public double percentualImposto(double salario) {
    if(isPrimeiraFaixa(salario)) {
      return 0.075;
    } else if(isSegundaFaixa(salario)) {
      return 0.15;
    } else if(isTerceiraFaixa(salario)) {
      return 0.225;
    } else if(isQuartaFaixa(salario)) {
      return 0.275;
    }

    return 0;
  }

  public boolean isIsento(double salario) {
    return salario <= 1903.98;
  }

  public boolean isPrimeiraFaixa(double salario) {
    return salario >= 1903.99 && salario <= 2826.65;
  }

  public boolean isSegundaFaixa(double salario) {
    return salario >= 2826.66 && salario <= 3751.05;
  }

  public boolean isTerceiraFaixa(double salario) {
    return salario >= 3751.06 && salario <= 4664.68;
  }

  public boolean isQuartaFaixa(double salario) {
    return salario >= 4664.69;
  }
}
