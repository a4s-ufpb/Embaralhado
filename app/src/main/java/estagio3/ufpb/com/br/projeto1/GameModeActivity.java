package estagio3.ufpb.com.br.projeto1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class GameModeActivity extends AppCompatActivity {

    private ImageButton shufflerModeGameButton;
    private ImageButton connectModeGameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_mode);
        this.shufflerModeGameButton = (ImageButton) findViewById(R.id.shufflerButton);
        this.connectModeGameButton = (ImageButton) findViewById(R.id.connectButton);
        this.shufflerModeGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startShufflerGameMode();
            }
        });
        this.connectModeGameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startConnectGameMode();
            }
        });

    }

    private void startConnectGameMode() {
        Intent intent = new Intent(this,ConnectGameMode.class);
        startActivity(intent);
        finish();
    }

    private void startShufflerGameMode() {
        Intent intent = new Intent(this,ShufflerGameMode.class);
        startActivity(intent);
        finish();
    }
}
