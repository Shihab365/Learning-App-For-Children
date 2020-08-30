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

public class list9Activity extends AppCompatActivity {

    AdView ad9;
    TextView textView;
    Typeface typeface;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    int order=0;
    String[] r_bng=new String[]
            {
                 "আয় আয় চাঁদ মামা\n\n\n" +
                         "আয় আয় চাঁদ মামা\n\n" +
                         "টিপ দিয়ে যা\n\n" +
                         "চাঁদের কপালে চাঁদ\n\n" +
                         "টিপ দিয়ে যা।\n\n" +
                         "ধান ভানলে কুঁড়ো দেব\n\n" +
                         "মাছ কাটলে মুড়ো দেব\n\n" +
                         "কাল গাইয়ের দুধ দেব\n\n" +
                         "দুধ খাবার বাটি দেব\n\n" +
                         "চাঁদের কপালে চাঁদ\n\n" +
                         "টিপ দিয়ে যা।",
                    "নোটন নোটন পায়রাগুলি\n\n\n" +
                            "নোটন নোটন পায়রাগুলি\n\n" +
                            "ঝোটন বেঁধেছে\n\n" +
                            "ওপারেতে ছেলেমেয়ে\n\n" +
                            "নাইতে নেমেছে।\n\n" +
                            "দুই ধারে দুই রুই কাতলা\n\n" +
                            "ভেসে উঠেছে\n\n" +
                            "কে দেখেছে কে দেখেছে\n\n" +
                            "দাদা দেখেছে\n\n" +
                            "দাদার হাতে কলম ছিল\n\n" +
                            "ছুঁড়ে মেরেছে\n\n" +
                            "উঃ বড্ড লেগেছে।",
                 "হাট্টিমা টিম টিম\n\n\n" +
                         "হাট্টিমা টিম টিম\n\n" +
                         "তারা মাঠে পারে ডিম\n\n" +
                         "তাদের খাঁড়া দুটি শিং\n\n" +
                         "তারা হাট্টিমা টিম টিম",
                    "আয় রে আয় টিয়ে\n\n\n" +
                            "আয় রে আয় টিয়ে\n\n" +
                            "নায়ে ভরা দিয়ে\n\n"+
                            "না' নিয়ে গেল বোয়াল মাছে\n\n"+
                            "তাই না দেখে ভোঁদড় নাচে\n\n"+
                            "ওরে ভোঁদড় ফিরে চা\n\n"+
                            "খোকার নাচন দেখে যা।",
                    "ছোটন ঘুমায়\n\n\n" +
                            "গোল করো না গোল করো না\n\n" +
                            "ছোটন ঘুমায় খাটে।\n\n" +
                            "এই ঘুমকে কিনেত হল\n\n" +
                            "নওয়াব বাড়ির হাটে।\n\n" +
                            "সোনা নয় রুপা নয়\n\n" +
                            "দিলাম মোতির মালা\n\n" +
                            "তাইতো ছোটন ঘুমিয়ে আছে\n\n" +
                            "ঘর করে উজালা।",
                    "ঝুমকো জবা\n\n\n" +
                            "ঝুমকো জবা বনের দুল\n\n" +
                            "উঠল ফুটে বনের ফুল।\n\n"+
                            "সবুজ পাতা ঘোমটা খোলে,\n\n"+
                            "ঝুমকো জবা হাওয়ায় দোলে।\n\n"+
                            "সেই দুলুনির তালে তালে,\n\n"+
                            "মন উড়ে যায় ডালে ডালে।",
                    "কানা বগীর ছা\n\n\n" +
                            "ঐ দেখা যায় তাল গাছ\n\n" +
                            "ঐ আমাদের গাঁ।\n\n" +
                            "ঐ খানেতে বাস করে\n\n" +
                            "কানা বগীর ছা।\n\n" +
                            "ও বগী তুই খাস কি?\n\n" +
                            "পানতা ভাত চাস কি?\n\n" +
                            "পানতা আমি খাই না\n\n" +
                            "পুঁটি মাছ পাই না\n\n" +
                            "একটা যদি পাই\n\n" +
                            "অমনি ধরে গাপুস গুপুস খাই।",
                    "প্রভাতী\n\n\n" +
                            "ভোর হলো দোর খোলো\n\n" +
                            "খুকুমণি ওঠ রে!\n\n" +
                            "ঐ ডাকে যুঁই-শাখে\n\n" +
                            "ফুল-খুকি ছোটরে!\n\n" +
                            "খুলি হাল তুলি পাল\n\n"+
                            "ঐ তরী চললো,\n\n"+
                            "এইবার এইবার\n\n"+
                            "খুকু চোখ খুললো।\n\n"+
                            "আলসে নয় সে\n\n"+
                            "ওঠে রোজ সকালে\n\n"+
                            "রোজ তাই চাঁদা ভাই\n\n"+
                            "টিপ দেয় কপালে।"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list9);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/8323196741");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad9=(AdView) findViewById(R.id.list9adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad9.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        textView=findViewById(R.id.page9id);
        typeface=Typeface.createFromAsset(getAssets(),"font/Amaranth_Bold.otf");
        textView.setTypeface(typeface);
        textView.setText(r_bng[order]);
    }
    public void next(View view)
    {
        if(order<7)
        {
            order++;
            textView.setText(r_bng[order]);
        }
    }
    public void prev(View view)
    {
        if(order>0)
        {
            order--;
            textView.setText(r_bng[order]);
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
            Intent ab=new Intent(list9Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
