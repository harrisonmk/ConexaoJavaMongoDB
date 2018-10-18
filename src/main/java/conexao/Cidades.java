
package conexao;

import java.util.ArrayList;


public class Cidades {
    
    private Long id;
    private String nome;
    private ArrayList<String> vizinhos;
    private ArrayList<Double> distancia;
    private double valorCombustivel;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<String> getVizinhos() {
        return vizinhos;
    }

    public void setVizinhos(ArrayList<String> vizinhos) {
        this.vizinhos = vizinhos;
    }

    public ArrayList<Double> getDistancia() {
        return distancia;
    }

    public void setDistancia(ArrayList<Double> distancia) {
        this.distancia = distancia;
    }

    public double getValorCombustivel() {
        return valorCombustivel;
    }

    public void setValorCombustivel(double valorCombustivel) {
        this.valorCombustivel = valorCombustivel;
    }
    
    
    
    
    
}
