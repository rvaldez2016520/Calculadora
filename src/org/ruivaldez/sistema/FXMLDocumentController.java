package org.ruivaldez.sistema;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class FXMLDocumentController implements Initializable {
    
    float dato1, dato2,i,resultado;
    int op;
    
    @FXML private TextField txtValores;
    @FXML private Button btnMasMenos;
    @FXML private Button btnCero;
    @FXML private Button btnPunto;
    @FXML private Button btnUno;
    @FXML private Button btnDos;
    @FXML private Button btnTres;
    @FXML private Button btnCuatro;
    @FXML private Button btnCinco;
    @FXML private Button btnSeis;
    @FXML private Button btnSiete;
    @FXML private Button btnOcho;
    @FXML private Button btnNueve;
    @FXML private Button btnUnoX;
    @FXML private Button btnCE;
    @FXML private Button btnC;
    @FXML private Button btnMulti;
    @FXML private Button btnDivi;
    @FXML private Button btnResta;
    @FXML private Button btnSuma;
    @FXML private Button btnPorciento;
    @FXML private Button btnXY;
    @FXML private Button btnIgual;
    
    
    @FXML 
    private void handleButtonAction(ActionEvent event){
        //Numeros
        if (event.getSource()==btnUno)
            txtValores.setText(txtValores.getText()+"1");
        else if (event.getSource()==btnDos)
            txtValores.setText(txtValores.getText()+"2");
        else if (event.getSource()==btnTres)
            txtValores.setText(txtValores.getText()+"3");
        else if (event.getSource()==btnCuatro)
            txtValores.setText(txtValores.getText()+"4");
        else if(event.getSource()==btnCinco)
            txtValores.setText(txtValores.getText()+"5");
        else if(event.getSource()==btnSeis)
            txtValores.setText(txtValores.getText()+"6");
        else if(event.getSource()==btnSiete)
            txtValores.setText(txtValores.getText()+"7");
        else if(event.getSource()==btnOcho)
            txtValores.setText(txtValores.getText()+"8");
        else if(event.getSource()==btnNueve)
            txtValores.setText(txtValores.getText()+"9");
        else if(event.getSource()==btnCero)
            txtValores.setText(txtValores.getText()+"0");
        //C 
        else if(event.getSource()==btnC){
            txtValores.clear();  
        //CE
        }else if(event.getSource()==btnCE){ 
            txtValores.setText("");   
        // Punto
        } else if( event.getSource()==btnPunto){
            if (txtValores.getText().length()<=0){
            txtValores.setText("0.");
        } else if (!(txtValores.getText().contains("."))){
                txtValores.setText(txtValores.getText()+".");
                }
        //Porciento
        }else if(event.getSource()==btnPorciento){
            dato2 = Float.parseFloat(txtValores.getText());
            resultado = dato1 * dato2 / 100;
            txtValores.setText(String.valueOf(resultado));
        //MasMenos
        }else if(event.getSource()==btnMasMenos){
            i = Float.parseFloat(txtValores.getText());
            resultado = i * -1;
            txtValores.setText(String.valueOf(resultado));
        //UnoX
        }else if(event.getSource()==btnUnoX){
            dato1 = Float.parseFloat(txtValores.getText());
            resultado = 1 / dato1;
            txtValores.setText(String.valueOf(resultado));
        //Suma
        }else if (event.getSource()==btnSuma){
            dato1 = dato1 + Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 1;
        //Resta
        } else if (event.getSource()==btnResta){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 2;
        //Multiplicacion
        } else if (event.getSource()==btnMulti){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 3;
        //Division
        } else if (event.getSource()==btnDivi){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 4;
        //X a la Y
        } else if (event.getSource()==btnXY){
            dato1 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");
            op = 5;
        //Igual
        }else if (event.getSource()==btnIgual){
            dato2 = Float.parseFloat(txtValores.getText());
            txtValores.setText("");  
        switch(op){
            case 1:
                resultado = dato1 + dato2;
                txtValores.setText(String.valueOf(resultado));
                dato1 = 0;
            break;
            case 2:
                resultado = dato1 - dato2;
                txtValores.setText(String.valueOf(resultado));
                dato1 = 0;
            break;    
            case 3:
                resultado = dato1 * dato2;
                txtValores.setText(String.valueOf(resultado));
            break; 
            case 4:
                if( dato2 == 0){
                    txtValores.setText("Indivisible entre 0");
                }else{
                    resultado = dato1 / dato2;
                    txtValores.setText(String.valueOf(resultado));   
                }
            break;
            case 5:
                resultado = 1;
                for(i = 1; i <= dato2 ; i++){
                    resultado = resultado * dato1;
                }
                txtValores.setText(String.valueOf(resultado));         
            break;
        }
            
        }      
    }    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}


