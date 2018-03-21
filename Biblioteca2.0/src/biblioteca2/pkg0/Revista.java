package biblioteca2.pkg0;

public class Revista extends Ficha {
    
    protected short any;
    protected short nro;
    
    public Revista (String referencia, String titulo, short any, short nro){
        
        this.referencia = referencia;
        this.titulo = titulo;
        this.any = any;
        this.nro = nro;
        
    }

    protected short getAny() {
        return any;
    }

    protected void setAny(short any) {
        this.any = any;
    }

    protected short getNro() {
        return nro;
    }

    protected void setNro(short nro) {
        this.nro = nro;
    }
    
    @Override
    public void Visualizar(){
        System.out.println("Referencia: "+this.referencia+" Titulo: "+this.titulo+" Anio: "+this.any+" numero de revista: "+this.nro);
    }
    
    
}
