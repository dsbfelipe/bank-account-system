package br.com.dsbfelipe.bank;

public class ContaPoupanca extends ContaBancaria {
  private double taxaJuros;

  public ContaPoupanca(String numeroConta, String nomeTitulo, double saldoInicial, double taxaJuros) {
    super(numeroConta, nomeTitulo, saldoInicial);
    this.taxaJuros = taxaJuros;
  }

  @Override
  public void depositar(double valor) {
    if (valor > 0) {
      setSaldo(getSaldo() + valor);
      System.out.println("Depósito realizado: R$ " + valor);
    } else {
      System.out.println("Valor inválido para depósito.");
    }
  }

  @Override
  public void sacar(double valor) {
    if (valor > 0 && getSaldo() >= valor) {
      setSaldo(getSaldo() - valor);
      System.out.println("Saque realizado: R$ " + valor);
    } else {
      System.out.println("Saldo insuficiente ou valor inválido.");
    }
  }

  public void renderJuros() {
    double rendimento = getSaldo() * taxaJuros;
    setSaldo(getSaldo() + rendimento);
    System.out.println("Juros de R$ " + rendimento + " aplicados.");
  }
}
