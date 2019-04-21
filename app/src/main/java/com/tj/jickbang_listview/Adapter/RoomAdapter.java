package com.tj.jickbang_listview.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ArrayAdapter;

import com.tj.jickbang_listview.R;
import com.tj.jickbang_listview.Room;

import java.util.List;

public class RoomAdapter extends ArrayAdapter<Room> {
    Context mContext;
    List<Room> mList;
    LayoutInflater inf;

    public RoomAdapter(Context context, List<Room> list) {
        super(context, R.layout.room_list_item, list);
        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }


}
