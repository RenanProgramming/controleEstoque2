import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws ParseException {

        Scanner input = new Scanner(System.in);
        Produto p = new Produto();
        Cliente c = new Cliente();
        Empresa e = new Empresa();

        int repetir;
        String r_produto_ou_cliente;

        do {
            System.out.println("Digite 1 para os cadastros, 2 para listar e 0 para encerrar: ");
            repetir = input.nextInt();

            switch (repetir) {
                case 0:
                    break;
                case 1:
                    System.out.println("Digite c para cadastrar um cliente e p para cadastrar um produto: ");
                    r_produto_ou_cliente = input.next();

                    switch (r_produto_ou_cliente) {
                        case "c":
                            System.out.println("Digite qual o nome do cliente que você quer cadastrar: ");
                            c.setNome(input.next());
                            System.out.println("Digite qual o CPF do cliente que você quer cadastrar: ");
                            c.setCpf(input.next());
                            System.out.println("Digite qual a data do aniversário do cliente que você quer cadastrar: (formato AAAA-MM-DD)");
                            String data = input.next();
                            LocalDate aniversario = LocalDate.parse(data); // Converte
                            c.setAniversario(aniversario);
                            e.adicionaCliente(c);


                            break;

                        case "p":
                            break;
                    }

                    break;

                case 2:
                    e.listarCliente();
                    break;

            }

        } while (repetir != 0);

    }
}

