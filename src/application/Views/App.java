package application.Views;

import application.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage stage) {
//		ViewFactory viewFactory = new ViewFactory();
//		viewFactory.showLoginWindow();
		Model.getInstance().getViewFactory().showLoginWindow();
	}

}
