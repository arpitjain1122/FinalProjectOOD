package application.Controller.Client;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import application.Views.ClientMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;

public class ClientMenuController implements Initializable {

	public Button dashboard_btn;
	public Button transaction_btn;
	public Button account_btn;
	public Button profile_btn;
	public Button logout_btn;
	public Button report_btn;
	public BorderPane client_parent;

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
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.DASHBOARD);
	}

	private void onTransactions() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.TRANSACTIONS);
	}

	private void onAccounts() {
		Model.getInstance().getViewFactory().getClientSelectedMenuItem().set(ClientMenuOptions.ACCOUNTS);
	}

}
