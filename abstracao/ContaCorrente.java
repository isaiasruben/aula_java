class ContaCorrente implements Conta 
{
    @Override
    public void consultarSaldo()
    {
        System.out.println("O seu saldo actual é de: 12 MZN");
    }
    @Override
    public void fazerPix()
    {
        System.out.println("Para consultar o Pix introduza a senha");
    }
}