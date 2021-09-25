package com.battlecity.main.levels;

import com.battlecity.main.entity.tiles.Tile;
import com.battlecity.main.global.Presets;

import java.util.Random;

/**
 *
 * @author Pablis
 */
public class Level01 extends BaseLevel
{

    @Override
    public String[][] getTileArray() {
        String[][] tiles = new String[Presets.MAX_TILE_VERTICAL][Presets.MAX_TILE_HORIZONTAL];

        Random rand = new Random(-1881547168);

        for (int i = 0; i < Presets.MAX_TILE_VERTICAL; i++) {
            for (int j = 0; j < Presets.MAX_TILE_HORIZONTAL; j++) {
                Tile.TileType tileType = Tile.TileType.values()[rand.nextInt(Tile.TileType.values().length -1)];
                Tile.RegionType regionType = Tile.RegionType.values()[rand.nextInt(Tile.RegionType.values().length -1)];

                if (tileType.id == Tile.TileType.EAGLE.id) {
                    tileType = Tile.TileType.BRICKS;
                }
                if (tileType.id == Tile.TileType.EAGLE_WALL.id) {
                    tileType = Tile.TileType.BRICKS;
                }


                if (i < 5 && j < 5) {
                    tileType = Tile.TileType.AIR;
                }

                if (i == 1 && j == 1) {
                    tileType = Tile.TileType.EAGLE;
                }

                tiles[i][j] = tileType.id + ":" + regionType.id;
            }
        }

        return tiles;
    }

    @Override
    public int getLevelID() {
        return 1;
    }

    @Override
    public int[] getLevelSpawnlistData() {
        int[] spawnList = new int[]{
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2,
                1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2
        };
        return spawnList;
    }

}
