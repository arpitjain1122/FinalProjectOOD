package application.Controller.Client;
package application.*;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ClientMenuController implements Initializable {

	public Button dashboard_btn;
	public Button transaction_btn;
	public Button account_btn;
	public Button profile_btn;
	public Button logout_btn;
	public Button report_btn;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		// TODO Auto-generated method stub
		addListerners();
	}
	
	private void addListerners() {
		dashboard_btn.setOnAction(event -> onDashboard());
		transaction_btn.setOnAction(event -> onTransactions());
		account_btn.setOnAction(event -> onAccounts());
	}
	
	private void onDashboard() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Dashboard");
	}
	
	private void onTransactions() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Transactions");
	}
	
	private void onAccounts() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set("Accounts");
	}
	
	
}
