package com.example.i7.moneytracker;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends ActionBarActivity {

    private ListView listView; //02-26
    private  TransactionsAdapter transactionsAdapter;  //02-66
    List<Transactions> data = new ArrayList<>(); //02-62

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List <Transactions> adapterData = getDataList();
        transactionsAdapter = new TransactionsAdapter(MainActivity.this, adapterData); //02-67
        listView = (ListView)findViewById(R.id.listview); //02-26
        listView.setAdapter(transactionsAdapter);  //02-67

    }

    private List<Transactions> getDataList(){
        data.add(new Transactions("Telephone 1", "1000"));
        data.add(new Transactions("Telephone 2", "2000"));
        data.add(new Transactions("Telephone 3", "3000"));
        return data;
    }

}
