class Main{
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(7);

        arvoreBinaria.remover(10);
        arvoreBinaria.exibir("Pos");

    }
}