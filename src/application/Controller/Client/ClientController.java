package application.Controller.Client;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class ClientController implements Initializable {
	public BorderPane client_parent;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		Model.getInstance().getViewFactory().getClientSelectedMenuItem()
				.addListener((observableValue, oldVal, newVal) -> {
					switch (newVal) {
					case TRANSACTIONS ->
						client_parent.setCenter(Model.getInstance().getViewFactory().getTransactionsView());
					case ACCOUNTS -> client_parent.setCenter(Model.getInstance().getViewFactory().getAccountView());                    
					default -> client_parent.setCenter(Model.getInstance().getViewFactory().getDashboardView());                
					}
				});

	}

}
