class ContaPoupanca implements Conta
{
    @Override
    public void consultarSaldo()
    {
        System.out.println("O seu saldo actual é de: 12 MZN");
    }
    @Override
    public void fazerPix()
    {
        System.out.println("Estas lixado!");
    }
}
