

// Abstração
abstract class Bot {
    private String nome;

    public Bot(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public abstract String responder(String pergunta);
}



