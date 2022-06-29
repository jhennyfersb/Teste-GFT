package Desafio1;

public class ContaPoupanca extends Conta{
    @Override
    public double rendimento() {
        return this.getSaldo() * 0.05;
    }
}
