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
    private Button buttonSoundBb;
    private Button buttonSoundC;
    private Button buttonSoundCs;
    private Button buttonSoundD;
    private Button buttonSoundE;
    private Button buttonSoundF;
    private Button buttonSoundFs;
    private Button buttonSoundG;
    private Button buttonSoundGs;
    private Button buttonSong1;
    private Button buttonSong2;
    private Button buttonSong3;
    private int aNote;
    private int bNote;
    private int bbNote;
    private int cNote;
    private int csNote;
    private int dNote;
    private int eNote;
    private int fNote;
    private int fsNote;
    private int gNote;
    private int gsNote;
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
        bbNote = SoundPool.load(this,R.raw.scalebb,1);
        csNote = SoundPool.load(this,R.raw.scalecs,1);
        dNote = SoundPool.load(this,R.raw.scaled,1);
        eNote = SoundPool.load(this,R.raw.scalee,1);
        fNote = SoundPool.load(this,R.raw.scalef,1);
        fsNote = SoundPool.load(this,R.raw.scalefs,1);
        gNote = SoundPool.load(this,R.raw.scaleg,1);
        gsNote = SoundPool.load(this,R.raw.scalegs,1);

    }

    private void wireWidgets() {
        buttonSoundA = findViewById(R.id.button_main_soundA);
        buttonSoundB = findViewById(R.id.button_main_soundB);
        buttonSoundC = findViewById(R.id.button_main_soundC);
        buttonSoundBb = findViewById(R.id.button_main_soundBb);
        buttonSoundCs = findViewById(R.id.button_main_soundCS);
        buttonSoundD = findViewById(R.id.button_main_soundD);
        buttonSoundE = findViewById(R.id.button_main_soundE);
        buttonSoundF = findViewById(R.id.button_main_soundF);
        buttonSoundFs = findViewById(R.id.button_main_soundFS);
        buttonSoundG = findViewById(R.id.button_main_soundG);
        buttonSoundGs = findViewById(R.id.button_main_soundGS);
        buttonSong1 = findViewById(R.id.button_main_song1);
        buttonSong2 = findViewById(R.id.button_main_song2);
        buttonSong3 = findViewById(R.id.button_main_song3);
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
        buttonSoundBb.setOnClickListener(this);
        buttonSoundC.setOnClickListener(this);
        buttonSoundCs.setOnClickListener(this);
        buttonSoundD.setOnClickListener(this);
        buttonSoundE.setOnClickListener(this);
        buttonSoundF.setOnClickListener(this);
        buttonSoundFs.setOnClickListener(this);
        buttonSoundG.setOnClickListener(this);
        buttonSoundGs.setOnClickListener(this);
        buttonSong1.setOnClickListener(this);
        buttonSong2.setOnClickListener(this);
        buttonSong3.setOnClickListener(this);

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
                case R.id.button_main_soundBb: {
                    Toast.makeText(this, "bbNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(bbNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_soundC: {
                    Toast.makeText(this, "cNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(cNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_soundCS: {
                    Toast.makeText(this, "csNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(csNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundD: {
                    Toast.makeText(this, "dNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(dNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundE: {
                    Toast.makeText(this, "eNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(eNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundF: {
                    Toast.makeText(this, "fNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(fNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundFS: {
                    Toast.makeText(this, "fsNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(fsNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundG: {
                    Toast.makeText(this, "gNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(gNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }
                case R.id.button_main_soundGS: {
                    Toast.makeText(this, "gsNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(gsNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_song1: {
                    Toast.makeText(this, "gsNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(gsNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_song2: {
                    Toast.makeText(this, "gsNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(gsNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

                case R.id.button_main_song3: {
                    Toast.makeText(this, "gsNote", Toast.LENGTH_SHORT).show();
                    SoundPool.play(gsNote, volume, volume, 1, 0, 1f);
                    Log.e("test", "Played sound");
                    break;
                }

            }
        }
    }
}



/*


 */