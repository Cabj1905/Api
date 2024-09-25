package administracion.tpo.dao;

import administracion.tpo.modelo.Edificio;
import administracion.tpo.modelo.Inquilino;
import administracion.tpo.repository.IRepositotyInquilinos;

import java.util.List;
import java.util.Optional;

public class InquilinoDAO {
    private static InquilinoDAO instance;

    private InquilinoDAO(){

    }

    public static InquilinoDAO getInstance() {
        if(instance==null){
            instance = new InquilinoDAO();
        }
        return instance;
    }

    public List<Inquilino> getAll(IRepositotyInquilinos iRepositoryInquilino){
        return iRepositoryInquilino.findAll();
    }
    public Optional<Inquilino> getById(int codigo, IRepositotyInquilinos iRepositoryInquilino){
        return iRepositoryInquilino.findById(codigo);
    }

    public void save(Inquilino edificio, IRepositotyInquilinos iRepositoryInquilino){
        iRepositoryInquilino.save(edificio);
    }

    public void delete(int codigo, IRepositotyInquilinos iRepositoryInquilino){
        iRepositoryInquilino.deleteById(codigo);
    }
}
