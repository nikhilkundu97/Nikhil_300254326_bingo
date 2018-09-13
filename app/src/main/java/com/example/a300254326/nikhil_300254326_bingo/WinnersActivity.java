package com.example.a300254326.nikhil_300254326_bingo;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

public class WinnersActivity extends AppCompatActivity {
    MyDB db = new MyDB(this);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_winners);

        final TableLayout theView = (TableLayout) findViewById(R.id.theTable);
        final SQLiteDatabase rdb = db.getReadableDatabase();
        String selectQuery = "SELECT  * FROM " + Entry.table;
        try {
            Cursor cursor = rdb.rawQuery(selectQuery, null);
            if (cursor != null) {
                cursor.moveToFirst();
                TextView data;
                TableRow row;
                int cnt = 0;
                do {
                    row = new TableRow(WinnersActivity.this);
                    row.setPadding(2, 2, 2, 2);
                    if (cnt++ % 2 == 0)
                        row.setBackgroundColor(Color.WHITE);
                    for (int x = 0; x < cursor.getColumnCount(); x++) {
                        data = new TextView(WinnersActivity.this);
                        if (x == 0) {
                            data.setTypeface(Typeface.DEFAULT_BOLD);
                            data.setGravity(Gravity.CENTER_HORIZONTAL);
                        }
                        data.setText(cursor.getString(x));
                        row.addView(data);
                    }
                    theView.addView(row);
                } while (cursor.moveToNext());
                theView.setShrinkAllColumns(true);
                theView.setStretchAllColumns(true);

            }
        }catch (Exception ex) { }


    }

}
