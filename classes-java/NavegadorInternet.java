public interface NavegadorInternet {
    String paginaAtual;
    List<String> abas;

    void exibirPagina(String url){
    };

    void adicionarNovaAba(String url){
    };

    void atualizarPagina(){
    };
}