package encapsulamento;

public class Profissional {

    private double salario;
    private Integer id;

    //Atributos públicos

    public double SalarioPublic;
    public Integer idPublic;

    // Atributos proteted's

    protected double SalarioProtected;
    protected Integer idProtected;

    public String trabalharPublico()
    {
        return "Trabalhador publico";
    }

    public String trabalharProtected()
    {
        return "Trabalhador protected";
    }

    public String trabalhadorPrivate()
    {
        return "Trabalhador Privado";
    }
    
}
