package tdd.exercicio2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Exercício 2 - Crie uma aplicação para criptografar e descriptografar usando a
 * Cifra de César. Esta é uma forma simples de criptografia, que consistem em mover
 * as letras do alfabeto. Dado um número n, vamos mover as letras no alfabeto, por
 * exemplo:
 * Dado n = 3 e o texto “Rafael Guimaraes Sakurai”, vamos aumentar em 3 cada
 * caractere, assim a versão criptografada ficará “Udidho Jzlpdudhv Vdnzudl”,
 * e para descriptografar basta diminuir em 3 cada caractere.
 *
 * @author Rafael Guimarães Sakurai
 */
public class CriptografiaTest {

  @Test
  public void testarMoverUmCaractereEmNCaracteres() {
    Criptografia crip = new Criptografia();
    assertEquals(crip.moverCaracteres('a', 3), 'd');
    assertEquals(crip.moverCaracteres('b', 3), 'e');
    assertEquals(crip.moverCaracteres('z', 3), 'c');
    assertEquals(crip.moverCaracteres('b', -3), 'y');
    assertEquals(crip.moverCaracteres(' ', 3), ' ');
  }

  @Test
  public void testarCriptografar() {
    Criptografia crip = new Criptografia();
    assertEquals(crip.criptografar("rafael guimaraes sakurai", 3), "udidho jxlpdudhv vdnxudl");
  }

  @Test
  public void testarDescriptografar() {
    Criptografia crip = new Criptografia();
    assertEquals(crip.criptografar("udidho jxlpdudhv vdnxudl", -3), "rafael guimaraes sakurai");
  }
}
