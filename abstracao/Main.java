class Main
{
    public static void main(String[] args) {
        System.out.println("Fazendo teste");
        ContaPoupanca contaPoupanca=new ContaPoupanca();
        ContaCorrente contaCorrente= new ContaCorrente();

        contaCorrente.consultarSaldo();
        contaPoupanca.fazerPix();
    }
}