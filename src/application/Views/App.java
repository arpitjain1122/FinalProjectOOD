package application.Views;

import application.Models.Model;
import javafx.stage.Stage;
import javafx.application.Application;

public class App extends Application {
	@Override
	public void start(Stage stage) {
//		ViewFactory viewFactory = new ViewFactory();
//		viewFactory.showLoginWindow();
		Model.getInstance().getViewFactory().showLoginWindow();
	}
	

}
