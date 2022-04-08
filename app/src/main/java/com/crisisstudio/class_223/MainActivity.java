package com.crisisstudio.class_223;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.Toolbar;

import com.amar.library.ui.StickyScrollView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.io.IOException;
import java.time.Duration;

public class MainActivity extends AppCompatActivity {

    BottomNavigationView bottom_navigation;

    LinearLayout singer_homepage, justin_profile;

    StickyScrollView singer_profile;


    LinearLayout home_layout, explore_layout, audio_library_layout;


    // stay start
    LinearLayout stay_song;
    // stay close

    // ghost start
    LinearLayout ghost_song;
    // ghost close

    // love yourself start
    LinearLayout love_yourself_song;
    // love yourself close

    CardView follow_btn, unfollow_btn;

    ImageView play_btn, pause_btn;

    ImageView singer_profile_back_btn;

    MediaPlayer mediaPlayer;


    CardView justin_profile_round;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bottom_navigation = findViewById(R.id.bottom_navigation);
        justin_profile_round = findViewById(R.id.justin_profile_round);

        singer_homepage = findViewById(R.id.singer_homepage);
        justin_profile = findViewById(R.id.justin_profile);
        singer_profile = findViewById(R.id.singer_profile);

        follow_btn = findViewById(R.id.follow_btn);
        unfollow_btn = findViewById(R.id.unfollow_btn);

        stay_song = findViewById(R.id.stay_song);
        ghost_song = findViewById(R.id.ghost_song);
        love_yourself_song = findViewById(R.id.love_yourself_song);
        play_btn = findViewById(R.id.play_btn);
        pause_btn = findViewById(R.id.pause_btn);


        home_layout = findViewById(R.id.home_layout);
        explore_layout = findViewById(R.id.explore_layout);
        audio_library_layout = findViewById(R.id.audio_libary_layout);


        singer_profile_back_btn = findViewById(R.id.singer_profile_back_btn);




    /////////////////////////////////////////////////////////////////////////////////////////////////



            bottom_navigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {


                    switch (item.getItemId()){



////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        case R.id.home:

                            home_layout.setVisibility(View.VISIBLE);
                            explore_layout.setVisibility(View.GONE);
                            audio_library_layout.setVisibility(View.GONE);


                            // justin profile start
                            justin_profile_round.setOnClickListener(new View.OnClickListener() {
                                @Override
                                public void onClick(View v) {

                                    singer_homepage.setVisibility(View.GONE);
                                    singer_profile.setVisibility(View.VISIBLE);


                                    follow_btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            follow_btn.setVisibility(View.GONE);
                                            unfollow_btn.setVisibility(View.VISIBLE);

                                            Toast.makeText(MainActivity.this, "You are now following Justin Bieber", Toast.LENGTH_SHORT).show();

                                        }
                                    });



                                    unfollow_btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            follow_btn.setVisibility(View.VISIBLE);
                                            unfollow_btn.setVisibility(View.GONE);

                                            Toast.makeText(MainActivity.this, "You are not following Justin Bieber anymore", Toast.LENGTH_SHORT).show();

                                        }
                                    });



                                    singer_profile_back_btn.setOnClickListener(new View.OnClickListener() {
                                        @Override
                                        public void onClick(View v) {

                                            singer_homepage.setVisibility(View.VISIBLE);
                                            singer_profile.setVisibility(View.GONE);

                                        }
                                    });


                                    ConnectivityManager net = (ConnectivityManager) getSystemService(Context.CONNECTIVITY_SERVICE);
                                    NetworkInfo internet = net.getActiveNetworkInfo();


                                    if (internet != null  &&  internet.isConnected() ){



                                        play_btn.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {





                                            }
                                        });





                                        stay_song.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                if (mediaPlayer != null) mediaPlayer.release();

                                                mediaPlayer = new MediaPlayer();
                                                try {
                                                    mediaPlayer.setDataSource("https://codeschoolspy.000webhostapp.com/song/stay_justin.mp3");
                                                    mediaPlayer.prepare();
                                                    mediaPlayer.start();
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }


                                            }
                                        });




                                        ghost_song.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                if ( mediaPlayer != null) mediaPlayer.release();

                                                mediaPlayer = new MediaPlayer();
                                                try {
                                                    mediaPlayer.setDataSource("https://codeschoolspy.000webhostapp.com/song/ghost_justin.mp3");
                                                    mediaPlayer.prepare();
                                                    mediaPlayer.start();
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }


                                            }
                                        });



                                        love_yourself_song.setOnClickListener(new View.OnClickListener() {
                                            @Override
                                            public void onClick(View v) {

                                                if (mediaPlayer != null) mediaPlayer.release();

                                                mediaPlayer = new MediaPlayer();
                                                try {
                                                    mediaPlayer.setDataSource("https://codeschoolspy.000webhostapp.com/song/love_yourself_justin.mp3");
                                                    mediaPlayer.prepare();
                                                    mediaPlayer.start();
                                                } catch (IOException e) {
                                                    e.printStackTrace();
                                                }

                                            }
                                        });




                                    }else{
                                        Toast.makeText(MainActivity.this, "Connect your Internet", Toast.LENGTH_SHORT).show();
                                    }



                                }
                            });
                            // justin profile close





                            break;
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////



                        case R.id.explore:


                            home_layout.setVisibility(View.GONE);
                            explore_layout.setVisibility(View.VISIBLE);
                            audio_library_layout.setVisibility(View.GONE);


                            break;



                        case R.id.libary:


                            home_layout.setVisibility(View.GONE);
                            explore_layout.setVisibility(View.GONE);
                            audio_library_layout.setVisibility(View.VISIBLE);



                            break;



                    }




                    return true;
                }
            });




        //////////////////////////////////////////////////////////////////////////////////////////////







        

    }

}