package br.com.dsbfelipe.bank;

public class ContaCorrente extends ContaBancaria {
  private double limiteChequeEspecial;

  public ContaCorrente(String numeroConta, String nomeTitular, double saldoInicial, double limiteChequeEspecial) {
    super(numeroConta, nomeTitular, saldoInicial);
    this.limiteChequeEspecial = limiteChequeEspecial;
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
    double saldoDisponivel = getSaldo() + limiteChequeEspecial;
    if (valor > 0 && saldoDisponivel >= valor) {
      setSaldo(getSaldo() - valor);
      System.out.println("Saque realizado: R$ " + valor);
    } else {
      System.out.println("Saldo insuficiente (incluindo limite) ou valor inválido.");
    }
  }

}
