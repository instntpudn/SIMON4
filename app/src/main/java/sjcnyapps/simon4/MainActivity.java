package sjcnyapps.simon4;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;


import android.media.MediaPlayer;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {

    int btnNum = 0;

    ArrayList<Integer> SEQUENCE;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intialize();
        //StartRound.startRound(SEQUENCE);

        SEQUENCE.add(StartRound.generateRandom());
    }

    private void Intialize() {
        SEQUENCE =  new ArrayList<Integer>();

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public void playSound(int btnNum)
    {
        MediaPlayer player1 = MediaPlayer.create(MainActivity.this, R.raw.sounds_01);
        MediaPlayer player2 = MediaPlayer.create(MainActivity.this, R.raw.sounds_02);
        MediaPlayer player3 = MediaPlayer.create(MainActivity.this, R.raw.sounds_03);
        MediaPlayer player4 = MediaPlayer.create(MainActivity.this, R.raw.sounds_04);

        switch (btnNum)
        {
            case 1:
                player1.start();
                break;
            case 2:
                player2.start();
                break;
            case 3:
                player3.start();
                break;
            case 4:
                player4.start();
                break;
        }
    }
}
