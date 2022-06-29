package Desafio1;

public class Main {

    public static void main(String[] args) {
	ContaPoupanca cp = new ContaPoupanca();
	cp.setTitular("Jhennyfer");
	cp.setNumero(222222545);
	cp.setSaldo(40.d);

		System.out.println(cp.getTitular());
		System.out.println(cp.getNumero());
        System.out.println(cp.getSaldo());
		System.out.println(cp.rendimento());

	ContaCorrente cc = new ContaCorrente();
	cc.setTitular("Marcus");
	cc.setNumero(223654789);
	cc.setSaldo(58);

		System.out.println(cc.getTitular());
		System.out.println(cc.getNumero());
		System.out.println(cc.getSaldo());
		System.out.println(cc.rendimento());
    }
}
