import java.sql.*;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.dao.Dao;
import java.sql.SQLException;
import com.j256.ormlite.table.TableUtils;
import java.util.List;
import java.util.ArrayList;

public class Main{
    public static void main(String[] args){
        Database database = new Database("servico_db");
        try{
            database.getConnection();
        }
        catch (SQLException e){
            System.out.println("Falha na criação do banco de dados.");
        }
        
        Servico servico1 = new Servico("Lavagem Completa","Lavagem Completa na Parte Interna e Externa do Veículo.",120);
        Servico servico2 = new Servico("Limpeza Interna","Limpeza na Parte Interna do Veículo.",60);
        Servico servico3 = new Servico("Lavagem Externa","Lavagem na Parte Externa do Veículo.",60);
        
        ServicoRepository servicoRepository = new ServicoRepository(database);
        servico1 = servicoRepository.create(servico1);
        servico2 = servicoRepository.create(servico2);
        servico3 = servicoRepository.create(servico3);
        
        servico1.setNome("Insufilm");
        servico1.setDescricao("Instalação de Insufilm no seu Veículo");
        servico1.setPreco(300);
    
        servico3.setNome("Jato Rápido");
        servico3.setDescricao("Uma Lavagem Rápida na Parte Externa do Veículo.");
        servico3.setPreco(35);
        
        servicoRepository.update(servico1);
        servicoRepository.update(servico3);
        
        servicoRepository.delete(servico1);
        servicoRepository.deleteById(servico2.getId());
        
    }
}
