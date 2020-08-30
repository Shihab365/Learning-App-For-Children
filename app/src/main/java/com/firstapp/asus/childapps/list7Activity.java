package com.firstapp.asus.childapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ShareActionProvider;
import android.widget.TextView;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class list7Activity extends AppCompatActivity {

    AdView ad7;
    TextView textView;
    int order=0;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    String[] value=new String[]
            {
                   "1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20",
                   "21","22","23","24","25","26","27","28","29","30","31","32","33","34","35","36","37","38","39","40",
                   "41","42","43","44","45","46","47","48","49","50","51","52","53","54","55","56","57","58","59","60",
                   "61","62","63","64","65","66","67","68","69","70","71","72","73","74","75","76","77","78","79","80",
                   "81","82","83","84","85","86","87","88","89","90","91","92","93","94","95","96","97","98","99","100"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list7);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/7281029071");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad7=(AdView) findViewById(R.id.list7adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad7.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView=findViewById(R.id.page7id);
        textView.setText(value[order]);
    }
    public void next(View view)
    {
        if(order<99)
        {
            order++;
            textView.setText(value[order]);
        }
    }
    public void prev(View view)
    {
        if(order>0)
        {
            order--;
            textView.setText(value[order]);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater=getMenuInflater();
        menuInflater.inflate(R.menu.menu_item,menu);
        return super.onCreateOptionsMenu(menu);
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if(item.getItemId()==R.id.shareid)
        {
            Intent i=new Intent(Intent.ACTION_SEND);
            i.setType("text/plain");
            i.putExtra(Intent.EXTRA_TEXT,"My new app https://play.google.com");
            startActivity(Intent.createChooser(i,"Share Via"));
            return true;
        }
        if(item.getItemId()==R.id.feedbackid)
        {
            rateApp.setData(Uri.parse("https://play.google.com"));
            startActivity(rateApp);
            return true;
        }
        if(item.getItemId()==R.id.aboutid)
        {
            Intent ab=new Intent(list7Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
