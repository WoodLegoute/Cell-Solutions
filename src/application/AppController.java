package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;

public class AppController {
	
	Double price = 0.00;
	Double priceOfPack = 0.00;
	Double priceOfPhone = 0.00;
	Double priceOfOptOne = 0.00;
	Double priceOfOptTwo = 0.00;
	

    @FXML
    private CheckBox optTwo;
    
    @FXML
    private ToggleGroup packageGroup;
    
    @FXML
    private ToggleGroup phoneGroup;
    
    @FXML
    private Button buyBtn;
    
    @FXML
    private Button closeBtn;

    @FXML
    private RadioButton packTwo;

    @FXML
    private RadioButton packThree;

    @FXML
    private RadioButton phoneThree;

    @FXML
    private RadioButton packOne;

    @FXML
    private RadioButton phoneOne;

    @FXML
    private CheckBox Opt1;

    @FXML
    private RadioButton phoneTwo;

    @FXML
    private Label priceTxt;

    @FXML
    void buyPackage(ActionEvent event) {
    	System.out.println("buy button clicked");
    }
    
    @FXML
    void closeBtnAction(ActionEvent event) {
    	System.out.println("close button clicked");
    	System.exit(0);
    }
    
    @FXML
    void packageGroup(ActionEvent event) {
    	
    }
    
    @FXML
    void phoneGroup(ActionEvent event) {
    	
    }
    
    @FXML
    void packOneClicked(ActionEvent event) {
    	System.out.println("package one clicked");
    	String priceStr = "";
    	price = 0.00;
    	priceOfPack = 0.00;
    	priceOfPack = 45.00;
    	price = priceOfPhone + priceOfPack;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);	
    }
    
    @FXML
    void packTwoClicked(ActionEvent event) {
    	String priceStr = "";
    	price = 0.00;
    	priceOfPack = 0.00;
    	priceOfPack = 65.00;
    	price = priceOfPhone + priceOfPack;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);
    }
    
    @FXML
    void packThreeClicked(ActionEvent event) {
    	String priceStr = "";
    	price = 0.00;
    	priceOfPack = 0.00;
    	priceOfPack = 99.00;
    	price = priceOfPhone + priceOfPack;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);
    }
    
    @FXML
    void phoneOneClicked(ActionEvent event) {
    	String priceStr = "";
    	price = 0.00;
    	priceOfPhone = 0.00;
    	priceOfPhone = 29.95;
    	price = priceOfPack + priceOfPhone;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);
    }
    
    @FXML
    void phoneTwoClicked(ActionEvent event) {
    	String priceStr = "";
    	price = 0.00;
    	priceOfPhone = 0.00;
    	priceOfPhone = 49.95;
    	price = priceOfPack + priceOfPhone;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);
    }
    
    @FXML
    void phoneThreeClicked(ActionEvent event) {
    	String priceStr = "";
    	price = 0.00;
    	priceOfPhone = 0.00;
    	priceOfPhone = 99.95;
    	price = priceOfPack + priceOfPhone;
    	priceStr = (price)+"";
    	priceTxt.setText(priceStr);
    }

    @FXML
    void voiceMailChecked(ActionEvent event) {
    	System.out.println("voice mail checked");
    	
    	if(Opt1.isSelected()) {
    		String priceStr = "";
        	price = 0.00;
        	priceOfOptOne = 0.00;
        	priceOfOptOne = 5.00;
        	price = priceOfPack + priceOfPhone + priceOfOptOne + priceOfOptTwo;
        	priceStr = (price)+"";
        	priceTxt.setText(priceStr);
    	}
    	else if(!Opt1.isSelected()) {
    		price = priceOfPack + priceOfPhone + priceOfOptTwo;
    	}
    }

    @FXML
    void textMsgChecked(ActionEvent event) {
    	
    	if(optTwo.isSelected()) {
    		String priceStr = "";
        	price = 0.00;
        	priceOfOptTwo = 0.00;
        	priceOfOptTwo = 10.00;
        	price = priceOfPack + priceOfPhone + priceOfOptOne + priceOfOptTwo;
        	priceStr = (price)+"";
        	priceTxt.setText(priceStr);
    	}
    	else if (!optTwo.isSelected()){
    		price = priceOfPack + priceOfPhone + priceOfOptOne;
    		
    	}
    }

}
