package com.starryrain.smalltarget;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class TargetDatabaseHelper extends SQLiteOpenHelper{
    public final String CREATE_TARGET="create table TargetList ("
            +"id integer primary key autoincrement, "
            +"beginy integer, beginm integer, begind integer, "
            +"type integer, "//0代表限期目标，1代表不限期目标
            +"endy integer, endm integer, endd integer, "//限期目标的结束时间
            +"name text, "
            +"alarm blob, "//提醒开关及时间
            +"alarmh integer, alarmm integer, "
            +"week1 blob, week2 blob, week3 blob, "//重复提醒设置，不支持单次提醒
            +"week4 blob, week5 blob, week6 blob, week7 blob)";
    private Context mContext;
    public TargetDatabaseHelper(Context context, String name,
                                SQLiteDatabase.CursorFactory factory, int version){
        super(context,name,factory,version);
        mContext=context;
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_TARGET);
        Toast.makeText(mContext,"Create db",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){

    }
}
