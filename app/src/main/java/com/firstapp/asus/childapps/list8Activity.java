package com.firstapp.asus.childapps;

import android.content.Intent;
import android.graphics.Typeface;
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

public class list8Activity extends AppCompatActivity {

    AdView ad8;
    TextView textView;
    Typeface typeface;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    int order=0;
    String[] mt=new String[]
            {
                   "১ X ১ = ১\n" +
                           "১ X ২ = ২\n" +
                           "১ X ৩ = ৩\n" +
                           "১ X ৪ = ৪\n" +
                           "১ X ৫ = ৫\n" +
                           "১ X ৬ = ৬\n" +
                           "১ X ৭ = ৭\n" +
                           "১ X ৮ = ৮\n" +
                           "১ X ৯ = ৯\n" +
                           "১ X ১০ = ১০",
                    "২ X ১ = ২\n" +
                            "২ X ২ = ৪\n" +
                            "২ X ৩ = ৬\n" +
                            "২ X ৪ = ৮\n" +
                            "২ X ৫ = ১০\n" +
                            "২ X ৬ = ১২\n" +
                            "২ X ৭ = ১৪\n" +
                            "২ X ৮ = ১৬\n" +
                            "২ X ৯ = ১৮\n" +
                            "২ X ১০ = ২০",
                    "৩ X ১ = ৩\n" +
                            "৩ X ২ = ৬\n" +
                            "৩ X ৩ = ৯\n" +
                            "৩ X ৪ = ১২\n" +
                            "৩ X ৫ = ১৫\n" +
                            "৩ X ৬ = ১৮\n" +
                            "৩ X ৭ = ২১\n" +
                            "৩ X ৮ = ২৪\n" +
                            "৩ X ৯ = ২৭\n" +
                            "৩ X ১০ = ৩০",
                    "৪ X ১ = ৪\n" +
                            "৪ X ২ = ৮\n" +
                            "৪ X ৩ = ১২\n" +
                            "৪ X ৪ = ১৬\n" +
                            "৪ X ৫ = ২০\n" +
                            "৪ X ৬ = ২৪\n" +
                            "৪ X ৭ = ২৮\n" +
                            "৪ X ৮ = ৩২\n" +
                            "৪ X ৯ = ৩৬\n" +
                            "৪ X ১০ = ৪০",
                    "৫ X ১ = ৫\n" +
                            "৫ X ২ = ১০\n" +
                            "৫ X ৩ = ১৫\n" +
                            "৫ X ৪ = ২০\n" +
                            "৫ X ৫ = ২৫\n" +
                            "৫ X ৬ = ৩০\n" +
                            "৫ X ৭ = ৩৫\n" +
                            "৫ X ৮ = ৪০\n" +
                            "৫ X ৯ = ৪৫\n" +
                            "৫ X ১০ = ৫০",
                    "৬ X ১ = ৬\n" +
                            "৬ X ২ = ১২\n" +
                            "৬ X ৩ = ১৮\n" +
                            "৬ X ৪ = ২৪\n" +
                            "৬ X ৫ = ৩০\n" +
                            "৬ X ৬ = ৩৬\n" +
                            "৬ X ৭ = ৪২\n" +
                            "৬ X ৮ = ৪৮\n" +
                            "৬ X ৯ = ৫৪\n" +
                            "৬ X ১০ = ৬০",
                    "৭ X ১ = ৭\n" +
                            "৭ X ২ = ১৪\n" +
                            "৭ X ৩ = ২১\n" +
                            "৭ X ৪ = ২৮\n" +
                            "৭ X ৫ = ৩৫\n" +
                            "৭ X ৬ = ৪২\n" +
                            "৭ X ৭ = ৪৯\n" +
                            "৭ X ৮ = ৫৬\n" +
                            "৭ X ৯ = ৬৩\n" +
                            "৭ X ১০ = ৭০",
                    "৮ X ১ = ৮\n" +
                            "৮ X ২ = ১৬\n" +
                            "৮ X ৩ = ২৪\n" +
                            "৮ X ৪ = ৩২\n" +
                            "৮ X ৫ = ৪০\n" +
                            "৮ X ৬ = ৪৮\n" +
                            "৮ X ৭ = ৫৬\n" +
                            "৮ X ৮ = ৬৪\n" +
                            "৮ X ৯ = ৭২\n" +
                            "৮ X ১০ = ৮০",
                    "৯ X ১ = ৯\n" +
                            "৯ X ২ = ১৮\n" +
                            "৯ X ৩ = ২৭\n" +
                            "৯ X ৪ = ৩৬\n" +
                            "৯ X ৫ = ৪৫\n" +
                            "৯ X ৬ = ৫৪\n" +
                            "৯ X ৭ = ৬৩\n" +
                            "৯ X ৮ = ৭২\n" +
                            "৯ X ৯ = ৮১\n" +
                            "৯ X ১০ = ৯০",
                    "১০ X ১ = ১০\n" +
                            "১০ X ২ = ২০\n" +
                            "১০ X ৩ = ৩০\n" +
                            "১০ X ৪ = ৪০\n" +
                            "১০ X ৫ = ৫০\n" +
                            "১০ X ৬ = ৬০\n" +
                            "১০ X ৭ = ৭০\n" +
                            "১০ X ৮ = ৮০\n" +
                            "১০ X ৯ = ৯০\n" +
                            "১০ X ১০ = ১০০"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list8);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/1274572663");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad8=(AdView) findViewById(R.id.list8adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad8.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView=findViewById(R.id.page8id);
        typeface=Typeface.createFromAsset(getAssets(),"font/Amaranth_Bold.otf");
        textView.setTypeface(typeface);
        textView.setText(mt[order]);
    }
    public void next(View view)
    {
        if(order<9)
        {
            order++;
            textView.setText(mt[order]);
        }
    }
    public void prev(View view)
    {
        if(order>0)
        {
            order--;
            textView.setText(mt[order]);
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
            Intent ab=new Intent(list8Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
