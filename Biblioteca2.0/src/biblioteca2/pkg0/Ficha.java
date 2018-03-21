package biblioteca2.pkg0;

public abstract class Ficha {
    
    protected String referencia;
    protected String titulo;

    protected String getReferencia() {
        return referencia;
    }

    protected void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    protected String getTitulo() {
        return titulo;
    }

    protected void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void Visualizar(){

    }
    
    public String ToString(){
        
        return this.referencia;
}
}