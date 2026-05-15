class Main{
    public static void main(String[] args) {
        ArvoreBinaria arvoreBinaria = new ArvoreBinaria();
        arvoreBinaria.inserir(10);
        arvoreBinaria.inserir(4);
        arvoreBinaria.inserir(7);
        arvoreBinaria.inserir(3);
        arvoreBinaria.inserir(15);
        arvoreBinaria.inserir(13);
        arvoreBinaria.inserir(16);
        arvoreBinaria.inserir(14);

        arvoreBinaria.remover(15);
        arvoreBinaria.exibir("Pos");

    }
}