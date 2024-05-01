public class cuenta{
    
    String nombres;
    String apellidos;
    String numeroCuenta;
    String tipoCuenta;
    double saldo;

   
    public cuenta(String nombres, String apellidos, String numeroCuenta, String tipoCuenta){
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0; // Saldo inicial
    }

    public void imprimirdatos() {
    System.out.println("¡La cuenta bancaria de " + nombres + " " + apellidos + " ha sido creada!");
    System.out.println("Saldo inicial: $" + saldo);
    }


        public void mostrarinformacion() {
        System.out.println("Información de la cuenta:");
        System.out.println("Titular: " + nombres + " " + apellidos);
        System.out.println("Número de cuenta: " + numeroCuenta);
        System.out.println("Tipo de cuenta: " + tipoCuenta);
        System.out.println("Saldo disponible: $" + saldo);
    }

    public double consultarSaldo() {
        return saldo;
    }

    // Método para consignar dinero en la cuenta
    public void consignar(double monto) {
        saldo += monto;
        System.out.println("Se consignaron $" + monto + " en la cuenta. Nuevo saldo: $" + saldo);
    }

    // Método para retirar dinero de la cuenta
    public void retirar(double monto) {
        if (monto > saldo) {
            System.out.println("Saldo insuficiente");
        } else {
            saldo -= monto;
            System.out.println("Se retiraron $" + monto + " de la cuenta. Nuevo saldo: $" + saldo);
        }
    }

}


