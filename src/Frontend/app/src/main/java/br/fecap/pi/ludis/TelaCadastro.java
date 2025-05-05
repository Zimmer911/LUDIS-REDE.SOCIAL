package br.fecap.pi.ludis;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class TelaCadastro extends AppCompatActivity {

    private Button btnCadastroAtleta;
    private Button btnCadastroClube;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_tela_cadastro);

        btnCadastroAtleta = findViewById(R.id.btnCadastroAtleta);

        btnCadastroAtleta.setOnClickListener(view -> {
            Intent intent = new Intent(TelaCadastro.this, CadastroAtleta.class);
            startActivity(intent);
        });

        btnCadastroClube = findViewById(R.id.btnCadastroClube);

        btnCadastroClube.setOnClickListener(view -> {
            Intent intent = new Intent(TelaCadastro.this, CadastroClube.class);
            startActivity(intent);
        });











        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}