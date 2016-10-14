package tdd.exercicio3;

import java.math.BigDecimal;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class ConverterMoeda {
  public final double cotacaoDolar = 3.03;
  public final double cotacaoEuro = 3.48;

  public BigDecimal converter(String de, String para, double valor) {
    if("R$".equals(de) && "$".equals(para)) {
      return new BigDecimal(valor / cotacaoDolar);
    } else if("$".equals(de) && "R$".equals(para)) {
      return new BigDecimal(valor * cotacaoDolar);
    } else if("R$".equals(de) && "€".equals(para)) {
      return new BigDecimal(valor / cotacaoEuro);
    } else if("€".equals(de) && "R$".equals(para)) {
      return new BigDecimal(valor * cotacaoEuro);
    }

    return BigDecimal.ZERO;
  }
}
