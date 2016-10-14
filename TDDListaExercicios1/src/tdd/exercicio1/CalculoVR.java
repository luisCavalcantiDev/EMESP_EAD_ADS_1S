package tdd.exercicio1;

import java.math.BigDecimal;
import java.math.RoundingMode;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class CalculoVR {
  private static final double VALOR_VR_DIARIO = 26.0;
  private static final double PERCENTUAL_DESCONTO = 0.1;

  public double valorPago(int qtdDias) {
    return VALOR_VR_DIARIO * qtdDias;
  }

  public double valorDescontado(int qtdDias) {
    return new BigDecimal(valorPago(qtdDias) * PERCENTUAL_DESCONTO).setScale(2, RoundingMode.HALF_UP).doubleValue();
  }
}
