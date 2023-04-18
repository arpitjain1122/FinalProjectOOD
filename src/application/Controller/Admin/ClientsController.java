package application.Controller.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;

public class ClientsController implements Initializable {
	public ListView clients_listview;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
        initClientsList();
        clients_listview.setItems(Model.getInstance().getClients());
        clients_listview.setCellFactory(e -> new ClientCellFactory());
    }

    private void initClientsList() {
        if (Model.getInstance().getClients().isEmpty()){
            Model.getInstance().setClients();
        }
    }
}
