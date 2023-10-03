public class IphoneLuciano extends IPhone {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

//      Utilizando a parte de telefone
        iphone.answer();
        iphone.contactList();
        iphone.voiceMail();
        iphone.sendMensage();

//      Navegação na internet
        iphone.abrirPagina();
        iphone.exibirPagina();
        //Abrindo mais abas
        iphone.adicionarNovaAba();

//        Utilizando o tocador de música
        iphone.play();
        iphone.nextMusica();
        iphone.backMusic();
    }


}
