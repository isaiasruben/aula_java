package polimorfismo;

public class Pagamento {

    public double pagamento (double valor)
    {
        return valor;
    }

    public Integer pagamento(Integer valorInteger, Integer parcelas)
    {
        return valorInteger/parcelas;
    }
    
    public long pagamento (Integer valorInteger, Integer parcelas, long juros)
    {
        return (valorInteger/parcelas)+juros;
    }
}
