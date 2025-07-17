package br.com.dsbfelipe.bank;
public abstract class ContaBancaria {
  private String numeroConta;
  private String nomeTitular;
  private double saldo;

  public ContaBancaria(String numeroConta, String nomeTitular, double saldoInicial) {
    this.numeroConta = numeroConta;
    this.nomeTitular = nomeTitular;
    this.saldo = saldoInicial;
  }

  public String getNumeroConta() {
    return numeroConta;
  }

  public String getNomeTitular() {
    return nomeTitular;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public abstract void depositar(double valor);
  public abstract void sacar(double valor);
}
