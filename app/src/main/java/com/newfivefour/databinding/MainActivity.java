package com.newfivefour.databinding;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.newfivefour.databinding.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

  private ViewObject viewObject = new ViewObject("David 6", "Stone Roses", "Not submitted");
  private Presenter presenter = new Presenter(viewObject);

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
    binding.setData(viewObject);
    binding.setPresenter(presenter);
  }

}
