package sjcnyapps.simon4;

import android.app.Dialog;
import android.os.AsyncTask;
import android.widget.Button;

import java.util.List;

/**
 * Created by Ryan on 3/25/2015.
 */
public class AsyncSequencePlayer extends AsyncTask<List<Integer>, Integer, String>
{
    private Button btn1;
    private Button btn2;
    private Button btn3;
    private Button btn4;
    private MainActivity mainActivity;

    public AsyncSequencePlayer(MainActivity mainActivity)
    {
        this.mainActivity = mainActivity;
        btn1 = (Button)mainActivity.findViewById(R.id.btn1);
        btn2 = (Button)mainActivity.findViewById(R.id.btn2);
        btn3 = (Button)mainActivity.findViewById(R.id.btn3);
        btn4 = (Button)mainActivity.findViewById(R.id.btn4);
    }

    @Override
    protected void onPreExecute()
    {
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
    }

    @Override
    protected String doInBackground(List<Integer>... sequence)
    {
        for(Integer i : sequence[0])
        {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException e)
            {
                e.printStackTrace();
            }

            publishProgress(i);
        }

        return null;
    }

    @Override
    protected void onProgressUpdate(Integer... btn)
    {
        mainActivity.playSound(btn[0]);
//        mainActivity.playSound();
//        mainActivity.flashButton(btn[0]);
    }

    @Override
    protected void onPostExecute(String args)
    {
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
    }
}