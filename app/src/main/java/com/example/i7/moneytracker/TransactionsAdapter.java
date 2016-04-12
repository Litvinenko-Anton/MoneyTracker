package com.example.i7.moneytracker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by i7 on 04.02.2016. 02-45
 */
public class TransactionsAdapter extends ArrayAdapter<Transactions> {

    //02-82
    public TransactionsAdapter(Context context, List<Transactions> transactionses) {
        super(context, 0, transactionses);
    }

    @Override //02-49
    public View getView(int position, View convertView, ViewGroup parent) {
        Transactions transaction = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        TextView textViewTitle = (TextView) convertView.findViewById(R.id.textViewTitle);
        TextView textViewSum = (TextView) convertView.findViewById(R.id.textViewSum);

        textViewTitle.setText(transaction.title);
        textViewSum.setText(transaction.sum);

        return convertView;
    }
}
