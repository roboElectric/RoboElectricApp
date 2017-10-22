package id.roboelectric.apps.adapter;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import id.roboelectric.apps.R;

/**
 * Created by My on 21 Oct.
 */

public class ToolsAdapter extends RecyclerView.Adapter<ToolsAdapter.ToolViewHolder> {
    private List<String> mAdapterList = null;
    public class ToolViewHolder extends RecyclerView.ViewHolder{
        @BindView(R.id.tool_name)
        Button toolName;
        public ToolViewHolder(View v){
            super(v);
            ButterKnife.bind(this,v);
        }
    }

    public ToolsAdapter(List<String> list){
        mAdapterList = list;
    }

    public ToolViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.home_tools_layout,parent,false);
        return new ToolViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ToolViewHolder holder, int position) {
        holder.toolName.setText(mAdapterList.get(position));
    }

    @Override
    public int getItemCount() {
        return mAdapterList.size();
    }
}
