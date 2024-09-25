package administracion.tpo.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "inquilinos")
public class Inquilino  {
    @Id
    @GeneratedValue
    private int id;
    private int identificador;
    private String documento;

    public Inquilino() {
    }

    public Inquilino(int id, int identificador, String documento) {
        this.id = id;
        this.identificador = identificador;
        this.documento = documento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "Inquilino{" +
                "id=" + id +
                ", identificador=" + identificador +
                ", documento='" + documento + '\'' +
                '}';
    }
}
