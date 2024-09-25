package administracion.tpo.modelo;
import jakarta.persistence.*;

@Entity
@Table(name = "duenios")
public class Duenios {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int identificador;
	
	
	private String documento;

	public Duenios() {
	}

	public Duenios(int id, int identificador, String documento) {
		this.id = id;
		this.identificador = identificador;
		this.documento = documento;
	}
	public Duenios(int identificador, String documento) {
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
		return "Duenios{" +
				"id=" + id +
				", identificador=" + identificador +
				", documento='" + documento + '\'' +
				'}';
	}
}
