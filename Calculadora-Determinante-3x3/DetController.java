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
public class DetController
{
    DetView detView;
    Stage stage;
    Det det;
    public TextField a11;
    public TextField a12;
    public TextField a13;
    public TextField a21;
    public TextField a22;
    public TextField a23;
    public TextField a31;
    public TextField a32;
    public TextField a33;
    public Label resultado;
    
    /**
     * Construtor para objetos da classe IMCController
     */
    public DetController()
    {
        this.stage = new Stage();
        this.detView = new DetView();
        this.detView.setController(this);
    }
    
    public void iniciar() throws Exception {
        this.detView.start(this.stage);
        this.stage.show();
    }
    
    public void botaoCalcularClicado(Event  e) {
        try {
            double a110 = Double.parseDouble(a11.getText());
            double a120 = Double.parseDouble(a12.getText());
            double a130 = Double.parseDouble(a13.getText());
            double a210 = Double.parseDouble(a21.getText());
            double a220 = Double.parseDouble(a22.getText());
            double a230 = Double.parseDouble(a23.getText());
            double a310 = Double.parseDouble(a31.getText());
            double a320 = Double.parseDouble(a32.getText());
            double a330 = Double.parseDouble(a33.getText());
            Det det = new Det(a110, a120, a130, a210, a220, a230, a310, a320, a330);
            String resultado = String.valueOf(det.calcular());
            this.resultado.setText(resultado);
        } catch (NumberFormatException exception) {
            resultado.setText("Dados de entrada incompletos ou inválidos");
        }
    }
    
    public void botaoLimparClicado(Event e) {
        a11.setText("");
        a12.setText("");
        a13.setText("");
        a21.setText("");
        a22.setText("");
        a23.setText("");
        a31.setText("");
        a32.setText("");
        a33.setText("");
        resultado.setText("");
    }    
}
