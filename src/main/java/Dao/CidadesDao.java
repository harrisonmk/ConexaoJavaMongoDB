package Dao; 

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.Scanner; 
import modelo.Cidades;
 
public class CidadesDao {

    public final DBObject insere() { 
    
    ArrayList<String> vizinhos = new ArrayList();
    ArrayList<Double> distancias = new ArrayList(); 
        Scanner scan = new Scanner(System.in); 
 
        System.out.println("Digite o id:"); 
        Long id = scan.nextLong(); 
        scan.nextLine(); 
        System.out.println("Digite o nome:"); 
        String nome = scan.nextLine(); 
        System.out.println("Digite os vizinhos:"); 
        String vizinho = scan.nextLine(); 
        System.out.println("Digite distância:"); 
        double dist = scan.nextDouble(); 
        scan.nextLine(); 
        System.out.println("Digite o valor do combustível"); 
        double valor = scan.nextDouble(); 
        
    Cidades cidade; 
        cidade = new Cidades();
        cidade.setId(id); 
        cidade.setNome(nome); 
        cidade.setVizinhos(vizinhos); 
        cidade.setDistancia(distancias); 
        cidade.setValorCombustivel(valor); 
       
    vizinhos.add(vizinho);
    distancias.add(dist);
 
        return new BasicDBObject("Id", cidade.getId()) 
                .append("Nome", cidade.getNome()) 
                .append("Vizinhos", cidade.getVizinhos()) 
                .append("Distância", cidade.getDistancia()) 
                .append("Valor", cidade.getValorCombustivel()) ;
              
                }           
 
    } 
