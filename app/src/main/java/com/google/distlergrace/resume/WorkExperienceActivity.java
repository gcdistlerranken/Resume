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
                  "<strong><u>W O R K</u></strong><br />\n" +
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
                        "•\t\t\tResolved patient issues and complaints<br><br>\n" +
                        "<strong><u>V O L U N T E E R</u></strong><br>\n" +
                        "<strong>Stray Rescue of St. Louis: January 2018 - Present</strong><br />\n" +
                        "<u>Foster Parent</u> - St. Louis MO<br /><br>" +
                        //"•\t\t\tTook care of sets of young puppies by feeding, bathing, giving attention, and training<br>" +
                        //"\t\t\t(ages ranging from 4 weeks - 6 months)<br>\n" +
                        "<strong>SSM St. Mary's Hospital: March 2016 - May 2016</strong><br />\n" +
                        "<u>Nurse's Station Volunteer</u> - St. Louis MO<br /><br>" +
                        //"•\t\t\tAnswered phone calls <br>" +
                        //"•\t\t\tTransferred calls to appropriate people <br>" +
                        //"•\t\t\tAnswered call lights<br>" +
                       //"•\t\t\tMade welcome kits to put in each room<br>\n" +
                        "<strong>Sts. Peter and Paul Soup Kitchen: August 2013 - May 2016</strong><br />\n" +
                        "<u>Volunteer</u> - St. Louis MO<br /><br>" +
                        //"•\t\t\tServed food to the homeless <br>" +
                        //"•\t\t\tCleared tables and reset for others <br>\n" +
                        "<strong>T.A.S.K.: August 2012 - May 2012</strong><br />\n" +
                        "<u>Team Activities for Special Kids Volunteer</u> - St. Louis MO<br />"
                        //+ "•\t\t\tHelped special needs children with various activities <br>" +
                        //"•\t\t\tTook children on a field trip and helped them bowl <br>\n"
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
