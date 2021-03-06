package com.spw.labelview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private LabelView mLabelView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLabelView = (LabelView) findViewById(R.id.label);
        mLabelView.setLabelBackgroundResource(R.drawable.label_back);
        final List<String> list = new ArrayList<>();
        list.add("Android");
        list.add("IOS");
        list.add("前端");
        list.add("后台");
        list.add("微信开发");
        list.add("Java");
        list.add("JavaScript");
        list.add("C++");
        list.add("PHP");
        list.add("Python");

        mLabelView.setLable(list);

        mLabelView.setmOnLabelListener(new LabelView.OnLabelListener() {
            @Override
            public void labelClick(View view, int position) {
                Toast.makeText(MainActivity.this, "click:" + list.get(position), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
