<<<<<<< HEAD
package application;

import application.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage stage) {
		Model.getInstance().getViewFactory().showLoginWindow();
	}
}
=======
package application;

import application.Models.Model;
import javafx.application.Application;
import javafx.stage.Stage;

public class App extends Application {
	@Override
	public void start(Stage stage) {
		Model.getInstance().getViewFactory().showLoginWindow();
	}
}
>>>>>>> bce4b244d562c40de5c64c452dbd5eda7d6be521
