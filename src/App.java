import br.com.dsbfelipe.bank.ContaCorrente;
import br.com.dsbfelipe.bank.ContaPoupanca;

public class App {
    public static void main(String[] args) throws Exception {
        ContaCorrente cc = new ContaCorrente("12345-0", "João Silva", 500.0, 200.0);
        System.out.println("=== Conta Corrente ===");
        cc.depositar(300.0);
        cc.sacar(900.0);
        cc.sacar(200.0);
        System.out.println("Saldo final CC: R$ " + cc.getSaldo());
        System.out.println();

        ContaPoupanca cp = new ContaPoupanca("98765-0", "Maria Souza", 1000.0, 0.02);
        System.out.println("=== Conta Poupança ===");
        cp.depositar(500.0);
        cp.sacar(200.0);
        cp.renderJuros();
        System.out.println("Saldo final CP: R$ " + cp.getSaldo());
    }
}
