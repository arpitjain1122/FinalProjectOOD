<<<<<<< HEAD
package application.Controllers.Admin;

import application.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
	public BorderPane admin_parent;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		Model.getInstance().getViewFactory().getAdminSelectedMenuItem()
				.addListener((observableValue, oldVal, newVal) -> {
					switch (newVal) {
					case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
					case DEPOSIT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
					default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
					}
				});
	}
}
=======
package application.Controllers.Admin;

import application.Models.Model;
import javafx.fxml.Initializable;
import javafx.scene.layout.BorderPane;

import java.net.URL;
import java.util.ResourceBundle;

public class AdminController implements Initializable {
	public BorderPane admin_parent;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		Model.getInstance().getViewFactory().getAdminSelectedMenuItem()
				.addListener((observableValue, oldVal, newVal) -> {
					switch (newVal) {
					case CLIENTS -> admin_parent.setCenter(Model.getInstance().getViewFactory().getClientsView());
					case DEPOSIT -> admin_parent.setCenter(Model.getInstance().getViewFactory().getDepositView());
					default -> admin_parent.setCenter(Model.getInstance().getViewFactory().getCreateClientView());
					}
				});
	}
}
>>>>>>> bce4b244d562c40de5c64c452dbd5eda7d6be521
