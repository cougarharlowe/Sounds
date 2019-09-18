package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.media.AudioManager;


public class SoundsActivity extends AppCompatActivity {
    private Button buttonSoundA;
    private Button buttonSoundB;
    private Button buttonSoundC;
    private int aNote;
    private int bNote;
    private int cNote;
    private boolean isLoaded = false;
    private SoundPool SoundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sounds);

        wireWidgets();
        loadSoundPool();
        setListeners();

    }

    private void loadSoundPool() {

    }

    private void wireWidgets() {
        buttonSoundA = findViewById(R.id.button_main_soundA);
        buttonSoundB = findViewById(R.id.button_main_soundB);
        buttonSoundC = findViewById(R.id.button_main_soundC);
    }
    private void setListeners() {
        buttonSoundA.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                setVolumeControlStream(AudioManager.STREAM_MUSIC);
                SoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
                SoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
                    @Override
                    public void onLoadComplete(android.media.SoundPool soundPool, int Anote) {
                        isLoaded = true;
                    }
                });
            aNote = SoundPool.load(buttonSoundA, R.raw.scalea, 1);
            }
        });



    }


}
