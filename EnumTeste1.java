public class EnumTeste1 {
  public enum Nivel {
    BAIXO,
    MEDIO,
    ALTO
  }

  public static void main(String args[]) {

    Nivel meuNivel = Nivel.MEDIO;

    System.out.println(meuNivel);

    Nivel NivelAlto = Nivel.ALTO;
    switch(NivelAlto) {
      case BAIXO:
        System.out.println("\nDificuldade Baixa");
        break;
      case MEDIO:
        System.out.println("\nDificuldade Média");
        break;
      case ALTO:
        System.out.println("\nDificuldade Alta");
        break;
      }

    System.out.println("\nOs níveis disponíveis são: ");

    for (Nivel level : Nivel.values()) {
      System.out.println(level);
    }
  }
}