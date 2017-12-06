package agung.app.com.mahasiswaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvResultNama;
    String resultNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intComponents();

        Bundle extras = getIntent().getExtras();
        if(extras != null){
            resultNama = extras.getString("result_nama");
            tvResultNama.setText(resultNama);
        }
    }

    private void intComponents() {
        tvResultNama = (TextView)findViewById(R.id.tvResultNama);
    }
}
