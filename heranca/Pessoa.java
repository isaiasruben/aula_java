class Pessoa
{
    public static void main(String[] args) {
       PessoaDesenvolvedoraBackend pessoaDesenvolvedoraBackend= new PessoaDesenvolvedoraBackend("Isaias Munguambe", "java", 1000.0);
       pessoaDesenvolvedoraBackend.codar();

       System.out.println("****************");

       PessoaDesenvolvedora pessoaDesenvolvedora= new PessoaDesenvolvedora("Maria Jonas", "HTML", 123.4);
       pessoaDesenvolvedora.codar();
    }
}