package com.jalafoundation.dev34level1.model;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {

  static Map<String, BlockGraph> poolBlocks = new HashMap<>();

  public static BlockGraph getBlock(BlockType blockType, String subType){
    BlockGraph block;
    if(poolBlocks.containsKey(subType)){
      block = poolBlocks.get(subType);
    }else {
      switch (blockType){
        case SOLID:
          System.out.println("Created SOLID block: "+ subType);
          block = new BlockSolid(subType);
          break;
        case FLUID:
          System.out.println("Created FLUID block: "+ subType);
          block = new BlockFluid(subType);
          break;
        case PLANT:
          System.out.println("Created PLANT block: "+ subType);
          block = new BlockPlant(subType);
          break;
        default:
          block = null;
      }
      poolBlocks.put(subType, block);
    }
    return block;
  }

}
