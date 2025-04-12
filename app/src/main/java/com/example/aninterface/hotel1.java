package com.example.aninterface;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class hotel1 extends AppCompatActivity {

    private ImageView emailIcon, phoneIcon, smsIcon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.hotel1);

        emailIcon = findViewById(R.id.email_icon);
        phoneIcon = findViewById(R.id.phone_icon);
        smsIcon = findViewById(R.id.sms_icon);

        emailIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendEmail();
            }
        });

        phoneIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                makePhoneCall();
            }
        });

        smsIcon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendSMS();
            }
        });
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void sendEmail() {
        Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
        emailIntent.setData(Uri.parse("mailto:sarahriehe@gmail.com")); // Note "mailto:" prefix
        emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Subject");
        emailIntent.putExtra(Intent.EXTRA_TEXT, "Body of the email");
        if (emailIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(emailIntent);
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void makePhoneCall() {
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:+82-2-768-8600")); // Replace with your phone number
        if (callIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(callIntent);
        }
    }

    @SuppressLint("QueryPermissionsNeeded")
    private void sendSMS() {
        Intent smsIntent = new Intent(Intent.ACTION_VIEW);
        smsIntent.setData(Uri.parse("sms:+82-2-768-8600")); // Replace with your phone number
        smsIntent.putExtra("sms_body", "Body of the SMS");
        if (smsIntent.resolveActivity(getPackageManager()) != null) {
            startActivity(smsIntent);
        }


    }

}
