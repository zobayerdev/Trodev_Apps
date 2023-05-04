package com.trodev.trodev.fragments;

import android.Manifest;
import android.annotation.SuppressLint;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;

import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.trodev.trodev.R;

public class DeveloperFragment extends Fragment {

    private LinearLayout facebook, github, linkedin, gmail;
    private ImageView jubu_facebook, jubu_github, jubu_linkedin, jubu_gmail;
    private LinearLayout shantu_facebook, shantu_github, shantu_linkedin, shantu_gmail;
    private ImageView zayed_facebook, zayed_github, zayed_linkedin, zayed_gmail;

    public DeveloperFragment() {
        // Required empty public constructor
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_developer, container, false);

        /*zobayer hasan nayem*/
        facebook = view.findViewById(R.id.facebook);
        github = view.findViewById(R.id.github);
        linkedin = view.findViewById(R.id.linkedin);
        gmail = view.findViewById(R.id.gmail);

        /*jubayer hossain*/
        jubu_facebook = view.findViewById(R.id.jubu_facebook);
        jubu_github = view.findViewById(R.id.jubu_github);
        jubu_linkedin = view.findViewById(R.id.jubu_linkedin);
        jubu_gmail = view.findViewById(R.id.jubu_gmail);

        /*shahida sultana shantu*/
        shantu_facebook = view.findViewById(R.id.shantu_facebook);
        shantu_gmail = view.findViewById(R.id.shantu_gmail);
        shantu_linkedin = view.findViewById(R.id.shantu_linkedin);

        /*zayed hasan nayem*/
        zayed_facebook = view.findViewById(R.id.zayed_facebook);
        zayed_github = view.findViewById(R.id.zayed_github);
        zayed_gmail = view.findViewById(R.id.zayed_gmail);
        zayed_linkedin = view.findViewById(R.id.zayed_linkedin);


        //facebook zobayer
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntent());
            }
        });

        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/zobayerdev"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/zobayerdev/"));
                startActivity(intent);
            }
        });

        gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "zobayer.dev@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity(), "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        jubu_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentjubu());
            }
        });

        jubu_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/jubayer282"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        jubu_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/jubayer-hossain-760b7623b"));
                startActivity(intent);
            }
        });

        jubu_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "jubayer.trodev@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity(), "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        shantu_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentrubayet());
            }
        });

        shantu_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/rubayet-islam-ifti-63073319a/"));
                startActivity(intent);
            }
        });

        shantu_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "shahidashantu@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity(), "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });


        zayed_facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(getOpenFacebookIntentpiash());
            }
        });

        zayed_github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //  Intent appIntent = new Intent(Intent.ACTION_VIEW);
                Intent webIntent = new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://github.com/zayedndev"));
                try {
                    startActivity(webIntent);
                } catch (ActivityNotFoundException ex) {
                    startActivity(webIntent);
                }
            }
        });

        zayed_linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("linkedin://you"));
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.linkedin.com/in/zayed-hasan-noman-a3a9b0248"));
                startActivity(intent);
            }
        });

        zayed_gmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                try {
                    Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("mailto:" + "mdzayed.dev@gmail.com"));
                    intent.putExtra(Intent.EXTRA_SUBJECT, "your_subject");
                    intent.putExtra(Intent.EXTRA_TEXT, "your_text");
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    Toast.makeText(getActivity(), "Failed to due " + e.getMessage(), Toast.LENGTH_SHORT).show();
                }
            }
        });

        return view;
    }

    /*here zobayer hasan activity*/
    private PackageManager getPackageManager() {
        return null;
    }

    /*zobayer hasan noman*/
    public Intent getOpenFacebookIntent() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/zobayerdev"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/zobayerdev"));
        }
    }

    /*jubayer hossain*/
    private Intent getOpenFacebookIntentjubu() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/https://www.facebook.com/mdjubayer.hossain.98434"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/mdjubayer.hossain.98434"));
        }
    }

    /*shahida shantu*/
    private Intent getOpenFacebookIntentrubayet() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shahidasultana.shantu"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/shahidasultana.shantu"));
        }
    }

    /*zayed hasan noman*/
    private Intent getOpenFacebookIntentpiash() {
        try {
            getPackageManager().getPackageInfo("com.facebook.katana", 0);
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/zayedhasan.noman"));
        } catch (Exception e) {
            return new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/zayedhasan.noman"));
        }
    }


}