package com.thohao.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.AbsListView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }
    public void initView(){
        RecyclerView recyclerView=findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
        recyclerView.setLayoutManager(linearLayoutManager);
        DividerItemDecoration dividerItemDecoration=new DividerItemDecoration(
                this,linearLayoutManager.getOrientation()
        );
        recyclerView.addItemDecoration(dividerItemDecoration);
        ArrayList<DataShop> arrayList=new ArrayList<>();
        arrayList.add(new DataShop(R.drawable.banner01,"Banner01"));
        arrayList.add(new DataShop(R.drawable.banner02,"Banner02"));
        arrayList.add(new DataShop(R.drawable.banner03,"Banner03"));
        arrayList.add(new DataShop(R.drawable.banner04,"Banner04"));
        ShopAdapter shopAdapter=new ShopAdapter(arrayList,getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }
}
