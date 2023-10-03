public class IPhone implements InternetNavegator, Music, Phone {

    private Music music;

    private Phone phone;

    private InternetNavegator internetNavegator;


    @Override
    public void exibirPagina() {
		System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
		System.out.println("Adicionar nova aba ");
    }

    @Override
    public void atualizarPagina() {
		System.out.println("Receber página atualizada ");
    }

    @Override
    public void abrirPagina() {
		System.out.println("Abrir nova página ");
    }

    @Override
    public void play() {
		System.out.println("Tocar música ");
    }

    @Override
    public void musicSelect() {
		System.out.println("Executar músicas selecionadas ");
    }

    @Override
    public void SycMusics() {
		System.out.println("Atualizar música com receptório local ");
    }

    @Override
    public void SearchMusic() {
		System.out.println("Procurar música selecionada ");
    }

    @Override
    public void nextMusica() {
		System.out.println("Ir para a próxima música da lista ");
    }

    @Override
    public void backMusic() {
		System.out.println("Voltar música anterior ");
    }

    @Override
    public void call() {
		System.out.println("Ligação telefonica");
    }

    @Override
    public void answer() {
		System.out.println("Atender chamada ");
    }

    @Override
    public void voiceMail() {
		System.out.println("Reproduzir mensagens de caixas de mensagem ");
    }

    @Override
    public void contactList() {
		System.out.println("Abrir lista de Contatos ");
    }

    @Override
    public void sendMensage() {
		System.out.println("Enviar mensagem ");
    }
}
