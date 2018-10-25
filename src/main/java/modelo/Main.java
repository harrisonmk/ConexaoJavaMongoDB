package modelo;

import Dao.CaminhoesDao;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import org.bson.Document;

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
        //List<Caminhoes> caminhoes = new ArrayList<>();
        /*MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("BD2"); // nome do banco
        DBCollection collection = database.getCollection("caminhoneiro"); // nome do documento
        //collection.insert(person); //insere a pessoa no banco

        Caminhoes caminhao = new Caminhoes();
        CaminhoesDao caminhoes = new CaminhoesDao();
        //toDBObject(caminhao);

        collection.insert(caminhoes.insere(caminhao));*/
        menuOpcao();

    }

    public static void menuOpcao() throws UnknownHostException {

        Scanner scan = new Scanner(System.in);

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("BD2"); // nome do banco
        DBCollection collection = database.getCollection("caminhoneiro"); // nome do documento

        int opcao;
        while (true) {
            menu();
            opcao = scan.nextInt();
            switch (opcao) {

                case 1:

                    Caminhoes caminhao = new Caminhoes();
                    CaminhoesDao caminhoes = new CaminhoesDao();

                    collection.insert(caminhoes.insere(caminhao));

                    break;

                case 2:

                    // Creating a Mongo client 
                    //MongoClient mongo = new MongoClient("localhost", 27017);
                    // Accessing the database 
                    //MongoDatabase database = mongo.getDatabase("BD2");
                    // Retrieving a collection 
                    //MongoCollection<Document> collection = database.getCollection("caminhoneiro");
                    System.out.println("Collection sampleCollection selected successfully");

                    // Getting the iterable object 
                    DBCursor iterDoc = collection.find();
                    int i = 1;

                    // Getting the iterator 
                    Iterator it = iterDoc.iterator();

                    while (it.hasNext()) {
                        System.out.println(it.next());
                        i++;
                    }

                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Opcao Invalida");
            }

        }

    }

    public static void menu() {

        System.out.println("Digite 1 para inserir");
        System.out.println("Digite 2 para listar");
        System.out.println("Digite 0 para sair.");
        System.out.print("Opcao: ");
    }

}
