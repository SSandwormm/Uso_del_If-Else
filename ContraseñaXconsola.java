package contraseñaxconsola;

import java.util.Scanner;

public class ContraseñaXconsola {

    public static void main(String[] args) {

               int intentos1 = 0;
        int intentos = 0;

        //usuario admin 
        String admin = "admin";
        String password = "admin";
        //guardar los datos por consola 
        String[] uno = new String[1];
        String[] dos = new String[1];

        Scanner entrada = new Scanner(System.in);
        Scanner opcionn = new Scanner(System.in);
        int opcion;
        do {
            System.out.println(
                    "Login\n"
                    + "1. inicio\n"
                    + "2. salir");

            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:

                    do {
                        System.out.println("USUARIO");
                        uno[0] = opcionn.nextLine();

                        if (uno[0].equals(admin)) {

                            while (intentos1 < 3) {

                                System.out.println("CONTRASEÑA");
                                dos[0] = opcionn.nextLine();

                                if (dos[0].equals(password) || dos[0].equals(password)) {

                                    if (uno[0].equals(admin) && dos[0].equals(password)) {

                                        //el centro 
                                        System.out.println("********************");
                                        System.out.println("holaa");
                                        System.out.println("********************");
                                       
                                        break;

                                        //fin del centro
                                    } else {
                                        System.out.println("la usuario o contraseña son incorrectos");

                                    }

                                } else {
                                    intentos1++;
                                    intentos++;
                                    intentos++;
                                    intentos++;
                                    System.out.println("contraseña Erroneo");

                                }

                            }

                        } else {
                            intentos++;
                            System.out.println("Usuario Erroneo");
                        }

                    } while (intentos < 3);
                    System.out.println("BLOQUEAD@\n"
                            + " Gracias por utilizar nuestro programa");

                    break;

            }

        } while (opcion != 2);
    }

}
