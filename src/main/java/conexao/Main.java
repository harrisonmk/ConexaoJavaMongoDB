package conexao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws UnknownHostException {

      /*  List<String> livros = Arrays.asList("The vampire diaries", "joao e maria");
        DBObject person = new BasicDBObject("_id", "jo")
                .append("name", "Harrison Mitchell")
                .append("Endereco", new BasicDBObject("Rua", "Sao judas Tadeu")
                        .append("cidade", "corumba")
                        .append("Estado", "MS")
                        .append("cep", 79310710))
                .append("livros", livros);*/

      List<Caminhoes> caminhoes = new ArrayList<>();
      
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("BD2"); // nome do banco
        DBCollection collection = database.getCollection("caminhoneiro"); // nome do documento
        //collection.insert(person); //insere a pessoa no banco

        
      Caminhoes caminhao = new Caminhoes();
      
      //toDBObject(caminhao);
      
      collection.insert(toDBObject(caminhao));
      
      
      
    }

    public static final DBObject toDBObject(Caminhoes caminhao) {
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Digite o id:");
        Long id = scan.nextLong();
        scan.nextLine();
        System.out.println("Digite o nome do caminhao:");
        String nome = scan.nextLine();
        System.out.println("Digite a marca do caminhao:");
        String marca = scan.nextLine();
        System.out.println("Digite o tamanho do caminhao:");
        double tamanho = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite seu local atual");
        String local = scan.nextLine();
        System.out.println("digite a lista de destino");
        String lista = scan.nextLine();
        System.out.println("Digite seu salario");
        double salario = scan.nextDouble();
        System.out.println("Digite o km/litros");
        double km = scan.nextDouble();
        
        caminhao = new Caminhoes();
        caminhao.setId(id);
        caminhao.setMotorista(nome);
        caminhao.setMarca(marca);
        caminhao.setTamanho(tamanho);
        caminhao.setLocalAtual(local);
        caminhao.setListaDestino(lista);
        caminhao.setSalario(salario);
        caminhao.setKmLitros(km);
        
        
        return new BasicDBObject("Id", caminhao.getId())
                .append("Caminhao", caminhao.getMotorista())
                .append("Marca", caminhao.getMarca())
                .append("Tamanho", caminhao.getTamanho())
                .append("Local Atual", caminhao.getLocalAtual())
                .append("Lista Destinos", caminhao.getListaDestino())
                .append("salario", caminhao.getSalario())
                .append("km/litros", caminhao.getKmLitros());

    }
    
    
}
