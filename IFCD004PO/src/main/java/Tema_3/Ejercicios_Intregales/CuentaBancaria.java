package Tema_3.Ejercicios_Intregales;

public class CuentaBancaria {
    //Atributos
    private double  saldo;
    //Constuctor
    public CuentaBancaria (double saldoInicial){
        this.saldo = saldoInicial;
    }
    //Getter y Setter

    public double getSaldo() {
        return saldo;
    }
    //Metodos públicos
    public void depositar (double monto){
        this.saldo += monto;
    }
    public void retirar (double monto) throws SaldoInsuficienteException{
        if (monto > this.saldo)
            throw new SaldoInsuficienteException("Saldo insuficiente. La cantidad máxima disponible son: " + this.saldo);
        else
            this.saldo -= monto;
    }

}
