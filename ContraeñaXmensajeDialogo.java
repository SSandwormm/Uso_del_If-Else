package contraeñaxmensajedialogo;

import javax.swing.JOptionPane;

public class ContraeñaXmensajeDialogo {

    public static void main(String[] args) {
        String usuario = "admin";
        String Password = "admin";
        int intentos = 0;
        int intentos1 = 0;
        int opcion;

        do {

            opcion = Integer.parseInt(JOptionPane.showInputDialog(null, "**************LOGIN****************\n"
                    + "1.INICIAR\n"
                    + "2.SALIR"));

            switch (opcion) {
                case 1:
                    do {

                        usuario = JOptionPane.showInputDialog("USUARIO:");

                        if (usuario.equals("admin")) {

                            JOptionPane.showMessageDialog(null, "usuario correcta");

                            while (intentos1 < 3) {
                                Password = JOptionPane.showInputDialog("CONTRASEÑA:");

                                if (Password.equals("admin")) {
                                    JOptionPane.showMessageDialog(null, "contraseña correcta");

                                    //centro del trabajo
                                    JOptionPane.showMessageDialog(null, "_______________________________"
                                            +"\nBIENVENIDO" 
                                            + "\n_______________________________");
                                    //fin del centro
                                } else {
                                    JOptionPane.showMessageDialog(null, "contraseña incorrecta  ");
                                    intentos1++;
                                    intentos++;
                                    intentos++;
                                    intentos++;
                                }
                            }

                        } else {

                            JOptionPane.showMessageDialog(null, "usuario incorrecto  ");
                            intentos++;

                        }

                    } while (intentos < 3);
                    JOptionPane.showMessageDialog(null, "BLOQUEAD@\n"
                            + " Gracias por utilizar nuestro programa");
                    intentos = 0;
                    intentos1 = 0;
                    break;

            }
        } while (opcion != 2);

    }

}
