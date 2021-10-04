package com.example.lifeofgirl.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lifeofgirl.CommentsActivity;
import com.example.lifeofgirl.R;
import com.example.lifeofgirl.databinding.FragmentHomeBinding;

;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;
    private FragmentHomeBinding binding;
    private RecyclerView recyclerView;

    private RecyclerView.LayoutManager layoutManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);

        binding = FragmentHomeBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

//        mAdapter = new ConfirmRecyclerAdapter(this, names, prices, nums, ConfirmActivity.this);
//        layoutManager = new LinearLayoutManager(getActivity());
//        recyclerView.setAdapter(mAdapter);
//        recyclerView.setLayoutManager(layoutManager);

//        View view = root.findViewById(R.id.post_1);
        ImageView image1 = root.findViewById(R.id.imgDislike);
        TextView textView = root.findViewById(R.id.txtDislike);
        image1.setOnClickListener(view1 -> {
            Intent intent = new Intent(getContext(), CommentsActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        textView.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), CommentsActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        ImageView image11 = root.findViewById(R.id.imgDislike1);
        TextView textView1 = root.findViewById(R.id.txtDislike1);
        image11.setOnClickListener(view1 -> {
            Intent intent = new Intent(getContext(), CommentsActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        textView1.setOnClickListener(view -> {
            Intent intent = new Intent(getContext(), CommentsActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });

        ImageView smile = root.findViewById(R.id.imgLike);
        ImageView smile1 = root.findViewById(R.id.imgLikeAfter);
        ImageView smile2 = root.findViewById(R.id.imgLike1);
        ImageView smile3 = root.findViewById(R.id.imgLike1After);
        TextView text1 = root.findViewById(R.id.txtLike);
        TextView text2 = root.findViewById(R.id.txtLikeAfter);
        TextView text3 = root.findViewById(R.id.txtLike1);
        TextView text4 = root.findViewById(R.id.txtLike1After);

        LinearLayout like = root.findViewById(R.id.like);

        LinearLayout like1 = root.findViewById(R.id.like1);

        like.setOnClickListener(view -> {
            if (smile.getVisibility() == View.VISIBLE) {
                smile.setVisibility(View.GONE);
                text1.setVisibility(View.GONE);
                smile1.setVisibility(View.VISIBLE);
                text2.setVisibility(View.VISIBLE);
            } else if (smile1.getVisibility() == View.VISIBLE) {
                smile.setVisibility(View.VISIBLE);
                text1.setVisibility(View.VISIBLE);
                smile1.setVisibility(View.GONE);
                text2.setVisibility(View.GONE);
            }
        });

        like1.setOnClickListener(view -> {
            if (smile2.getVisibility() == View.VISIBLE) {
                smile2.setVisibility(View.GONE);
                text3.setVisibility(View.GONE);
                smile3.setVisibility(View.VISIBLE);
                text4.setVisibility(View.VISIBLE);
            } else if (smile3.getVisibility() == View.VISIBLE) {
                smile2.setVisibility(View.VISIBLE);
                text3.setVisibility(View.VISIBLE);
                smile3.setVisibility(View.GONE);
                text4.setVisibility(View.GONE);
            }
        });

        //        final TextView textView = binding.textHome;
//        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}