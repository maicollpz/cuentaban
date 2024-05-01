
public class prueba{
    public static void main(String[] args) {
        // Crear una cuenta bancaria
        cuenta cuenta1 = new cuenta("Maycol", "lopez", "123456789", "Cuenta de ahorros");
        cuenta cuenta2 = new cuenta("Carlos", "Perez", "123456789", "Cuenta corriente");



        cuenta1.mostrarinformacion();
        System.out.println("Saldo actual de la cuenta 1: $" + cuenta1.consultarSaldo());
        cuenta1.consignar(5000);
        cuenta1.retirar(600);

    
        
        cuenta2.mostrarinformacion();
        System.out.println("Saldo actual de la cuenta 2: $" + cuenta2.consultarSaldo());
        cuenta2.consignar(7000);
        cuenta2.retirar(2000);
}
 }

