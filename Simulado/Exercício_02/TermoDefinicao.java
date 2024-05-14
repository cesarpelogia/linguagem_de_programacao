package Exercício_02;
public class TermoDefinicao {
    private String termo;
    private String definicao;

    // Construtor
    public TermoDefinicao(String termo, String definicao) {
        this.termo = termo;
        this.definicao = definicao;
    }

    // Métodos de acesso

    // Retorna o termo
    public String getTermo() {
        return this.termo;
    }

    // Define o termo
    public void setTermo(String termo) {
        this.termo = termo;
    }

    // Retorna a definição
    public String getDefinicao() {
        return this.definicao;
    }

    // Define a definição
    public void setDefinicao(String definicao) {
        this.definicao = definicao;
    }
}
