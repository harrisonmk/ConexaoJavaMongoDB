

package modelo;


public class Caminhoes {
    
    private Long id;
    private String Motorista;
    private String marca;
    private double tamanho;
    private String localAtual;
    private String listaDestino;
    private double salario;
    private double salarioMotorista;
    private double kmLitros;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotorista() {
        return Motorista;
    }

    public void setMotorista(String Motorista) {
        this.Motorista = Motorista;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getLocalAtual() {
        return localAtual;
    }

    public void setLocalAtual(String localAtual) {
        this.localAtual = localAtual;
    }

    public String getListaDestino() {
        return listaDestino;
    }

    public void setListaDestino(String listaDestino) {
        this.listaDestino = listaDestino;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalarioMotorista() {
        return salarioMotorista;
    }

    public void setSalarioMotorista(double salarioMotorista) {
        this.salarioMotorista = salarioMotorista;
    }

    public double getKmLitros() {
        return kmLitros;
    }

    public void setKmLitros(double kmLitros) {
        this.kmLitros = kmLitros;
    }
    
    
    
    
    
}
