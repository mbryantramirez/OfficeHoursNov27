package nyc.pursuit.officehoursnov27;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

  private TextView userNameTextView;
  private TextView currentActivityTextView;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_display);
    currentActivityTextView = findViewById(R.id.tv_activity_name);
    currentActivityTextView.setText(getClass().getSimpleName());

    userNameTextView = findViewById(R.id.tv_received_name);

    Bundle extras = getIntent().getExtras();
    String user_name = "";
    if (extras != null) {
      user_name = extras.getString("username");
    }

    if (user_name != null) {
      userNameTextView.setText(user_name);
    } else {
      userNameTextView.setText(getString(R.string.display_activity_no_name));
    }
  }
}
