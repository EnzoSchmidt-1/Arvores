public class Main {
    public static void main(String[] args) {
        ArvoreBinaria arvore = new ArvoreBinaria();

        arvore.inserir(arvore.raiz, 5);
        arvore.inserir(arvore.raiz, 3);
        arvore.inserir(arvore.raiz, 7);
        arvore.inserir(arvore.raiz, 2);
        arvore.inserir(arvore.raiz, 4);
        arvore.inserir(arvore.raiz, 6);
        arvore.inserir(arvore.raiz, 8);

        System.out.println("Em ordem:");
        arvore.emOrdem(arvore.raiz);

        System.out.println("\nPré-ordem:");
        arvore.preOrdem(arvore.raiz);
    }

}
