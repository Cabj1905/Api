package administracion.tpo.dao;

import administracion.tpo.modelo.Duenios;
import administracion.tpo.modelo.Edificio;
import administracion.tpo.repository.IRepositoryDuenios;
import administracion.tpo.repository.IRepositoryEdificio;

import java.util.List;
import java.util.Optional;

public class DueniosDAO {
    private static DueniosDAO instance;

    private DueniosDAO(){

    }

    public static DueniosDAO getInstance() {
        if(instance==null){
            instance = new DueniosDAO();
        }
        return instance;
    }

    public List<Duenios> getAll(IRepositoryDuenios iRepositoryDuenios){
        return iRepositoryDuenios.findAll();
    }
    public Optional<Duenios> getById(int id, IRepositoryDuenios iRepositoryDuenios){
        return iRepositoryDuenios.findById(id);
    }
    public void save(Duenios duenios, IRepositoryDuenios iRepositoryDuenios){
         iRepositoryDuenios.save(duenios);
    }

    public void delete(int id, IRepositoryDuenios iRepositoryDuenios){
        iRepositoryDuenios.deleteById(id);
    }

}

