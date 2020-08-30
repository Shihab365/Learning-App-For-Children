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

public class list10Activity extends AppCompatActivity {

    AdView ad10;
    TextView textView;
    Typeface typeface;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    int order=0;
    String[] r_eng=new String[]
            {"12345 ONCE I CAUGHT A FISH ALIVE\n\n\n" +
                 "One, two, three, four, five,\n\n" +
                         "Once I caught a fish alive,\n\n" +
                         "Six, seven, eight, nine, ten,\n\n" +
                         "Then I let go again.\n\n"+
                         "Why did you let it go?\n\n" +
                                 "Because it bit my finger so.\n\n" +
                            "Which finger did it bite?\n\n" +
                            "This little finger on the right",
                    "BAA BAA BLACK SHEEP\n\n\n" +
                            "Baa Baa Black Sheep\n\n" +
                            "Have you any wool\n\n" +
                            "Yes sir, yes sir\n\n" +
                            "Three bags full.\n\n"+
                    "One for my master\n\n" +
                            "And one for my dame\n\n" +
                            "And one for the little boy\n\n" +
                            "Who lives down the lane.",
                    "HUMPTY DUMPTY\n\n\n" +
                            "Humpty Dumpty sat on a wall,\n\n" +
                            "Humpty Dumpty had a great fall.\n\n" +
                            "All the King’s horses and all the King’s men,\n\n" +
                            "Couldn’t put Humpty together again.",
                    "TEDDY BEAR, TEDDY BEAR\n\n\n" +
                            "Teddy bear, teddy bear, Turn around!\n\n" +
                            "Teddy bear, teddy bear, Touch the ground!\n\n" +
                            "Teddy bear, teddy bear, Jump up high!\n\n" +
                            "Teddy bear, teddy bear, Touch the sky!\n\n"+
                    "Teddy bear, teddy bear, Bend down low!\n\n" +
                            "Teddy bear, teddy bear, Touch you toes!\n\n" +
                            "Teddy bear, teddy bear, Turn out the light!\n\n" +
                            "Teddy bear, teddy bear, Say good night!",
                    "TWINKLE TWINKLE LITTLE STAR\n\n\n" +
                            "Twinkle, twinkle, little star,\n\n" +
                            "How I wonder what you are!\n\n" +
                            "Up above the world so high,\n\n" +
                            "Like a diamond in the sky.\n\n" +
                            "Twinkle, twinkle, little star,\n\n" +
                            "How I wonder what you are!",
                    "THE RAINBOW\n\n\n" +
                            "Red, and orange, and yellow, and green:\n\n" +
                            "The rainbow’s seven colours have a bright shiny sheen.\n\n" +
                            "Light blue, indigo, and violet all told.\n\n" +
                            "At the end of the rainbow is a pot of gold.",
                    "COBBLER COBBLER\n\n\n" +
                            "Cobbler, cobbler, mend my shoe.\n\n" +
                            "Get it done by half past two.\n\n" +
                            "Half past two is much too late.\n\n" +
                            "Get it done by half past eight.\n\n" +
                            "Stitch it up and stitch it down.\n\n" +
                            "And I'll give you half a crown.",
                    "PAT-A-CAKE BAKER’S MAN\n\n\n" +
                            "Pat-a-cake, pat-a-cake, baker's man\n\n" +
                            "Bake me a cake as fast as you can.\n\n" +
                            "Roll it and pat it and mark it with \"B\"\n\n" +
                            "And put it in the oven for Baby and me.",
                    "PUSSY CAT, PUSSY CAT\n\n\n" +
                            "Pussy cat, pussy cat,\n\n" +
                            "Where have you been?\n\n" +
                            "I've been to London to see the Queen\n\n" +
                            "Pussy cat, pussy cat,\n\n" +
                            "What did you do there?\n\n" +
                            "I frightened a little mouse under the chair"
            };
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list10);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/5871744484");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad10=(AdView) findViewById(R.id.list10adid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad10.loadAd(adRequest);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        textView=findViewById(R.id.page10id);
        typeface=Typeface.createFromAsset(getAssets(),"font/Amaranth_Bold.otf");
        textView.setTypeface(typeface);
        textView.setText(r_eng[order]);
    }
    public void next(View view)
    {
        if(order<8)
        {
            order++;
            textView.setText(r_eng[order]);
        }
    }
    public void prev(View view)
    {
        if(order>0)
        {
            order--;
            textView.setText(r_eng[order]);
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
            Intent ab=new Intent(list10Activity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
