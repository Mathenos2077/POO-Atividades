import javafx.stage.Stage;
import javafx.event.Event;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;

/**
 * Controla os dados do modelo e a interação com a interface (visão)
 * 
 * @author Matheus Teixeira 
 * @version 0.1
 */
public class CVController
{
    CVView cvView;
    Stage stage;
    public Label quantia_banho, quantia_tosagem, quantia_banhoetosagem, quantia_vacinacao,
                    quantia_cirurgia, quantia_parto, quantia_fisioterapia, quantia_castracao;
    public Label total;
    public Label labelMensagem;
    public double preco_ban = 40, preco_tos = 30, preco_bantos = 60, preco_vac = 50,
                  preco_cir = 400, preco_par = 200 , preco_fis = 120, preco_cast = 400;
    /**
     * Construtor para objetos da classe IMCController
     */
    public CVController()
    {
        this.stage = new Stage();
        this.cvView = new CVView();
        this.cvView.setController(this);
    }
    /**
     * Método responsável pelo funcionamento do botão "+"
     */
    public String botao_mais(String quantia, double preco){
        int quantidade = 99;
        labelMensagem.setText("Selecione os serviços desejados");
        if(Integer.parseInt(quantia)<99){
            quantidade = 1+(Integer.parseInt(quantia));
            double valor_inicial = Double.parseDouble(total.getText());
            double valor_final = valor_inicial + preco;
            total.setText(String.valueOf(valor_final));
            
            }
        return String.valueOf(quantidade);
    }
    /**
     * Método responsável pelo funcionamento do botão "-"
     */
    public String botao_menos(String quantia, double preco){
        int quantidade = 0;
        if(Integer.parseInt(quantia)>0){
            quantidade = (Integer.parseInt(quantia))-1;
            double valor_inicial = Double.parseDouble(total.getText());
            double valor_final = valor_inicial - preco;
            total.setText(String.valueOf(valor_final));
        }
        return String.valueOf(quantidade);
    }
    /**
     * Execução dos métodos ao terem seus respectivos botões acionados
     */
    public void click_mais_banho(Event e){
        this.quantia_banho.setText(botao_mais(quantia_banho.getText(), preco_ban));}
    public void click_mais_tosagem(Event e){
        this.quantia_tosagem.setText(botao_mais(quantia_tosagem.getText(), preco_tos));}
    public void click_mais_banhoetosagem(Event e){
        this.quantia_banhoetosagem.setText(botao_mais(quantia_banhoetosagem.getText(), preco_bantos));}
    public void click_mais_vacinacao(Event e){
        this.quantia_vacinacao.setText(botao_mais(quantia_vacinacao.getText(), preco_vac));}
    public void click_mais_cirurgia(Event e){
        this.quantia_cirurgia.setText(botao_mais(quantia_cirurgia.getText(), preco_cir));}
    public void click_mais_parto(Event e){
        this.quantia_parto.setText(botao_mais(quantia_parto.getText(), preco_par));}
    public void click_mais_fisioterapia(Event e){
        this.quantia_fisioterapia.setText(botao_mais(quantia_fisioterapia.getText(), preco_fis));}
    public void click_mais_castracao(Event e){
        this.quantia_castracao.setText(botao_mais(quantia_castracao.getText(), preco_cast));}
    
    public void click_menos_banho(Event e){
        this.quantia_banho.setText(botao_menos(quantia_banho.getText(), preco_ban));}
    public void click_menos_tosagem(Event e){
        this.quantia_tosagem.setText(botao_menos(quantia_tosagem.getText(), preco_tos));}
    public void click_menos_banhoetosagem(Event e){
        this.quantia_banhoetosagem.setText(botao_menos(quantia_banhoetosagem.getText(), preco_bantos));}
    public void click_menos_vacinacao(Event e){
        this.quantia_vacinacao.setText(botao_menos(quantia_vacinacao.getText(), preco_vac));}
    public void click_menos_cirurgia(Event e){
        this.quantia_cirurgia.setText(botao_menos(quantia_cirurgia.getText(), preco_cir));}
    public void click_menos_parto(Event e){
        this.quantia_parto.setText(botao_menos(quantia_parto.getText(), preco_par));}
    public void click_menos_fisioterapia(Event e){
        this.quantia_fisioterapia.setText(botao_menos(quantia_fisioterapia.getText(), preco_fis));}
    public void click_menos_castracao(Event e){
        this.quantia_castracao.setText(botao_menos(quantia_castracao.getText(), preco_cast));}
    
    /**
     * Método responsável por iniciar o aplicativo
     */
    public void iniciar() throws Exception {
        this.cvView.start(this.stage);
        this.stage.show();
    }
    /**
     * Método responsável pelo funcionamento do botão "Contratar"
     */
    public void click_contratar(Event  e) {
        if(Double.parseDouble(total.getText())>0){
            labelMensagem.setText("Serviço(s) Contratatos com Sucesso!");
            total.setText("0.0");
            quantia_banho.setText("0");
            quantia_tosagem.setText("0");
            quantia_banhoetosagem.setText("0");
            quantia_vacinacao.setText("0");
            quantia_cirurgia.setText("0");
            quantia_parto.setText("0");
            quantia_fisioterapia.setText("0");
            quantia_castracao.setText("0");
        }
    }
}
