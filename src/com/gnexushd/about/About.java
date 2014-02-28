package com.gnexushd.about;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.botty.swagpapers.R;

/**
 * Created by ivan on 28/02/14.
 */
public class About extends Activity {

    private TextView mSwagPapers;
    private TextView mCMWall;
    private TextView mWallApp;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ImageView myImageView= (ImageView)findViewById(R.id.logo);
        Animation myFadeInAnimation = AnimationUtils.loadAnimation(this, R.anim.fadein);
        myImageView.startAnimation(myFadeInAnimation);

        mSwagPapers=(TextView)findViewById(R.id.SwagPapersv2);
        mCMWall=(TextView)findViewById(R.id.cm_wall);
        mWallApp=(TextView)findViewById(R.id.wall);


        mSwagPapers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent swag = new Intent(Intent.ACTION_VIEW);
                swag.setData(Uri.parse("https://github.com/AOKP/packages_wallpapers_SwagPapers_v2"));
                startActivity(swag);
            }
        });

        mCMWall.setOnClickListener((new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cm = new Intent(Intent.ACTION_VIEW);
                cm.setData(Uri.parse("https://github.com/CyanogenMod/android_packages_apps_CMWallpapers"));
                startActivity(cm);
            }
        }));

        mWallApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent gn = new Intent(Intent.ACTION_VIEW);
                gn.setData(Uri.parse("https://github.com/BottyIvan/Wall-App"));
                startActivity(gn);
            }
        });
    }

}
