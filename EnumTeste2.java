public class EnumTeste2 {
  DiasDaSemana dia;

  public enum DiasDaSemana{
  DOMINGO, SEGUNDA, TERÇA, QUARTA, QUINTA, SEXTA, SÁBADO
  }

  public EnumTeste2 (DiasDaSemana dia) {
    this.dia = dia;
  }

  public void descrevaEsseDia() {
    switch(this.dia) {
      case SEGUNDA:
        System.out.println("Segunda - É com essa animação todinha que vocês vão programar o resto da semana?\n");
        break;
      case TERÇA:
        System.out.println("Terça - Ô turma triste.\n");
        break;
      case QUARTA:
        System.out.println("Quarta - Animação, gente. Ainda é quarta-feira\n");
        break;
      case QUINTA:
        System.out.println("Quinta - Não responderam a atividade da Semana? E o que vocês fizeram entre meia-noite e cinco da manhã?\n");
        break;
      case SEXTA:
        System.out.println("Sexta - Turma, por hoje é só, um bom final de semana, porque, semana que vem, tem mais!\n");
        break;
      case SÁBADO:
        System.out.println("Sábado - Você só tem hoje e amanhã pra enviarem a atividade.\n");
        break;
      case DOMINGO:
        System.out.println("Domingo - 0Quem fez, fez, quem não fez, não faz mais.\n");
    }
  }

  public static void main(String args[]) {
    EnumTeste2 dia1 = new EnumTeste2(DiasDaSemana.SEGUNDA);
    dia1.descrevaEsseDia();
    EnumTeste2 dia2 = new EnumTeste2(DiasDaSemana.TERÇA);
    dia2.descrevaEsseDia();
    EnumTeste2 dia3 = new EnumTeste2(DiasDaSemana.QUARTA);
    dia3.descrevaEsseDia();
    EnumTeste2 dia4 = new EnumTeste2(DiasDaSemana.QUINTA);
    dia4.descrevaEsseDia();
    EnumTeste2 dia5 = new EnumTeste2(DiasDaSemana.SEXTA);
    dia5.descrevaEsseDia();
    EnumTeste2 dia6 = new EnumTeste2(DiasDaSemana.SÁBADO);
    dia6.descrevaEsseDia();
    EnumTeste2 dia7 = new EnumTeste2(DiasDaSemana.DOMINGO);
    dia7.descrevaEsseDia();
  }
}