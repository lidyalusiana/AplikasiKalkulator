package id.ac.poliban.mi.aplikasikalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText etAngkaPertama = findViewById(R.id.etAngkaPertama);
        final EditText etAngkaKedua = findViewById(R.id.etAngkaKedua);
        Button btTambah = findViewById(R.id.btTambah);
        Button btKurang = findViewById(R.id.btKurang);
        Button btKali = findViewById(R.id.btKali);
        Button btBagi = findViewById(R.id.btBagi);
        Button btBersihkan = findViewById(R.id.btBersihkan);
        TextView tvHasil = findViewById(R.id.tvHasil);

        btTambah.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int hasilnya = aPertama + aKedua;
            tvHasil.setText(Integer.toString(hasilnya));
        });

        btKurang.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int hasilnya = aPertama - aKedua;
            tvHasil.setText(Integer.toString(hasilnya));
        });

        btKali.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int hasilnya = aPertama * aKedua;
            tvHasil.setText(Integer.toString(hasilnya));
        });

        btBagi.setOnClickListener(v -> {
            Integer aPertama = Integer.parseInt(etAngkaPertama.getText().toString());
            Integer aKedua = Integer.parseInt(etAngkaKedua.getText().toString());
            int hasilnya = aPertama / aKedua;
            tvHasil.setText(Integer.toString(hasilnya));
        });

        btBersihkan.setOnClickListener(v -> {
            etAngkaPertama.setText("");
            etAngkaKedua.setText("");
            etAngkaPertama.requestFocus();
            tvHasil.setText("0");
        });
    }
}
