package com.google.distlergrace.resume;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class EducationActivity extends AppCompatActivity
{
    TextView    textViewEducationInformation;
    Button      buttonReturnHome;
    Spanned     ConvertHTML;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_education);
        textViewEducationInformation    = findViewById(R.id.textViewEducationInformation);
        buttonReturnHome                = findViewById(R.id.buttonReturnHome);

        ConvertHTML = Html.fromHtml(
                //"<strong><u>E D U C A T I O N</u></strong><br />\n" +
                  "<strong>A.T. Application and Website Development - May 2020</strong><br />\n" +
                  "Ranken Technical College - Wentzville MO<br />GPA: 3.63/4.0<br />\n" +
                  "<strong>General Education and Business Classes - December 2017</strong><br />\n"+
                  "Missouri University of Science and Technology - Rolla MO<br /><br />\n" +
                  "<strong>Major Courses:</strong><br />\n" +
                  "AWD1000 - Web Development Technologies <br>" +
                        "\t\t\t\t\t\t\t\t\t\t(HTML5, CSS3, JavaScript, jQuery)<br>\n" +
                  "AWD1100 - Programming Fundamentals with C#<br>\n" +
                  "AWD1111 - .NET Framework with Web Databases <br>" +
                        "\t\t\t\t\t\t\t\t\t\t(ASP.NET)<br>\n" +
                  "AWD1112 - Application Programming with Java <br>" +
                        "\t\t\t\t\t\t\t\t\t\t(Android)<br><br>\n" +
                  "<strong>General Education and Business Courses:</strong><br />\n" +
                  "<strong><u>Ranken:</u></strong><br />\n" +
                  "BUS 1000 - Carreer Success <br>\n" +
                  "COM 1105 - Oral Communication <br>\n" +
                  "ENG 1101 - Composition I<br>\n" +
                  "ENG 2102 - Composition II<br>\n" +
                  "SOC 1206 - Sociology<br>\n" +
                  "MNG 1204 - Intro to Business and Management<br><br>\n" +
                  "<strong><u>MST:</u></strong><br />\n" +
                  "MATH 1100 - Intermediate Algebra <br>\n" +
                  "MATH 1120 - College Algebra <br>\n" +
                  "ENG  1099 - Fundamentals of Composition <br>\n" +
                  "IS&T 1551 - Information Systems: User Perspective<br>\n" +
                  "IS&T 1552 - Information Systems: Data Perspective <br>\n" +
                  "BUS  1810 - Intro to College Success <br>\n" +
                  "BUS  1110 - Intro to Management and Entrepreneurship"
        );

        textViewEducationInformation.setText(ConvertHTML);

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
