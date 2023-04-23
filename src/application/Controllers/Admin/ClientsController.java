package application.Controllers.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Client;
import application.Models.Model;
import application.Views.ClientCellFactory;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ClientsController implements Initializable {
	public ListView<Client> clients_listview;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		initClientsList();
		clients_listview.setItems(Model.getInstance().getClients());
		clients_listview.setCellFactory(e -> new ClientCellFactory());
	}

	private void initClientsList() {
		if (Model.getInstance().getClients().isEmpty()) {
			Model.getInstance().setClients();
		}
	}
}
