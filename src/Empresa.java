import java.util.ArrayList;
import java.util.List;

public class Empresa {

    private ArrayList<Cliente>clientes;

    public Empresa () {
        this.clientes = new ArrayList<>();
    }


    public void adicionaCliente (Cliente cliente) {
        clientes.add(cliente);
    }

    public List<Cliente> listarCliente () {
        return clientes;
    }

}
