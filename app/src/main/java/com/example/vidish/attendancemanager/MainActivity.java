package com.example.vidish.attendancemanager;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public static final String ip = "192.168.0.3";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Welcome to Attendance Manager");
        Button facultyLogin=(Button) findViewById(R.id.button_faculty_login);
        Button studentLogin=(Button) findViewById(R.id.button_student_login);
        facultyLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FacultyLogin.class);
                startActivity(intent);
            }
        });
        studentLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, StudentLogin.class).putExtra("direct",0);
                startActivity(intent);
            }
        });
        AlarmReceiver alarmReceiver = new AlarmReceiver();
        alarmReceiver.setAlarm(this);
    }


}
