module BankingSystem {
	requires transitive javafx.controls;
	requires transitive javafx.fxml;
	requires de.jensd.fx.glyphs.fontawesome;
	requires transitive javafx.graphics;
	requires transitive javafx.base;

	// add require java.sql
	// add org.xerial.sqlitejdbc; if required
	opens application to javafx.graphics, javafx.fxml;

	exports application;
	exports application.Controller;
	exports application.Controller.Admin;
	exports application.Controller.Client;
	exports application.Models;
	exports application.Views;

}
