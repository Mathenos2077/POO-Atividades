import java.util.Date;
import java.text.SimpleDateFormat;
import com.j256.ormlite.table.DatabaseTable;
import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.field.DataType;

@DatabaseTable(tableName = "servico")
public class Servico
{   
    @DatabaseField(generatedId = true)
    private int id;
    
    @DatabaseField
    private String nome;
    
    @DatabaseField
    public float preco;
    
    @DatabaseField
    public String descricao;    

//Constructor Metohd
public Servico(){}
public Servico(String nome, String descricao, float preco){
    this.nome = nome;
    this.descricao = descricao;
    this.preco = preco;
}
    
//Start GetterSetterExtension Source Code

    /**GET Method Propertie id*/
    public int getId(){
        return this.id;
    }//end method getId

    /**SET Method Propertie id*/
    public void setId(int id){
        this.id = id;
    }//end method setId

    /**GET Method Propertie nome*/
    public String getNome(){
        return this.nome;
    }//end method getNOme

    /**SET Method Propertie nome*/
    public void setNome(String nome){
        this.nome = nome;
    }//end method setNome

    /**GET Method Propertie preco*/
    public float getPreco(){
        return this.preco;
    }//end method getPreco

    /**SET Method Propertie preco*/
    public void setPreco(float preco){
        this.preco = preco;
    }//end method setPreco

    /**GET Method Propertie descricao*/
    public String getDescricao(){
        return this.descricao;
    }//end method getDescricao

    /**SET Method Propertie descricao*/
    public void setDescricao(String descricao){
        this.descricao = descricao;
    }//end method setDecricao

//End GetterSetterExtension Source Code

}//End class