public class No {

    private Integer conteudo;
    private No depois;
    private No antes;

    No(Integer conteudo) {
        this.conteudo = conteudo;
        this.depois = null;
        this.antes = null;
    }


    
    public Integer getConteudo() {
        return conteudo;
    }
    
    public No getAntes() {
        return antes;
    }
    
    public No getDepois() {
        return depois;
    }

    public void setConteudo(Integer conteudo) {
        this.conteudo = conteudo;
    }
    
    public void setAntes(No antes) {
        this.antes = antes;
    }
    
    public void setDepois(No depois) {
        this.depois = depois;
    }
    

}
