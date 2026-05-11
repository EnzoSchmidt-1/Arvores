public class ArvoreBinaria {

    No raiz;
    
    public ArvoreBinaria(){
        this.raiz = new No(null);
    };

    public void inserir(No no,Integer conteudo) {

        No novoNo = new No(conteudo);

        inserirIterativo(novoNo);

    }

    private void inserirIterativo(No no) {
        if(estaVazia()) {
            this.raiz = no;
            return;
        } else {
            No aux = this.raiz;
            while(aux != null) {
                if(no.getConteudo() > aux.getConteudo()) {
                    if(aux.getDepois() == null) {
                        aux.setDepois(no);
                        return;
                    } else {
                        aux = aux.getDepois();
                    }
                } else {
                    if(aux.getAntes() == null) {
                        aux.setAntes(no);
                        return;
                    } else {
                        aux = aux.getAntes();
                    }
                }
            }
        }

    }

    public void inserirRecursivo(No no, No atual) {
        if (estaVazia()) {
            atual = no;
            return;
        }

        if (atual.getConteudo() > no.getConteudo()) {

            if (atual.getDepois() == null) {
                no.setDepois(atual);
            } else {
                inserirRecursivo(no.getAntes(), atual);
            }

        } else {
            if (no.getDepois().getConteudo() == null) {
                no.setDepois(atual);
            } else {
                inserirRecursivo(no.getDepois(), atual);
            }
        }
    }

    public void emOrdem(No no){
        if (no == null) {
            return;
        }
        emOrdem(no.getAntes());
        System.out.print(no.getConteudo() + " ");
        emOrdem(no.getDepois());

    }
    
    public void preOrdem(No no){
        if (no == null) {
            return;
        }
        System.out.print(no.getConteudo() + " ");
        preOrdem(no.getAntes());
        preOrdem(no.getDepois());

    }
    public void exibir(String percurso) {
        switch(percurso){
            case("Pre"):
                preOrdem(this.raiz);
                break;
            case("Em"):
                emOrdem(this.raiz);
                break;
            case("Pos"):
                posOrdem(this.raiz);
                break;
        }

    }
    public void posOrdem(No no){
        if (no == null) {
            return;
        }
        posOrdem(no.getAntes());
    }

    public boolean estaVazia(){
        if (raiz.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
    }
}
