import java.util.Scanner;
public class TestCuenta {


    public static int menu() {
        Scanner sc = new Scanner (System.in);
        int option = 0;
        System.out.println("[1] Saldo");
        System.out.println("[2] Depositar");
        System.out.println("[3] Retirar");
        System.out.println("[0] Salir");
        option = sc.nextInt();
        return option;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cuenta account1 = new Cuenta("Shoham", "medina", 500, "medinashoham.@.com");
        int option;
        do{

            option = menu();

            System.out.println("La opcion seleccionada es: " + option);
            switch (option){

                case 1:
                    System.out.println("tu saldo es: " + account1.getBalance());
                    break;
                case 2:
                    System.out.println("Ingrese la cantidad a depositar");
                    account1.deposit(sc.nextDouble());
                    break;
                case 3:
                    System.out.println("Ingrese la cantidad a retirar");
                    account1.withdraw(sc.nextDouble());
                    break;
            }
        }while (option !=0);
        System.out.println("Hasta pronto");
    }
}