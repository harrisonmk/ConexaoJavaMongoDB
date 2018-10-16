package conexao;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws UnknownHostException {

        List<String> livros = Arrays.asList("The vampire diaries","joao e maria");
        DBObject person = new BasicDBObject("_id", "jo")
                .append("name", "Harrison Mitchell")
                .append("Endereco", new BasicDBObject("Rua", "Sao judas Tadeu")
                        .append("cidade", "corumba")
                        .append("Estado", "MS")
                        .append("cep", 79310710))
                .append("livros", livros);

        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://localhost:27017"));
        DB database = mongoClient.getDB("BD2"); // nome do banco
        DBCollection collection = database.getCollection("caminhoneiro"); // nome do documento
        collection.insert(person); //insere a pessoa no banco

    }
}
