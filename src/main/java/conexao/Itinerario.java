
package conexao;

import java.util.ArrayList;


public class Itinerario {
    
    private Long id;
    private Caminhoes idCaminhoes;
    private ArrayList<Cargas> idCarga;
    private ArrayList<Cidades> idCidades;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Caminhoes getIdCaminhoes() {
        return idCaminhoes;
    }

    public void setIdCaminhoes(Caminhoes idCaminhoes) {
        this.idCaminhoes = idCaminhoes;
    }

    public ArrayList<Cargas> getIdCarga() {
        return idCarga;
    }

    public void setIdCarga(ArrayList<Cargas> idCarga) {
        this.idCarga = idCarga;
    }

    public ArrayList<Cidades> getIdCidades() {
        return idCidades;
    }

    public void setIdCidades(ArrayList<Cidades> idCidades) {
        this.idCidades = idCidades;
    }
    
    
    
    
}
