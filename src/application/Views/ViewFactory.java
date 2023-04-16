package application.Views;

import application.Controller.Client.ClientController;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ViewFactory {
	// Client Views
	private final StringProperty clientSelectedMenuItem;
	private AnchorPane dashboardView;
	private AnchorPane transactionsView;
	private AnchorPane accountsView;

	public ViewFactory() {
		this.clientSelectedMenuItem = new SimpleStringProperty("");
	}

	/*
	 * Client Views Section
	 */

	public StringProperty getClientSelectedMenuItem() {
		return clientSelectedMenuItem;
	}

	public AnchorPane getDashboardView() {
		if (dashboardView == null) {
			try {
				dashboardView = new FXMLLoader(getClass().getResource("/resources/Fxml/Client/Dashboard.fxml")).load();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return dashboardView;
	}

	public AnchorPane getTransactionsView() {
		if (transactionsView == null) {
			try {
				transactionsView = new FXMLLoader(getClass().getResource("/resources/Fxml/Client/Transactions.fxml"))
						.load();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return transactionsView;
	}

	public AnchorPane getAccountView() {
		if (accountsView == null) {
			try {
				accountsView = new FXMLLoader(getClass().getResource("/resources/Fxml/Client/Accounts.fxml")).load();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return accountsView;
	}

	public void showLoginWindow() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/Fxml/Login.fxml"));
		createStage(loader);
	}

	public void showClientWindow() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/resources/Fxml/Client/Client.fxml"));
		ClientController clientController = new ClientController();
		loader.setController(clientController);
		createStage(loader);
	}

	private void createStage(FXMLLoader loader) {
		Scene scene = null;
		try {
			scene = new Scene(loader.load());
		} catch (Exception e) {
			e.printStackTrace();
		}
		Stage stage = new Stage();
		stage.setScene(scene);
		stage.setTitle("Bank");
		stage.show();
	}

	public void closeStage(Stage stage) {
		stage.close();
	}
}
