package com.jalafoundation.dev34level1.model;

public class BlockSolid extends BlockGraph {

  public BlockSolid(String type) {
    super(type);
  }

  @Override
  public void draw(Position position) {
    System.out.println("-------");
    System.out.printf("-%s-\n", subType);
    System.out.println("-------");
    System.out.printf("(%d,%d)\n\n", position.x, position.y);
  }
}
