package com.tj.jickbang_listview;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.tj.jickbang_listview.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding act;
    List<Room> appList = new ArrayList<Room>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        act = DataBindingUtil.setContentView(this, R.layout.activity_main );

        roomList();
    }

    void roomList() {
        appList.add(new Room("100/13","2층","경상북도 구미시 송정동","분리형 원룸", "풀옵션 초대박 원룸"));
        appList.add(new Room("100/15","3층","경상북도 구미시 원평동","분리형 원룸", "신형 원룸입니다."));
        appList.add(new Room("100/13","3층","경상북도 구미시 협곡동","분리형 원룸", "새출발을 응원합니다."));
        appList.add(new Room("100/13","2층","경상북도 구미시 신평동","분리형 원룸", "구미역 뒤 풀옵션"));
        appList.add(new Room("100/13","2층","경상북도 구미시 신평동","분리형 원룸", "강력추천 먹자골목 인근"));
    }

}
