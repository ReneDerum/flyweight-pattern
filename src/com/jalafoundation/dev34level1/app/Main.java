package com.jalafoundation.dev34level1.app;

import com.jalafoundation.dev34level1.model.BlockGraph;
import com.jalafoundation.dev34level1.model.FlyweightFactory;
import com.jalafoundation.dev34level1.model.BlockType;
import com.jalafoundation.dev34level1.model.Position;

public class Main {

  public static void main(String[] args) {

    String[] solidBlocks = {"SAND.", "BRICK"};
    String[] fluidBlocks = {"WATER", "LAVA."};
    String[] plantBlocks = {"GRASS", "CORAL"};

    System.out.println("*********************************");
    System.out.println("             MINECRAFT");
    System.out.println("*********************************");
    drawBlocks(BlockType.SOLID, solidBlocks,7);
    drawBlocks(BlockType.FLUID, fluidBlocks,7);
    drawBlocks(BlockType.PLANT, plantBlocks,7);
  }

  public static void drawBlocks(BlockType blockType, String[] subType, int number){
    for (int i = 0; i < number; i++) {
      BlockGraph block = FlyweightFactory.getBlock(blockType, subType[getRandomIndex()]);
      block.draw(getRandomPosition());

    }
  }

  public static Position getRandomPosition() {
    int x = (int) (Math.random() * 10);
    int y = (int) (Math.random() * 7);
    return new Position(x, y);
  }

  public static int getRandomIndex() {
    int index = (int) (Math.random() * 2);
    return index;
  }
}
