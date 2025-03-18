/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjetoMVC_Tasks.model;

/**
 *
 * @author LEANDROHENRIQUESANTO
 */
public class Tarefa {
    
    private int id;
    private String titulo;
    private String descricao;
    private int data_vencimento;
    private String status;

    // Construtor
    public Tarefa( String titulo, String descricao, int data_vencimento, String status) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.data_vencimento = data_vencimento;
        this.status = status;
    }

    // Métodos Getters e Setters para acessar os atributos
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getData_vencimento() {
        return data_vencimento;
    }

    public void setData_vencimento(int data_vencimento) {
        this.data_vencimento = data_vencimento;
    }
    
        public String getStatus() {
        return status;
        }
        
        public void setStatus(String status){
            this.status = status;
        }
        
        
}
