package com.example.picanddrink2;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.picanddrink2.R;



public class HomeFragment extends Fragment {



    private Button topCocktailsBtn, cocktailsBtn, myCocktailsBtn, camerabtn, myBottlesbtn;

    String s1[];

    int images[] = {R.drawable.maragrita, R.drawable.martini, R.drawable.sangria, R.drawable.sexonthebeach};

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public HomeFragment() {
        // Required empty public constructor
    }

    //
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment HomeFragment.
//     */
    // TODO: Rename and change types and number of parameters
    public static HomeFragment newInstance(String param1, String param2) {
        HomeFragment fragment = new HomeFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    //
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);


        topCocktailsBtn = view.findViewById(R.id.topCocktailsBtn);
        cocktailsBtn = view.findViewById(R.id.cocktailsBtn);
        myCocktailsBtn = view.findViewById(R.id.myCocktailsBtn);
        camerabtn = view.findViewById(R.id.camerabtn);
        myBottlesbtn = view.findViewById(R.id.myBottlesbtn);


        topCocktailsBtn.setOnClickListener(new View.OnClickListener() {
            //Start new list activity
            @Override
            public void onClick(View v) {
                Intent mainIntent = new Intent(getActivity(), TopCocktailsFragment.class);
                startActivity(mainIntent);
            }
        });

//         כפתור לעבור לדף אחר
        ;

        cocktailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), CocktailsFragment.class);
                startActivity(intent);
            }
        });

        myCocktailsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), MyCocktailsFragment.class);
                startActivity(intent);
            }
        });

        camerabtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), CameraFragment.class);
                startActivity(intent);
            }
        });

        myBottlesbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity().getApplication(), MyBottlesFragment.class);
                startActivity(intent);
            }
        });

        return view;
        // return inflater.inflate(R.layout.fragment_home, container, false);
    }
}
















//    @Override
//    public void OnItemClick(int position) {
//
//        Intent intent = new Intent(getActivity().getApplication(), RecipeActivity.class);
//        switch (position) {
//            case 0:
//                intent.putExtra("name", "Beef");
//                break;
//            case 1:
//                intent.putExtra("name", "Chicken");
//                break;
//            case 2:
//                intent.putExtra("name", "Dairy");
//                break;
//            case 3:
//                intent.putExtra("name", "Pasta");
//                break;
//            case 4:
//                intent.putExtra("name", "Salad");
//                break;
//            case 5:
//                intent.putExtra("name", "Vegan");
//                break;
//            case 6:
//                intent.putExtra("name", "Dessert");
//                break;
//        }
//        startActivity(intent);
//    }


