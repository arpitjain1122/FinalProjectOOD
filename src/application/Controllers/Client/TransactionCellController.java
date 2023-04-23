<<<<<<< HEAD
package application.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import application.Models.Transaction;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class TransactionCellController implements Initializable {
	public FontAwesomeIconView in_icon;
	public FontAwesomeIconView out_icon;
	public Label trans_date_lbl;
	public Label sender_lbl;
	public Label receiver_lbl;
	public Button message_btn;
	public Label amount_lbl;

	private final Transaction transaction;

	public TransactionCellController(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		sender_lbl.textProperty().bind(transaction.senderProperty());
		receiver_lbl.textProperty().bind(transaction.receiverProperty());
		amount_lbl.textProperty().bind(transaction.amountProperty().asString());
		trans_date_lbl.textProperty().bind(transaction.dateProperty().asString());
		message_btn.setOnAction(event -> Model.getInstance().getViewFactory()
				.showMessageWindow(transaction.senderProperty().get(), transaction.messageProperty().get()));
		transactionIcons();
	}

	private void transactionIcons() {
		if (transaction.senderProperty().get().equals(Model.getInstance().getClient().pAddressProperty().get())) {
			in_icon.setFill(Color.rgb(240, 240, 240));
			out_icon.setFill(Color.RED);
		} else {
			in_icon.setFill(Color.GREEN);
			out_icon.setFill(Color.rgb(240, 240, 240));
		}
	}
}
=======
package application.Controllers.Client;

import java.net.URL;
import java.util.ResourceBundle;

import application.Models.Model;
import application.Models.Transaction;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.paint.Color;

public class TransactionCellController implements Initializable {
	public FontAwesomeIconView in_icon;
	public FontAwesomeIconView out_icon;
	public Label trans_date_lbl;
	public Label sender_lbl;
	public Label receiver_lbl;
	public Button message_btn;
	public Label amount_lbl;

	private final Transaction transaction;

	public TransactionCellController(Transaction transaction) {
		this.transaction = transaction;
	}

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
		sender_lbl.textProperty().bind(transaction.senderProperty());
		receiver_lbl.textProperty().bind(transaction.receiverProperty());
		amount_lbl.textProperty().bind(transaction.amountProperty().asString());
		trans_date_lbl.textProperty().bind(transaction.dateProperty().asString());
		message_btn.setOnAction(event -> Model.getInstance().getViewFactory()
				.showMessageWindow(transaction.senderProperty().get(), transaction.messageProperty().get()));
		transactionIcons();
	}

	private void transactionIcons() {
		if (transaction.senderProperty().get().equals(Model.getInstance().getClient().pAddressProperty().get())) {
			in_icon.setFill(Color.rgb(240, 240, 240));
			out_icon.setFill(Color.RED);
		} else {
			in_icon.setFill(Color.GREEN);
			out_icon.setFill(Color.rgb(240, 240, 240));
		}
	}
}
>>>>>>> bce4b244d562c40de5c64c452dbd5eda7d6be521
