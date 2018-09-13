package com.example.a300254326.nikhil_300254326_bingo;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class bingo_Nikhil extends AppCompatActivity {

    private int h1=0,h2=0,h3=0,h4=0,h5=0,v1=0,v2=0,v3=0,v4=0,v5=0,d1=0,d2=0,WinCount = 0,count=0;
    private TextView rowTextView;
    MyDB db = new MyDB(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final SQLiteDatabase wdb = db.getWritableDatabase();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bingo__nikhil);
        final Bundle bundle = getIntent().getExtras();
        String nameuser = bundle.getString("name");
        Log.d("fds",nameuser);
        final TextView nme = (TextView) findViewById(R.id.username);
        nme.setText(nameuser.toString());
        String dte = bundle.getString("date");
        final TextView dte2 = (TextView) findViewById(R.id.dte);
        dte2.setText(dte);
        final TextView counte = (TextView) findViewById(R.id.rounds);

        final TextView _b = (TextView) findViewById(R.id._B);
        final TextView _i = (TextView) findViewById(R.id._I);
        final TextView _n = (TextView) findViewById(R.id._N);
        final TextView _g = (TextView) findViewById(R.id._G);
        final TextView _o = (TextView) findViewById(R.id._O);
        final TextView _1 = (TextView) findViewById(R.id._1);
        final TextView _2 = (TextView) findViewById(R.id._2);
        final TextView _3 = (TextView) findViewById(R.id._3);
        final TextView _4 = (TextView) findViewById(R.id._4);
        final TextView _5 = (TextView) findViewById(R.id._5);
        final TextView _6 = (TextView) findViewById(R.id._6);
        final TextView _7 = (TextView) findViewById(R.id._7);
        final TextView _8 = (TextView) findViewById(R.id._8);
        final TextView _9 = (TextView) findViewById(R.id._9);
        final TextView _10 = (TextView) findViewById(R.id._10);
        final TextView _11 = (TextView) findViewById(R.id._11);
        final TextView _12 = (TextView) findViewById(R.id._12);
        final TextView _13 = (TextView) findViewById(R.id._13);
        final TextView _14 = (TextView) findViewById(R.id._14);
        final TextView _15 = (TextView) findViewById(R.id._15);
        final TextView _16 = (TextView) findViewById(R.id._16);
        final TextView _17 = (TextView) findViewById(R.id._17);
        final TextView _18 = (TextView) findViewById(R.id._18);
        final TextView _19 = (TextView) findViewById(R.id._19);
        final TextView _20 = (TextView) findViewById(R.id._20);
        final TextView _21 = (TextView) findViewById(R.id._21);
        final TextView _22 = (TextView) findViewById(R.id._22);
        final TextView _23 = (TextView) findViewById(R.id._23);
        final TextView _24 = (TextView) findViewById(R.id._24);
        final TextView _25 = (TextView) findViewById(R.id._25);
        final LinearLayout LinLay = (LinearLayout) findViewById(R.id.lin);


        final TextView data = (TextView) findViewById(R.id.randomNum);
        final int size = 25;

        final ArrayList<Integer> list = new ArrayList<Integer>(size);
        for(int i = 1; i <= size; i++) {
            list.add(i);
        }
        final ArrayList<Integer> listForB = new ArrayList<Integer>(size);
        for(int i = 1; i <= 15; i++) {
            listForB.add(i);
        }
        Button ranbtn = (Button) findViewById(R.id.Ranbtn);
        ranbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Collections.shuffle(list);
                Collections.shuffle(listForB);
                list.remove(listForB.get(0));
                list.remove(listForB.get(1));
                list.remove(listForB.get(2));
                list.remove(listForB.get(3));
                list.remove(listForB.get(4));

                _1.setText(listForB.get(0).toString());
                _2.setText(list.get(0).toString());
                _3.setText(list.get(1).toString());
                _4.setText(list.get(2).toString());
                _5.setText(list.get(3).toString());
                _6.setText(listForB.get(1).toString());
                _7.setText(list.get(4).toString());
                _8.setText(list.get(5).toString());
                _9.setText(list.get(6).toString());
                _10.setText(list.get(7).toString());
                _11.setText(listForB.get(2).toString());
                _12.setText(list.get(8).toString());
                _13.setText(list.get(9).toString());
                _14.setText(list.get(10).toString());
                _15.setText(list.get(11).toString());
                _16.setText(listForB.get(3).toString());
                _17.setText(list.get(12).toString());
                _18.setText(list.get(13).toString());
                _19.setText(list.get(14).toString());
                _20.setText(list.get(15).toString());
                _21.setText(listForB.get(4).toString());
                _22.setText(list.get(16).toString());
                _23.setText(list.get(17).toString());
                _24.setText(list.get(18).toString());
                _25.setText(list.get(19).toString());
                Collections.shuffle(list);
            }
        });

        final ArrayList<Integer> randomlist = new ArrayList<Integer>(25);
        randomlist.clear();
        for( int i = 0 ; i < list.size() ; i++ )
        {
            randomlist.add( list.get( i ));
        }

        Button b = (Button) findViewById(R.id.ranNumbtn);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count++;
                counte.setText(String.valueOf(count));
                Log.d("randomlist",randomlist.toString());
                int random = 0 ;
                if(!randomlist.isEmpty())
                {
                    Log.d("dfs",randomlist.get(0).toString());
                    random = randomlist.get(0);
                    data.setText(Integer.toString(random));
                    randomlist.remove(0);
                }
                Log.d("randomNumber",Integer.toString(random));

                if(_1.getText().toString() .equals (Integer.toString(random))) {
                    Log.d("first cell",_1.getText().toString());
                    _1.setBackgroundResource(R.drawable.circle);
                    _1.setTextColor(Color.BLACK);
                    h1++;v1++;d1++;
                }
                else if(_2.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_2.getText().toString());
                    _2.setBackgroundResource(R.drawable.circle);
                    _2.setTextColor(Color.BLACK);
                    h1++;v2++;
                }
                else if(_3.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_3.getText().toString());
                    _3.setBackgroundResource(R.drawable.circle);
                    _3.setTextColor(Color.BLACK);
                    h1++;v3++;
                }
                else if(_4.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_4.getText().toString());
                    _4.setBackgroundResource(R.drawable.circle);
                    _4.setTextColor(Color.BLACK);
                    h1++;v4++;
                }
                else if(_5.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_5.getText().toString());
                    _5.setBackgroundResource(R.drawable.circle);
                    _5.setTextColor(Color.BLACK);
                    h1++;v5++;d2++;
                }
                else if(_6.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_6.getText().toString());
                    _6.setBackgroundResource(R.drawable.circle);
                    _6.setTextColor(Color.BLACK);
                    h2++;v1++;
                }
                else if(_7.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_7.getText().toString());
                    _7.setBackgroundResource(R.drawable.circle);
                    _7.setTextColor(Color.BLACK);
                    h2++;d1++;v2++;
                }
                else if(_8.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_8.getText().toString());
                    _8.setBackgroundResource(R.drawable.circle);
                    _8.setTextColor(Color.BLACK);
                    h2++;v3++;
                }
                else if(_9.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_9.getText().toString());
                    _9.setBackgroundResource(R.drawable.circle);
                    _9.setTextColor(Color.BLACK);
                    h2++;v4++;d2++;
                }
                else if(_10.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_10.getText().toString());
                    _10.setBackgroundResource(R.drawable.circle);
                    _10.setTextColor(Color.BLACK);
                    h2++;v5++;
                }
                else if(_11.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_11.getText().toString());
                    _11.setBackgroundResource(R.drawable.circle);
                    _11.setTextColor(Color.BLACK);
                    h3++;v1++;
                }
                else if(_12.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_12.getText().toString());
                    _12.setBackgroundResource(R.drawable.circle);
                    _12.setTextColor(Color.BLACK);
                    h3++;v2++;
                }
                else if(_13.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_13.getText().toString());
                    _13.setBackgroundResource(R.drawable.circle);
                    _13.setTextColor(Color.BLACK);
                    h3++;v3++;d1++;d2++;
                }
                else if(_14.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_14.getText().toString());
                    _14.setBackgroundResource(R.drawable.circle);
                    _14.setTextColor(Color.BLACK);
                    h3++;v4++;
                }
                else if(_15.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_15.getText().toString());
                    _15.setBackgroundResource(R.drawable.circle);
                    _15.setTextColor(Color.BLACK);
                    h3++;v5++;
                }
                else if(_16.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_16.getText().toString());
                    _16.setBackgroundResource(R.drawable.circle);
                    _16.setTextColor(Color.BLACK);
                    h4++;v1++;
                }
                else if(_17.getText().toString().equals(Integer.toString(random))) {
                    Log.d("first cell",_17.getText().toString());
                    _17.setBackgroundResource(R.drawable.circle);
                    _17.setTextColor(Color.BLACK);
                    h4++;v2++;d2++;
                }
                else if(_18.getText().toString().equals(Integer.toString(random))) {
                    Log.d("18 cell",_18.getText().toString());
                    _18.setBackgroundResource(R.drawable.circle);
                    _18.setTextColor(Color.BLACK);
                    h4++;v3++;
                }
                else if(_19.getText().toString().equals(Integer.toString(random))) {
                    Log.d("19 cell",_19.getText().toString());
                    _19.setBackgroundResource(R.drawable.circle);
                    _19.setTextColor(Color.BLACK);
                    h4++;v4++;d1++;
                }
                else if(_20.getText().toString().equals(Integer.toString(random))) {
                    Log.d("20 cell",_20.getText().toString());
                    _20.setBackgroundResource(R.drawable.circle);
                    _20.setTextColor(Color.BLACK);
                    h4++;v5++;
                }
                else if(_21.getText().toString().equals(Integer.toString(random))) {
                    Log.d("21 cell",_21.getText().toString());
                    _21.setBackgroundResource(R.drawable.circle);
                    _21.setTextColor(Color.BLACK);
                    h5++;v1++;d2++;
                }
                else if(_22.getText().toString().equals(Integer.toString(random))) {
                    Log.d("22 cell",_22.getText().toString());
                    _22.setBackgroundResource(R.drawable.circle);
                    _22.setTextColor(Color.BLACK);
                    h5++;v2++;
                }
                else if(_23.getText().toString().equals(Integer.toString(random))) {
                    Log.d("23 cell",_23.getText().toString());
                    _23.setBackgroundResource(R.drawable.circle);
                    _23.setTextColor(Color.BLACK);
                    h5++;v3++;
                }
                else if(_24.getText().toString().equals(Integer.toString(random))) {
                    Log.d("24 cell",_24.getText().toString());
                    _24.setBackgroundResource(R.drawable.circle);
                    _24.setTextColor(Color.BLACK);
                    h5++;v4++;
                }
                else if(_25.getText().toString().equals(Integer.toString(random))) {
                    Log.d("25 cell",_25.getText().toString());
                    _25.setBackgroundResource(R.drawable.circle);
                    _25.setTextColor(Color.BLACK);
                    h5++;v5++;d1++;
                }



                if(h1==5)
                { WinCount++;h1=0;}
                if(h2==5)
                {   WinCount++;h2=0;}
                if(h3==5)
                {   WinCount++;h3=0;}
                if(h4==5)
                {   WinCount++;h4=0;}
                if(h5==5)
                {   WinCount++;h5=0;}
                if(v1==5)
                {    WinCount++;v1=0;}
                if(v2==5)
                {   WinCount++;v2=0;}
                if(v3==5)
                {  WinCount++;v3=0;}
                if(v4==5)
                {   WinCount++;v4=0;}
                if(v5==5)
                {   WinCount++;v5=0;}
                if(d1==5)
                {    WinCount++;d1=0;}
                if(d2==5)
                {   WinCount++;d2=0;}

                int[] arr = new int[]{h1,h2,h3,h4,h5,v1,v2,v3,v4,v5,d1,d2};
                Log.d("wincount",Integer.toString(WinCount));
                Log.d("wincount", Arrays.toString(arr));
                if(WinCount>=1)
                    _b.setTextColor(Color.RED);
                if(WinCount>=2){
                    _b.setTextColor(Color.RED);
                    _i.setTextColor(Color.RED);
                }
                if(WinCount>=3) {
                    _n.setTextColor(Color.RED);
                    _b.setTextColor(Color.RED);
                    _i.setTextColor(Color.RED);
                }
                if(WinCount>=4) {
                    _g.setTextColor(Color.RED);
                    _n.setTextColor(Color.RED);
                    _b.setTextColor(Color.RED);
                    _i.setTextColor(Color.RED);
                }
                if(WinCount>=5) {
                    _o.setTextColor(Color.RED);
                    _g.setTextColor(Color.RED);
                    _n.setTextColor(Color.RED);
                    _b.setTextColor(Color.RED);
                    _i.setTextColor(Color.RED);

                    String nameuser = bundle.getString("name");
                    ContentValues values = new ContentValues();
                    values.put(Entry.col2, nameuser);
                    wdb.insert(Entry.table, null, values);

                    Intent intent = new Intent(bingo_Nikhil.this, WinnersActivity.class);
                    startActivity(intent);
                    finish();
                }

            }
        });

        final TextView[] myTextViews = new TextView[25];

        for (int i = 0; i < 25; i++) {
            rowTextView = new TextView(this);
            //rowTextView.setText("fg"+i);

            LinLay.addView(rowTextView);
            myTextViews[i] = rowTextView;
        }

    }
}
