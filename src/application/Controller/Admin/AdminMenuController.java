package application.Controller.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import application.Views.AdminMenuOptions;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class AdminMenuController implements Initializable {
	public Button create_client_btn;
	public Button clients_btn;
	public Button deposit_btn;
	public Button logout_btn;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		addListerners();
	}

	private void addListerners() {
		create_client_btn.setOnAction(event -> onCreateClient());
		clients_btn.setOnAction(event -> onClients());
	}

	private void onCreateClient() {
		Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CREATE_CLIENT);
	}

	private void onClients() {
		Model.getInstance().getViewFactory().getAdminSelectedMenuItem().set(AdminMenuOptions.CLIENTS);
	}

}
