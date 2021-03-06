/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author helmuth
 */
public class CaminhoesCRUD {
    ArrayList<Caminhoes> cami = new ArrayList(); 
    static final Scanner ler = new Scanner(System.in);
    
    public void inserirCaminhao(Caminhoes caminhao){
        
        System.out.print("Insira o ID: ");
       Long id = ler.nextLong();
        
        System.out.print("Insira o motorista: ");
       String motorista = ler.nextLine();
        
        System.out.print("Insira a Marca: ");
       String marca = ler.nextLine();
        
        System.out.print("Insira o Local Atual: ");
       String localAtual = ler.nextLine();
        
        System.out.print("Insira o Local Destino: ");
       String localDestino = ler.nextLine();
        
        System.out.print("Insira o tamanho: ");
       double tamanho = ler.nextDouble();
        
        System.out.print("Insira o Salario: ");
       double salario = ler.nextDouble();
        
        System.out.print("Insira o SalarioMotorista: ");
       double salarioMotorista = ler.nextDouble();
        
        caminhao.setId(id);
        caminhao.setMotorista(motorista);
        caminhao.setMarca(marca);
        caminhao.setLocalAtual(localAtual);
        caminhao.setListaDestino(localDestino);
        
        cami.add(caminhao);
    }
    
    public void excluirCaminhao(){
        System.out.print("Insira o ID do caminhao: ");
        Long id = ler.nextLong();
        
        for(int i = 0; i < cami.size();i++){
           Caminhoes cam = cami.get(i);
            if(id == cam.getId()){
                cami.remove(cam);
                System.out.println("Caminhao removida com sucesso!!");
                break;
            }
        }
    }
    
    
}
