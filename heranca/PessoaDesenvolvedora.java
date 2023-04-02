public class PessoaDesenvolvedora {
    private String nome;
    private String stack;
    private double salario;

    public PessoaDesenvolvedora(String nome, String stack, double salario) {
        this.nome = nome;
        this.stack = stack;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getStack() {
        return stack;
    }
    public void setStack(String stack) {
        this.stack = stack;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }

public void codar()
    {
    System.out.println(getNome()+" "+
        "Desenvolve usando :" +getStack());
    }
    
}
