package com.firstapp.asus.childapps;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ShareActionProvider;
import com.google.android.gms.ads.*;

public class MainActivity extends AppCompatActivity {
    AdView ad11;
    private InterstitialAd interstitialAd1,interstitialAd2,interstitialAd3,interstitialAd4,interstitialAd5,interstitialAd6;

    public Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,btn10;
    public ShareActionProvider shareActionProvider;
    Intent rateApp;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rateApp=new Intent(Intent.ACTION_VIEW);

        AdView adView = new AdView(this);
        adView.setAdSize(AdSize.BANNER);
        adView.setAdUnitId("ca-app-pub-1818607113375588/8207104104");

        MobileAds.initialize(this,"ca-app-pub-1818607113375588~3556756114");
        ad11=(AdView) findViewById(R.id.mainadid);


        AdRequest adRequest = new AdRequest.Builder().build();
        ad11.loadAd(adRequest);

        interstitialAd1=new InterstitialAd(this);
        interstitialAd1.setAdUnitId("ca-app-pub-1818607113375588/3446991190");
        interstitialAd1.loadAd(new AdRequest.Builder().build());
        interstitialAd1.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list1Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd2=new InterstitialAd(this);
        interstitialAd2.setAdUnitId("ca-app-pub-1818607113375588/5640644348");
        interstitialAd2.loadAd(new AdRequest.Builder().build());
        interstitialAd2.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list2Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd3=new InterstitialAd(this);
        interstitialAd3.setAdUnitId("ca-app-pub-1818607113375588/1837130705");
        interstitialAd3.loadAd(new AdRequest.Builder().build());
        interstitialAd3.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list3Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd4=new InterstitialAd(this);
        interstitialAd4.setAdUnitId("ca-app-pub-1818607113375588/4639102600");
        interstitialAd4.loadAd(new AdRequest.Builder().build());
        interstitialAd4.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list4Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd5=new InterstitialAd(this);
        interstitialAd5.setAdUnitId("ca-app-pub-1818607113375588/6446459551");
        interstitialAd5.loadAd(new AdRequest.Builder().build());
        interstitialAd5.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list9Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );
        interstitialAd6=new InterstitialAd(this);
        interstitialAd6.setAdUnitId("ca-app-pub-1818607113375588/3628724520");
        interstitialAd6.loadAd(new AdRequest.Builder().build());
        interstitialAd6.setAdListener(new AdListener()
                                      {
                                          @Override
                                          public void onAdClosed() {
                                              Intent intent=new Intent(MainActivity.this,list10Activity.class);
                                              startActivity(intent);
                                          }
                                      }
        );

        btn1=(Button) findViewById(R.id.list1id);
        btn2=(Button) findViewById(R.id.list2id);
        btn3=(Button) findViewById(R.id.list3id);
        btn4=(Button) findViewById(R.id.list4id);
        btn5=(Button) findViewById(R.id.list5id);
        btn6=(Button) findViewById(R.id.list6id);
        btn7=(Button) findViewById(R.id.list7id);
        btn8=(Button) findViewById(R.id.list8id);
        btn9=(Button) findViewById(R.id.list9id);
        btn10=(Button) findViewById(R.id.list10id);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list1id)
                {
                    if(interstitialAd1.isLoaded())
                    {
                        interstitialAd1.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list1Activity.class);
                        startActivity(intent);
                        interstitialAd1.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list2id)
                {
                    if(interstitialAd2.isLoaded())
                    {
                        interstitialAd2.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list2Activity.class);
                        startActivity(intent);
                        interstitialAd2.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list3id)
                {
                    if(interstitialAd3.isLoaded())
                    {
                        interstitialAd3.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list3Activity.class);
                        startActivity(intent);
                        interstitialAd3.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list4id)
                {
                    if(interstitialAd4.isLoaded())
                    {
                        interstitialAd4.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list4Activity.class);
                        startActivity(intent);
                        interstitialAd4.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list5id)
                {
                    Intent intent=new Intent(MainActivity.this,list5Activity.class);
                    startActivity(intent);
                }
            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list6id)
                {
                    Intent intent=new Intent(MainActivity.this,list6Activity.class);
                    startActivity(intent);
                }
            }
        });
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list7id)
                {
                    Intent intent=new Intent(MainActivity.this,list7Activity.class);
                    startActivity(intent);
                }
            }
        });
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list8id)
                {
                    Intent intent=new Intent(MainActivity.this,list8Activity.class);
                    startActivity(intent);
                }
            }
        });
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list9id)
                {
                    if(interstitialAd5.isLoaded())
                    {
                        interstitialAd5.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list9Activity.class);
                        startActivity(intent);
                        interstitialAd5.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(v.getId()==R.id.list10id)
                {
                    if(interstitialAd6.isLoaded())
                    {
                        interstitialAd6.show();
                    }
                    else
                    {
                        Intent intent=new Intent(MainActivity.this,list10Activity.class);
                        startActivity(intent);
                        interstitialAd6.loadAd(new AdRequest.Builder().build());
                    }
                }
            }
        });
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
            Intent ab=new Intent(MainActivity.this,AboutActivity.class);
            startActivity(ab);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
