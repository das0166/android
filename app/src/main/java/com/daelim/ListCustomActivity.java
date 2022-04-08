package com.daelim;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.daelim.data.listdata;

import java.util.ArrayList;

public class ListCustomActivity extends AppCompatActivity {
    private ArrayList<listdata> list;
    private listdata data;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_custom);

        ListView lv_cs_data = findViewById(R.id.lv_cs_data);
        list=new ArrayList<>();
        list.add(new listdata("짱구","010-1234-5678",true));
        list.add(new listdata("흰둥이","010-2345-6789",true));
        data = new listdata("유리","010-8888-4456",false);
        list.add(data);


        lv_cs_data.setAdapter(new BaseAdapter() {
            @Override
            public int getCount() {
                return list.size();
            }

            @Override
            public Object getItem(int i) {
                return null;
            }

            @Override
            public long getItemId(int i) {
                return 0;
            }

            @Override
            public View getView(int i, View view, ViewGroup viewGroup) {
                view = getLayoutInflater().inflate(R.layout.list_custom_item,viewGroup,false);
                ImageView iv = view.findViewById(R.id.lci_image);
                TextView tvw1 = view.findViewById(R.id.lci_text1);
                TextView tvw2 = view.findViewById(R.id.lci_text2);
                if(list.get(i).getPic()) {
                    iv.setImageResource(R.drawable.zzanggu);
                }else{
                    iv.setImageResource(R.drawable.uri);
                }
                tvw1.setText(list.get(i).getName());
                tvw2.setText(list.get(i).getPhone());
                return view;
            }
        });
    }
}