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

public class list6Activity extends AppCompatActivity {

    AdView ad6;
    TextView textView;
    int order=0;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    String[] value=new String[]
            {
                    "B","C","D","F","G","H","J","K","L","M","N","P","Q","R","S","T","V","W",
                    "X","Y","Z"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list6);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/5213817679");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad6=(AdView) findViewById(R.id.list6adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad6.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView=findViewById(R.id.page6id);
        textView.setText(value[order]);
    }
    public void next(View view)
    {
        if(order<20)
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
            Intent ab=new Intent(list6Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
