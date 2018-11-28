package nyc.pursuit.officehoursnov27;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

  private TextView textView;
  private EditText editText;
  private Button button;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    textView = findViewById(R.id.tv_prompt);
    textView.setText(getString(R.string.user_prompt));
    editText = findViewById(R.id.name_edit);
    button = findViewById(R.id.send_button);

    /**
     *  Comment this out and remove the interface View.OnClickListener if you want to
     *  implement click Listener as an anonymous class
     */
    button.setOnClickListener(this);

    /**
     * the other way you can set an OnClickListener
     */
    //button.setOnClickListener(new View.OnClickListener() {
    //  @Override public void onClick(View v) {
    //    String editTextName = String.valueOf(editText.getText());
    //    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
    //    intent.putExtra("user_name", editTextName);
    //    startActivity(intent);
    //  }
    //});
  }

  @Override public void onClick(View v) {
    String editTextName = editText.getText().toString();
    Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
    intent.putExtra("username", editTextName);
    startActivity(intent);
  }
}
