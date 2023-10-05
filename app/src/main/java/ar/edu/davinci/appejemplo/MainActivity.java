package ar.edu.davinci.appejemplo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onButtonClick(View view) {
        TextView helloWorldText = findViewById(R.id.helloWorldText);

        helloWorldText.setText("Botón Cliqueado");
        helloWorldText.setBackgroundColor(+R.color.pink_200);
    }
}