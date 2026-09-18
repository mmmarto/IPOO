import java.util.Date;

public class CuentaBancaria
{
    private String titular;
    private int saldo;
    private int maxExtracciones;
    private Date fechaCreacion;
    private int cantidad;
    
    public void depositar(int cantidad){
        saldo += cantidad;
    }
    public void retirar(int cantidad){
        saldo -= cantidad;;
    }
    public int getSaldo(){
        return saldo;
    }
    public int getMaxExtracciones(){
        return maxExtracciones;
    }
    
    }
