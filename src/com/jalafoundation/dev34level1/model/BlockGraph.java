package com.jalafoundation.dev34level1.model;

public abstract class BlockGraph{

  protected final String subType;

  public BlockGraph(String subType) {
    this.subType = subType;
  }

  public abstract void draw(Position position);
}
