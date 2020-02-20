package com.google.distlergrace.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class WorkExperienceActivity extends AppCompatActivity
{
    TextView    textViewWorkExperienceInformation;
    Button      buttonReturnHome;
    Spanned     ConvertHTML;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_work_experience);
        textViewWorkExperienceInformation   = findViewById(R.id.textViewWorkExperienceInformation);
        buttonReturnHome                    = findViewById(R.id.buttonReturnHome);

        ConvertHTML = Html.fromHtml(
                //"<strong><u>W O R K  E X P E R I E N C E</u></strong><br />\n" +
                "<strong>Children's Learning Adventure: May - August 2018</strong><br />\n" +
                        "<u>Assistant Teacher</u> - Ellisville MO<br />" +
                        "•\t\t\tWorked with children in first grade <br>" +
                        "\t\t\t(schoolwork and homework)<br>" +
                        "•\t\t\tAssisted in keeping the children on task and entertained<br>" +
                        "•\t\t\tResolved issues and parent complaints<br><br>\n" +
                        "<strong>Mercy Hospital: May 2016 - August 2017</strong><br />\n" +
                        "<u>Food Technician</u> - St. Louis MO<br />" +
                        "•\t\t\tWorked in the Heart Hospital Kitchen <br>" +
                        "\t\t\t(prepared patient trays)<br>" +
                        "•\t\t\tInteracted and delivered to a hundred patients and <br>" +
                        "\t\t\tguests per day<br>" +
                        "•\t\t\tResolved patient issues and complaints\n"
        );

        textViewWorkExperienceInformation.setText(ConvertHTML);

        buttonReturnHome.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
             finish();
            }
        });
    }
}
