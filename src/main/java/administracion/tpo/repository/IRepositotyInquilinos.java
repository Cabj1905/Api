package administracion.tpo.repository;

import administracion.tpo.modelo.Inquilino;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRepositotyInquilinos extends JpaRepository<Inquilino, Integer> {

}
