package wang.oo0oo.taobaoimitation.fragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.youth.banner.Banner;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import wang.oo0oo.taobaoimitation.GlideImageLoader;
import wang.oo0oo.taobaoimitation.GoodsAdapter;
import wang.oo0oo.taobaoimitation.R;
import wang.oo0oo.taobaoimitation.WeitaoLeftAdapter;

public class WeitaoLeftFragment extends Fragment {


    List<String> itemNameList = new ArrayList<>();

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_weitao_left, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();

        FragmentActivity view = Objects.requireNonNull(getActivity());

        // RecyclerView
        initItemNameList();
        RecyclerView recyclerView = view.findViewById(R.id.weitao_left_recycler_view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view);
        recyclerView.setLayoutManager(layoutManager);
        WeitaoLeftAdapter adapter = new WeitaoLeftAdapter(itemNameList);
        recyclerView.setAdapter(adapter);
    }

    private void initItemNameList() {
        itemNameList.add("热门推荐");
        itemNameList.add("女士服装");
        itemNameList.add("女士鞋包");
        itemNameList.add("男士服装");
        itemNameList.add("男士鞋包");
        itemNameList.add("手机数码");
        itemNameList.add("妈咪宝贝");
        itemNameList.add("护肤彩妆");
        itemNameList.add("家纺装饰");
        itemNameList.add("美食酒饮");
        itemNameList.add("家电办公");
        itemNameList.add("运动户外");
        itemNameList.add("珠宝配饰");
        itemNameList.add("日用百货");
        itemNameList.add("家具建材");
    }
}
