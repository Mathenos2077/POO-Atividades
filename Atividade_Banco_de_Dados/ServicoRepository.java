import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class ServicoRepository
{
    private static Database database;
    private static Dao<Servico, Integer> dao;
    private List<Servico> loadedServicos;
    private Servico loadedServico; 
    
    public ServicoRepository(Database database) {
        ServicoRepository.setDatabase(database);
        loadedServicos = new ArrayList<Servico>();
    }
    
    public static void setDatabase(Database database) {
        ServicoRepository.database = database;
        try {
            dao = DaoManager.createDao(database.getConnection(), Servico.class);
            TableUtils.createTableIfNotExists(database.getConnection(), Servico.class);
        }
        catch(SQLException e) {
            System.out.println(e);
        }            
    }
    
    public Servico create(Servico servico) {
        int nrows = 0;
        try {
            nrows = dao.create(servico);
            if ( nrows == 0 )
                throw new SQLException("Error: object not saved");
            this.loadedServico = servico;
            loadedServicos.add(servico);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return servico;
    }    

    public void update(Servico servico) {
      try{
          dao.update(servico);
      }catch (Exception e){
          System.out.println("Não foi possível executar a atualização.");
      }
    }
    
    public void delete(Servico servico) {
      try{
          dao.delete(servico);
      } catch (Exception e){
          System.out.println("Não foi possível executar a exclusão.");
      }
    }
    
    public void deleteById(int id){
        try{
            dao.deleteById(id);
        } catch (Exception e){
            System.out.println("Não foi possível executar a exclusão.");
        }
    }
    
    public Servico loadFromId(int id) {
        try {
            this.loadedServico = dao.queryForId(id);
            if (this.loadedServico != null)
                this.loadedServicos.add(this.loadedServico);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedServico;
    }    
    
    public List<Servico> loadAll() {
        try {
            this.loadedServicos =  dao.queryForAll();
            if (this.loadedServicos.size() != 0)
                this.loadedServico = this.loadedServicos.get(0);
        } catch (SQLException e) {
            System.out.println(e);
        }
        return this.loadedServicos;
    }

    // getters and setters ommited...        
}