package com.example.tungg.Database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    private static final String DB_NAME = "DuAn1";
    private static final int DB_VESION = 1;
    public DbHelper(@Nullable Context context) {
        super(context,DB_NAME, null, DB_VESION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String createTableNhanVien = "CREATE TABLE nhanVien(maNV TEXT PRIMARY KEY, hoTen TEXT NOT NULL, namSinh TEXT NOT NULL,taiKhoan TEXT NOT NULL,matKhau TEXT NOT NULL,hinhAnh TEXT NOT NULL,status TEXT NOT NULL)";
        db.execSQL(createTableNhanVien);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
