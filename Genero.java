public class Genero {
    private String nome;

    public Genero(String nome){
        if (nome==null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("⚠\uFE0FGÊNERO NÃO PODE SER NULO!⚠\uFE0F \n");
        }
        this.nome=nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome==null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("GÊNERO NÃO PODE SER NULO⚠\uFE0F!");
        }
        this.nome = nome;
    }
}
