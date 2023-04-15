package application.Views;

import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.fxml.FXMLLoader;

public class ViewFactory {
	//Client Views
	private final StringProperty clientSelectedMenuItem;
	private AnchorPane dashboardView;
	private AnchorPane transactionsView;
	private AnchorPane AccountView;
	
	
	public ViewFactory(){
		this.clientSelectedMenuItem = new SimpleStringProperty("");
	}
	
	/*
	 * Client Views Section
	 */
	 
	public StringProperty getClientSelectedMenuItem() {
		return clientSelectedMenuItem;
	}
	
	public AnchorPane getDashboardView() {
		if (dashboardView = null) {
			try {
				dashboardView = new FXMLLoader(getClass().getResource("/Fxml/Client/Dashboard.fxml")).load();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		return dashboardView;
	}
	
	public Anchorpane getTransactionsView() {
		if (transactionView == null) {
			try {
				transactionView = new FXMLLoader(getClass().getResource("/Fxml/Client/Transactions.fxml")).load();
			} catch (Exception e){
				e.printStackTrace();
			}
		}
		return transactionsView;
	}
	
	public AnchorPane getAccountView() {
		if (accountView == null) {
			try {
				accountView = new FXMLLoader(getClass().getResource("/Fxml/Client/Account.fxml")).load();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return accountView;
	}
		
	
	public void showLoginWindow() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Login.fxml"));
		createStage(loader);			
	}
	
	public void showClientWindow() {
		FXMLLoader loader = new FXMLLoader(getClass().getResource("/Fxml/Client/Client.fxml"));
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
		stage.setTitle("Maze Bank");
		stage.show();			
	}
	
	public void closeStage(Stage stage) {
		stage.close();
	}
}
