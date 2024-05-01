import java.math.BigDecimal;
import java.math.RoundingMode;

public class ContaTerminal {
    
    private Integer numero;
    private String agencia;
    private Cliente cliente;
    private BigDecimal saldo;

    public ContaTerminal() {
    }

    public ContaTerminal(Integer numero, String agencia, Cliente cliente, BigDecimal saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }
    
    public Integer getNumero() {
        return numero;
    }
    public void setNumero(Integer numero) {
        this.numero = numero;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public BigDecimal getSaldo() {
        return saldo;
    }
    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Olá " + 
             cliente.getNome() + ", obrigado por criar uma conta em nosso banco, sua agência é " +
             agencia + ", conta " + numero + " e seu saldo " + 
             saldo.setScale(2, RoundingMode.HALF_UP) + " já está disponível para saque.";
    }

    

}
