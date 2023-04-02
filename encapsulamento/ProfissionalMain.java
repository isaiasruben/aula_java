class ProfissionalMain
{
    public static void main(String[] args) 
    {
        Profissional profissional=new Profissional();
        profissional.idPublic=12;
        profissional.SalarioProtected=13.9;

        System.out.println(profissional.trabalharProtected());
    }
}