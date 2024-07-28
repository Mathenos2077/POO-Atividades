package model;

import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;
/**
 *  Class Repositório Servico
 * 
 * @author Matheus TP
 */
public class ServicoRepository{
    private static Database database;
    private static Dao<Servico, Integer> dao;
    private List<Servico> loadedServicos;
    private Servico loadedServico;
    /**
     * Construtor de ServicoRepository.
     * 
     * @param database o banco de dados sobre o qual o repositório vai operar.
     */
    public ServicoRepository(Database database) {
        ServicoRepository.setDatabase(database);
        loadedServicos = new ArrayList<Servico>();
    }
    /**
     * seleciona o banco de dados sobre o qual o repositório vai operar.
     * 
     * @param database novo banco de dados a ser operado.
     */
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
    /**
     * Salva uma instância de Servico no banco de dados
     * 
     * @param servico instância de Servico
     */
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
    /**
     * Substitui a instância salva no banco de dados que possui o mesmo ID que a do parâmetro
     * pela instância do parâmetro;
     * 
     * @param servico instância de servico a ser atribuída
     */
    public void update(Servico servico) {
      try{
          dao.update(servico);
      }catch (SQLException e){
          System.out.println("Não foi possível executar a atualização.");
      }
    }
    /**
     * Deleta a instância salva no banco de dados que possui o ID passado no parâmetro.
     * 
     * @param id id da instância a ser deletada.
     */
    public void deleteById(int id){
        try{
            dao.deleteById(id);
        } catch (SQLException e){
            System.out.println("Não foi possível executar a exclusão.");
        }
    }
    /**
     * Retorna o número de instâncias de Servicos salvas no banco de dados.
     */
    public int numServicos(){
        long i = 0;
        try{
            i = dao.countOf();
        } catch (SQLException e){
        }
        return (int)i;
    }
    /**
     * Retorna a instância de Servico salva no banco de dados que possui o ID do parâmetro.
     * 
     * @param id id da instância a ser retornada.
     */
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
    /**
     * Retorna uma lista com todas as instância de Servicos salvas no banco de dados.
     */
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
}
