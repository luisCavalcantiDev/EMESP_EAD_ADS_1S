package tdd.exercicio2;

/**
 *
 * @author Rafael Guimarães Sakurai
 */
public class Criptografia {
  public char moverCaracteres(char original, int n) {
    if(original == ' ')
      return original;

    int resultado = (original + n);

    if(resultado > 122) {
      resultado = resultado - 26;
    } else if(resultado < 97) {
      resultado = 122 - (96 - resultado);
    }

    return (char) resultado;
  }

  public String criptografar(String original, int n) {
    char[] criptografado = new char[original.length()];
    char[] charOriginal = original.toCharArray();

    for(int cont = 0; cont < charOriginal.length; cont++) {
      criptografado[cont] = moverCaracteres(charOriginal[cont], n);
    }

    return new String(criptografado);
  }

}
