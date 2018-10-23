package Dao;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;
import java.util.Scanner;
import modelo.Caminhoes;

public class CaminhoesDao {

    
    
    // metodos
    
    public final DBObject insere(Caminhoes caminhao) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o id:");
        Long id = scan.nextLong();
        scan.nextLine();
        System.out.println("Digite o nome do Motorista:");
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
                .append("Motorista", caminhao.getMotorista())
                .append("Marca", caminhao.getMarca())
                .append("Tamanho", caminhao.getTamanho())
                .append("Local Atual", caminhao.getLocalAtual())
                .append("Lista Destinos", caminhao.getListaDestino())
                .append("salario", caminhao.getSalario())
                .append("km/litros", caminhao.getKmLitros());

    }

}
