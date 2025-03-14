package methods;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Conta {
    private String titular;
    private int numeroDaConta;
    private String agencia;
    private double saldo;
    private String dataDeAbertura;


    public Conta(String titular, int numeroDaConta, String agencia, double saldo) {
        this.titular = titular;
        this.numeroDaConta = numeroDaConta;
        this.agencia = agencia;
        this.saldo = saldo;
        this.dataDeAbertura = LocalDate.now().format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public String getAgencia() {
        return agencia;
    }


    public double getSaldo() {
        return saldo;
    }

    public double saca(double valor) {

        if (valor > this.saldo) {
            System.out.println("Saldo insuficiente!");
            return 0;
        }

        System.out.println("Saldo anterior: " + getSaldo());
        this.saldo -= valor;
        System.out.println("Saldo atual: " + getSaldo());


        return this.saldo;
    }

    public double deposita(double valor) {
        System.out.println("Saldo anterior: " + getSaldo());
        System.out.println(" ");
        this.saldo += valor;

        System.out.println("Saldo atual: " + getSaldo());
        System.out.println(" ");
        return this.saldo;
    }

    public double calculaRendimento() {

        double rendimento = this.saldo * 0.1;
        return rendimento;
    }
}
