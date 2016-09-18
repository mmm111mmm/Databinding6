package com.newfivefour.databinding;

public class Presenter {

  private final ViewObject viewObject;

  public Presenter(ViewObject viewObject) {
    this.viewObject = viewObject;
  }

  public void onSubmit() {
    String text = viewObject.getName() + " and " + viewObject.getFavouriteBand() + " submitted!!";
    viewObject.setStatus(text);
  }
}
