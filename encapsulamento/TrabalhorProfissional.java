package encapsulamento;

public class TrabalhorProfissional {

    public static void main(String[] args) {
        Profissional profissional= new Profissional();
        profissional.idProtected=1;
        profissional.trabalharPublico();
        profissional.SalarioProtected=123.8;

        System.out.println(profissional.trabalharPublico());
    }
    
}
