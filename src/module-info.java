module BankingSystem {
	requires transitive javafx.controls;
	requires transitive javafx.fxml;
	requires transitive de.jensd.fx.glyphs.fontawesome;
	requires transitive javafx.graphics;
	requires transitive javafx.base;
	requires transitive java.sql;

	// add require java.sql
	// add org.xerial.sqlitejdbc; if required
	opens application to javafx.graphics, javafx.fxml;

	exports application;
	exports application.Controllers;
	exports application.Controllers.Admin;
	exports application.Controllers.Client;
	exports application.Models;
	exports application.Views;

}
