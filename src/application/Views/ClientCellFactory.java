package application.Views;

import application.Controllers.Admin.ClientCellController;
import application.Models.Client;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ListCell;

public class ClientCellFactory extends ListCell<Client> {
	@Override
	protected void updateItem(Client client, boolean empty) {
		super.updateItem(client, empty);
		if (empty) {
			setText(null);
			setGraphic(null);
		} else {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/Fxml/Admin/ClientCell.fxml"));
			ClientCellController controller = new ClientCellController(client);
			loader.setController(controller);
			setText(null);
			try {
				setGraphic(loader.load());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
