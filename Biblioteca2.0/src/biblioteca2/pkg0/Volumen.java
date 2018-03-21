package biblioteca2.pkg0;

public class Volumen extends Obra {
    
    private short nro;
    
    public Volumen (String referencia, String titulo, String autor, short nrePags, short nro ){
        super (referencia, titulo, autor, nrePags);
        this.nro = nro;
    }

    protected short getNro() {
        return nro;
    }

    protected void setNro(short nro) {
        this.nro = nro;
    }
    
    @Override
    public void Visualizar(){
        System.out.println("Referencia: "+this.referencia+" Titulo: "+this.titulo+" Autor: "+this.autor+
                " numero de paginas: "+this.nrePags+" numero de revista: "+this.nro);
    }
    
    
    
}
