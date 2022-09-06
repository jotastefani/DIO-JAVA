public class CaixaEletronico {
  public static void main(String[] args) {
    double saldo = 25.0;
    double valorSolicitado = 27.0;

    if(valorSolicitado < saldo){
      saldo = saldo - valorSolicitado;
      System.out.println("Seu saldo R$ " + saldo + "0");
    }
    else
    System.out.println("Saldo insuficiente");    
  }
}