package com.example.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.scorekeeper.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    int score_team_a_value = 0;
    int fouls_team_a_value = 0;
    int corners_team_a_value = 0;
    int score_team_b_value = 0;
    int fouls_team_b_value = 0;
    int corners_team_b_value = 0;

    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        binding.scoreTeamABtn.setOnClickListener(view1 -> {
            score_team_a_value++;
            display(binding.scoreTeamAValueTxt, score_team_a_value);
        });

        binding.commitFoulTeamABtn.setOnClickListener(view12 -> {
            fouls_team_a_value++;
            display(binding.foulsTeamAValueTxt, fouls_team_a_value);
        });

        binding.awardCornerTeamABtn.setOnClickListener(view13 -> {
            corners_team_a_value++;
            display(binding.cornersTeamAValueTxt, corners_team_a_value);
        });

        binding.scoreTeamBBtn.setOnClickListener(view14 -> {
            score_team_b_value++;
            display(binding.scoreTeamBValueTxt, score_team_b_value);
        });

        binding.commitFoulTeamBBtn.setOnClickListener(view15 -> {
            fouls_team_b_value++;
            display(binding.foulsTeamBValueTxt, fouls_team_b_value);
        });

        binding.awardCornerTeamBBtn.setOnClickListener(view16 -> {
            corners_team_b_value++;
            display(binding.cornersTeamBValueTxt, corners_team_b_value);
        });

        binding.resetBtn.setOnClickListener(this::reset);
    }

    public void reset(View view) {
        score_team_a_value = 0;
        fouls_team_a_value = 0;
        corners_team_a_value = 0;
        score_team_b_value = 0;
        fouls_team_b_value = 0;
        corners_team_b_value = 0;

        display(binding.scoreTeamAValueTxt, score_team_a_value);
        display(binding.foulsTeamAValueTxt, fouls_team_a_value);
        display(binding.cornersTeamAValueTxt, corners_team_a_value);
        display(binding.scoreTeamBValueTxt, score_team_b_value);
        display(binding.foulsTeamBValueTxt, fouls_team_b_value);
        display(binding.cornersTeamBValueTxt, corners_team_b_value);
    }

    public void display(TextView textView, int value) {
        textView.setText(String.valueOf(value));
    }
}