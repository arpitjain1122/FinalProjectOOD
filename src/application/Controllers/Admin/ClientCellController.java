package application.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Client;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class ClientCellController implements Initializable {
	public Label fName_lbl;
	public Label lName_lbl;
	public Label pAddress_lbl;
	public Label ch_acc_lbl;
	public Label sv_acc_lbl;
	public Label date_lbl;
	public Button delete_btn;

	private final Client client;

	public ClientCellController(Client client) {
		this.client = client;
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		fName_lbl.textProperty().bind(client.firstNameProperty());
		lName_lbl.textProperty().bind(client.lastNameProperty());
		pAddress_lbl.textProperty().bind(client.pAddressProperty());
		ch_acc_lbl.textProperty().bind(client.checkingAccountProperty().asString());
		sv_acc_lbl.textProperty().bind(client.savingsAccountProperty().asString());
		date_lbl.textProperty().bind(client.dateProperty().asString());
	}
}
