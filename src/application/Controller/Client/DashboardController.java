package application.Controller.Client;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class DashboardController implements Initializable {
	public Text user_name;
	public Label login_date;
	public Label checking_bal;
	public Label checking_acc_num;
	public Label savings_bal;
	public Label savings_acc_num;
	public Label income_lbl;
	public Label expense_lbl;
	public ListView transaction_listview;
	public TextField payee_fld;
	public TextField amount_fld;
	public TextField message_fld;
	public Button send_money_btn;

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
	}

}
