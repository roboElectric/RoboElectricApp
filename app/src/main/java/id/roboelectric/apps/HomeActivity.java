package id.roboelectric.apps;

import id.roboelectric.apps.adapter.ToolsAdapter;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;

public class HomeActivity extends AppCompatActivity {

    private Unbinder unbinder;
    private List<String> mListTools = new ArrayList<>();
    private ToolsAdapter mAdapter;
    @BindView(R.id.recycler_view)
    RecyclerView mRecyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        unbinder = ButterKnife.bind(this);

        initRecylerView();
    }
    private void initRecylerView() {
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        mRecyclerView.setLayoutManager(lm);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());

        //Adapter
       if (mListTools.isEmpty()){
           mListTools.add("Bluetooth");
           mListTools.add("Wifi");
       }
       mAdapter = new ToolsAdapter(mListTools);
       mRecyclerView.setAdapter(mAdapter);
    }

    @Override
    protected void onDestroy() {
        if (unbinder != null) unbinder.unbind();
        super.onDestroy();
    }
}
