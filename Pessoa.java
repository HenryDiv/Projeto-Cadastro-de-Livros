public class Pessoa {
    private String nome;

    public  Pessoa(String nome){
        if(nome== null || nome.trim().isEmpty()){
            throw new IllegalArgumentException("⚠\uFE0FNOME DO AUTOR NÃO PODE SER NULO!⚠\uFE0F \n");

        }
        this.nome=nome;
    }
    public String getNomeCompleto(){
        return nome;
    }
}

