package application.Controller.Admin;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

public class AdminController implements Initializable {

	public BorderPane admin_parent;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

		Model.getInstance().getViewFactory().getAdminSelectedMenuItem()
				.addListener((observableValue, oldVal, newVal) -> {
					switch (newVal) {
					case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
					default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
					}
				});

	}

}
