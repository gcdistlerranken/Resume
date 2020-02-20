package com.google.distlergrace.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    Button  buttonEducation;
    Button  buttonWorkExperience;
    Button  buttonCall;
    Button  buttonEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonEducation = findViewById(R.id.buttonEducation);
        buttonWorkExperience = findViewById(R.id.buttonWorkExperience);
        buttonCall = findViewById(R.id.buttonCall);
        buttonEmail = findViewById(R.id.buttonEmail);

        buttonEducation.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), EducationActivity.class);

                startActivity(intent);
            }
        });

        buttonWorkExperience.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(getApplicationContext(), WorkExperienceActivity.class);

                startActivity(intent);
            }
        });

        buttonCall.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Uri phoneNumber = Uri.parse("tel:3145403427");
                Intent intent = new Intent(Intent.ACTION_DIAL, phoneNumber);
                startActivity(intent);
            }
        });

        buttonEmail.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                Intent intent = new Intent(Intent.ACTION_SEND);
                intent.setType("plain/text");
                intent.putExtra(Intent.EXTRA_EMAIL, new String[] {"distlergrace@gmail.com"});
                intent.putExtra(Intent.EXTRA_SUBJECT, "Resume");
                //intent.putExtra(Intent.EXTRA_TEXT,
                //                "This is to let you know that your resume has been received");
            }
        });
    }
}
