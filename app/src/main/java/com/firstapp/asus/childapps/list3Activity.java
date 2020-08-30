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

public class list3Activity extends AppCompatActivity {

    AdView ad3;
    TextView textView;
    int order=0;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    String[] value=new String[]
            {
                 "১","২","৩","৪","৫","৬","৭","৮","৯","১০","১১","১২","১৩","১৪","১৫","১৬","১৭","১৮","১৯","২০",
                 "২১","২২","২৩","২৪","২৫","২৬","২৭","২৮","২৯","৩০","৩১","৩২","৩৩","৩৪","৩৫","৩৬","৩৭","৩৮","৩৯","৪০",
                 "৪১","৪২","৪৩","৪৪","৪৫","৪৬","৪৭","৪৮","৪৯","৫০","৫১","৫২","৫৩","৫৪","৫৫","৫৬","৫৭","৫৮","৫৯","৬০",
                 "৬১","৬২","৬৩","৬৪","৬৫","৬৬","৬৭","৬৮","৬৯","৭০","৭১","৭২","৭৩","৭৪","৭৫","৭৬","৭৭","৭৮","৭৯","৮০",
                 "৮১","৮২","৮৩","৮৪","৮৫","৮৬","৮৭","৮৮","৮৯","৯০","৯১","৯২","৯৩","৯৪","৯৫","৯৬","৯৭","৯৮","৯৯","১০০"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list3);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/3423165806");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad3=(AdView) findViewById(R.id.list3adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad3.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView=findViewById(R.id.page3id);
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
            Intent ab=new Intent(list3Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
