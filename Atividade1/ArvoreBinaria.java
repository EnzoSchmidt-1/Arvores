public class ArvoreBinaria {
    No raiz;

    public ArvoreBinaria() {
        this.raiz = new No(null);
    }

    public void inserir(Integer conteudo) {
        No novoNo = new No(conteudo);
        //inserirRecursivo(novoNo, this.raiz);
        inserirIterativo(novoNo);
    }
    
    private void inserirRecursivo(No no, No atual) {
        if(estaVazia()) {
            this.raiz = no;
            return;
        }
        if(no.getConteudo() > atual.getConteudo()) {
            if(atual.getDireita() == null) {
                atual.setDireita(no);
                return;
            } else {
                inserirRecursivo(no, atual.getDireita());
            }
        } else {
            if(atual.getEsquerda() == null) {
                atual.setEsquerda(no);
                return;
            } else {
                inserirRecursivo(no, atual.getEsquerda());
            }
        }
    }

    private void inserirIterativo(No no) {
        if(estaVazia()) {
            this.raiz = no;
            return;
        } else {
            No aux = this.raiz;
            while(aux != null) {
                if(no.getConteudo() > aux.getConteudo()) {
                    if(aux.getDireita() == null) {
                        aux.setDireita(no);
                        return;
                    } else {
                        aux = aux.getDireita();
                    }
                } else {
                    if(aux.getEsquerda() == null) {
                        aux.setEsquerda(no);
                        return;
                    } else {
                        aux = aux.getEsquerda();
                    }
                }
            }
        }

    }

    public boolean estaVazia() {
        if(this.raiz.getConteudo() == null) {
            return true;
        } else {
            return false;
        }
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

    private void preOrdem(No no) {
        if(no == null) {
            return;
        }
        System.out.println(no.getConteudo());
        preOrdem(no.getEsquerda());
        preOrdem(no.getDireita());
    }

    private void emOrdem(No no) {
        if(no == null) {
            return;
        }
        emOrdem(no.getEsquerda());
        System.out.println(no.getConteudo());
        emOrdem(no.getDireita());
    }

    private void posOrdem(No no) {
        if(no == null) {
            return;
        }
        posOrdem(no.getEsquerda());
        posOrdem(no.getDireita());
        System.out.println(no.getConteudo());
    }

    //Adicionar um metodo para remover um nó da arvore

    public void remover(Integer conteudo){
        No novoNo = new No(conteudo);
        removerProcesso(novoNo, this.raiz, conteudo);
        novoNo = removerProcesso(novoNo, novoNo, conteudo);

    }

    private No removerProcesso(No no, No atual, Integer conteudo) {
        if (estaVazia()) {
            return null;
        }
        if(atual.getConteudo() != conteudo) {

            if (atual.getConteudo() > conteudo) {
                removerProcesso(no, atual.getEsquerda(), conteudo);
                            
            } 
            
            if (atual.getConteudo() < conteudo) {
                removerProcesso(no, atual.getDireita(), conteudo);
            }

            if (atual.getConteudo() == conteudo) {
                if (atual.getEsquerda() == null && atual.getDireita() == null) {
                    atual.setConteudo(null);
                }else if (atual.getDireita() != null && atual.getEsquerda() != null) {

                }else if (atual.getDireita() == null || atual.getEsquerda() == null) {
                    if (atual.getDireita() != null) {
                        atual.setConteudo(atual.getDireita().getConteudo());
                        atual.setDireita(atual.getDireita().getDireita());
                        
                    }else {
                        atual.setConteudo(atual.getEsquerda().getConteudo());
                        atual.setEsquerda(atual.getEsquerda().getEsquerda());
                        atual.setDireita(atual.getEsquerda().getDireita());
                    }
                    
                }
            }
            
        }else if (atual.getDireita() == null && atual.getEsquerda() == null) {
            atual = null;
            return atual;       

        }else if (atual.getDireita() != null && atual.getEsquerda() != null) {
            
        }else if (atual.getDireita() == null || atual.getEsquerda() == null) {
            if (atual.getDireita() != null) {
                atual.setConteudo(atual.getDireita().getConteudo());
                atual.setDireita(atual.getDireita().getDireita());
            }else {
                atual.setConteudo(atual.getEsquerda().getConteudo());
                atual.setDireita(atual.getEsquerda().getDireita());
                atual.setEsquerda(atual.getEsquerda().getEsquerda());
                
            }
            
        }

        return atual;
    }
    
}