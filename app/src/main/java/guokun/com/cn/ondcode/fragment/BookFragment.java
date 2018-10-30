package guokun.com.cn.ondcode.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import guokun.com.cn.ondcode.R;

public class BookFragment extends Fragment {
    private HashMap<String, List<String>> map;
    private List<String> list;
    private List<String> list2;
    private ListView listView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initData();
    }

    private void initData() {
        map = new HashMap<String, List<String>>();
        list = new ArrayList<String>();
        list.add("师说");
        list.add("马说");
        list.add("早春呈水部张十八员外");
        map.put("韩愈", list);

        list = new ArrayList<String>();
        list.add("小石潭记");
        list.add("江雪");
        list.add("捕蛇者说");
        list.add("小石城山记");
        map.put("柳宗元", list);

        list = new ArrayList<String>();
        list.add("水调歌头");
        list.add("念奴娇·赤壁怀古");
        list.add("江城子·密州出猎");
        list.add("赤壁赋");
        list.add("题西林壁");
        map.put("苏轼", list);

        list = new ArrayList<String>();
        list.add("黄州快哉亭记");
        list.add("上枢密韩太尉书");
        map.put("苏辙", list);

        list = new ArrayList<String>();
        list.add("六国论");
        list.add("九日和韩魏公");
        list.add("心术");
        list.add("管仲论");
        map.put("苏洵", list);

        list = new ArrayList<String>();
        list.add("六国论");
        list.add("九日和韩魏公");
        list.add("心术");
        list.add("管仲论");
        map.put("欧阳修", list);

        list = new ArrayList<String>();
        list.add("六国论");
        list.add("九日和韩魏公");
        list.add("心术");
        list.add("管仲论");
        map.put("曾巩", list);

        list = new ArrayList<String>();
        list.add("六国论");
        list.add("九日和韩魏公");
        list.add("心术");
        list.add("管仲论");
        map.put("王安石", list);









    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.book_fragment, container, false);
        initAdapter(view);
        return view;
    }

    private void initAdapter(View view) {
        listView = view.findViewById(R.id.book_item);
        list2 = new ArrayList<>();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list2);
        listView.setAdapter(adapter);
    }

    public void isShow(String name) {
        list2 = map.get(name);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(), android.R.layout.simple_list_item_1, list2);
        listView.setAdapter(adapter);
//        listView.deferNotifyDataSetChanged();
    }


}
