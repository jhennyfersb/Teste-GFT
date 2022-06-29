package Desafio1;

public class ContaCorrente extends Conta{
    @Override
    public double rendimento() {
        return this.getSaldo() * 0.03;
    }
}
