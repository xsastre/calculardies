package biblioteca2.pkg0;

public class Obra extends Ficha {
    
    protected String autor;
    protected short nrePags;
    
    public Obra (String referencia, String titulo, String autor, short nrePags){
        
        this.referencia = referencia;
        this.titulo = titulo;
        this.autor = autor;
        this.nrePags = nrePags;
    }

    protected String getAutor() {
        return autor;
    }

    protected void setAutor(String autor) {
        this.autor = autor;
    }

    protected short getNrePags() {
        return nrePags;
    }

    protected void setNrePags(short nrePags) {
        this.nrePags = nrePags;
    }
    
    @Override
    public void Visualizar(){
        System.out.println("Referencia: "+this.referencia+" Titulo: "+this.titulo+" Autor: "+this.autor+" numero de paginas: "+this.nrePags);
    }
    
    
}
