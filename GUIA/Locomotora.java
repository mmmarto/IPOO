
public class Locomotora
{
    private String modelo;
    private String identificacion;
    private int velocidadMax;
    private int velocidadAct;
    private boolean estado;
    private int carga;

    public void encender(){
        estado = true;
    }
    public void apagar(){
        estado = false;
    }
    public void acelerar(){
        velocidadAct++;
    }
    public void frenar(){
        velocidadAct--;
    }
    public void cargar(){
        carga++;
    }
    public int verificarCarga(){
        return carga;
    }
}