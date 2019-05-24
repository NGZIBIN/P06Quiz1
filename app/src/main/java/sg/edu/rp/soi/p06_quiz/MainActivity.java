package sg.edu.rp.soi.p06_quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv1;
    TextView num1;
    TextView num2;
    Button reset;
    int ans = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv1 = findViewById(R.id.tvOperation);
        num1 = findViewById(R.id.etNum1);
        num2 = findViewById(R.id.etNum2);
        reset = findViewById(R.id.btnReset);

        registerForContextMenu(tv1);

        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            num1.setText("");
            num2.setText("");
            }
        }

    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        super.onCreateContextMenu(menu, v, menuInfo);


    }

    @Override
    public boolean onContextItemSelected(MenuItem item) {
        int id = item.getItemId();
        num1.getText().toString();
        num2.getText().toString();
        if (id == R.id.plus) {
            ans = num1.getText().toString() + num2.getText().toString();
        } else {
            ans = num1 - num2;
        }
        return true;
    }

}
