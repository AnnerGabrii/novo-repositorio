import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import domain.Animal;
import domain.Cliente;
import domain.Consulta;
import domain.Especie;
import domain.Exame;
import domain.Tratamento;
import domain.Veterinario;

public class App {
    private static List<Consulta> consultas;

    public static void main(String[] args) throws Exception {
        // Criar um formato de data
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Criar um cliente
        Cliente cliente = new Cliente(1, "Carlos", "Rua das Couves", "(34)9900-0000");

        // Criar um veterinário
        Veterinario veterinario = new Veterinario(1, "André", "CRMV-MG 2653");

        // Criar uma espécie
        Especie especie = new Especie(1, "Cachorro");

        // Criar um animal
        Animal animal = new Animal(1, "Layca", "Fêmea", 11, especie.getNome());

        // Criar uma consulta
        Date dataConsulta = dateFormat.parse("11/09/2023");
        Consulta consulta1 = new Consulta(1, dataConsulta, "O veterinário André atendeu e no resumo ele constatou o caroço perto da patinha do cachorro, marcou a cirurgia para retirada.");
        
        // Criar um tratamento
        Tratamento tratamento = new Tratamento(1, animal, "Cachorrinha Layca possui um caroço acima da patinha esquerda.");

        // Adicionar o tratamento à consulta
        consulta1.getTratamentos().add(tratamento);

        // Criar um exame
        Exame exame = new Exame(1, "biópsia", "falso-negativo");

        // Vincular o exame à consulta
        exame.setConsultas(consultas);

        // Imprimir informações
        System.out.println(cliente);
        System.out.println(veterinario);
        System.out.println(especie);
        System.out.println(animal);
        System.out.println(consulta1);
        System.out.println(exame);
    }
}

