package com.example.sounds;

import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.media.AudioManager;
import android.widget.Toast;


public class SoundsActivity extends AppCompatActivity implements View.OnClickListener {
    private Button buttonSoundA;
    private Button buttonSoundB;
    private Button buttonSoundC;
    private int aNote;
    private int bNote;
    private int cNote;
    private int dNote;
    private int eNote;
    private int fNote;
    private int gNote;
    private float volume;
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
        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        SoundPool = new SoundPool(10, AudioManager.STREAM_MUSIC, 0);
        SoundPool.setOnLoadCompleteListener(new SoundPool.OnLoadCompleteListener() {
            @Override
            public void onLoadComplete(android.media.SoundPool soundPool, int i, int i1) {
                isLoaded = true;

            }
        });

        aNote = SoundPool.load(this, R.raw.scalea, 1);
        bNote = SoundPool.load(this, R.raw.scaleb, 1);
        cNote = SoundPool.load(this, R.raw.scalec, 1);

    }

    private void wireWidgets() {
        buttonSoundA = findViewById(R.id.button_main_soundA);
        buttonSoundB = findViewById(R.id.button_main_soundB);
        buttonSoundC = findViewById(R.id.button_main_soundC);
    }

    private void setListeners() {
        buttonSoundA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLoaded) {
                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                    float actualVolume = (float) audioManager
                            .getStreamVolume(AudioManager.STREAM_MUSIC);
                    float maxVolume = (float) audioManager
                            .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                    float volume = actualVolume / maxVolume;
                    //SoundPool.play(aNote, volume, volume, 1, 0, 1f);
                    //Log.e("test", "Played sound");
                }

            }


        });
        buttonSoundB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLoaded) {
                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                    float actualVolume = (float) audioManager
                            .getStreamVolume(AudioManager.STREAM_MUSIC);
                    float maxVolume = (float) audioManager
                            .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                    float volume = actualVolume / maxVolume;
                    //SoundPool.play(bNote, volume, volume, 1, 0, 1f);
                    //Log.e("test", "Played sound");
                }


            }
        });
        buttonSoundC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isLoaded) {
                    AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
                    float actualVolume = (float) audioManager
                            .getStreamVolume(AudioManager.STREAM_MUSIC);
                    float maxVolume = (float) audioManager
                            .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
                    float volume = actualVolume / maxVolume;
                    //SoundPool.play(cNote, volume, volume, 1, 0, 1f);
                    //Log.e("test", "Played sound");
                }


            }
        });
        buttonSoundA.setOnClickListener(this);
        buttonSoundB.setOnClickListener(this);
        buttonSoundC.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if (isLoaded) {
            AudioManager audioManager = (AudioManager) getSystemService(AUDIO_SERVICE);
            float actualVolume = (float) audioManager
                    .getStreamVolume(AudioManager.STREAM_MUSIC);
            float maxVolume = (float) audioManager
                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC);
            float volume = actualVolume / maxVolume;
            switch (view.getId()) {
                case R.id.button_main_soundA: {
                    Toast.makeText(this, "aNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(aNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_soundB: {
                    Toast.makeText(this, "bNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(bNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_soundC: {
                    Toast.makeText(this, "cNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(cNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

            }
        }
    }
}



/*


 */