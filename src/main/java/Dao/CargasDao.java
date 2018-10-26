
package Dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.ArrayList;
import java.util.Scanner; 

public class CargasDao {
    
        public static final DBObject toDBObject2(Cargas carga){
        Scanner scan= new Scanner(System.in);
        
        System.out.println("Digite o id da carga:");
        Long id = scan.nextLong();
        scan.nextLine();
        System.out.println("Digite o produto:");
        String produto = scan.nextLine();
        System.out.println("Digite o tamanho:");
        double tamanho = scan.nextDouble();
        scan.nextLine();
        System.out.println("Digite a origem:");
        String origem = scan.nextLine();
        System.out.println("Digite o destino");
        String destino = scan.nextLine();
        
        
        
        carga = new Cargas();
        carga.setId(id);
        carga.setProdutos(produto);
        carga.setTamanho(tamanho);
        carga.setOrigem(origem);
        carga.setDestino(destino);
        
        
        
        return new BasicDBObject("Id", carga.getId())
                .append("Produto", carga.getProdutos())
                .append("Tamanho", carga.getTamanho())
                .append("Origem", carga.getOrigem())
                .append("Destino", carga.getDestino());
    }
    

}
