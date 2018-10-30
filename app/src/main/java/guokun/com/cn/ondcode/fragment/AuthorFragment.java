package guokun.com.cn.ondcode.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import guokun.com.cn.ondcode.R;
import guokun.com.cn.ondcode.activity.FragmentTestActivity;

public class AuthorFragment extends Fragment {
    private List<String> names;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }
    private void initData() {
        names = new ArrayList<String>();
        names.add("韩愈");
        names.add("柳宗元");
        names.add("苏轼");
        names.add("苏辙");
        names.add("苏洵");
        names.add("欧阳修");
        names.add("曾巩");
        names.add("王安石");
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.author_fragment,container,false);
        initAdapter(view);
        return view;
    }

    private void initAdapter(View view){
        ListView listView = view.findViewById(R.id.author_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),android.R.layout.simple_list_item_1,names);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                BookFragment bookFragment = (BookFragment) getActivity().getSupportFragmentManager().findFragmentById(R.id.book);
                bookFragment.isShow(names.get(i));
            }
        });
    }

}
