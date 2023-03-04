package prefeitura.Recife.model;

import jakarta.persistence.*;

@Entity
@Table(name = "pessoas" )
public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private Integer idade;
    private Integer fila;

    public Pessoa() {
    }

    public Pessoa(String nome, Integer idade, Integer fila) {
        this.nome = nome;
        this.idade = idade;
        this.fila = fila;
    }

    public Pessoa(Integer id, String nome, Integer idade, Integer fila) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.fila = fila;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getFila() {
        return fila;
    }

    public void setFila(Integer fila) {
        this.fila = fila;
    }
}
