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
                Tile.TileType tileType = Tile.TileType.values()[rand.nextInt(Tile.TileType.values().length)];
                Tile.RegionType regionType = Tile.RegionType.values()[rand.nextInt(Tile.RegionType.values().length)];

                if (tileType.id == Tile.TileType.EAGLE.id) {
                    tileType = Tile.TileType.BRICKS;
                }
                if (tileType.id == Tile.TileType.EAGLE_WALL.id) {
                    tileType = Tile.TileType.BRICKS;
                }


                if ((i >= 10 && i <= 12) && (j >= 10 && j <= 12)) {
                    tileType = Tile.TileType.EAGLE_WALL;
                    regionType = Tile.RegionType.FULL;
                }

                if (i == 11 && j == 11) {
                    tileType = Tile.TileType.EAGLE;
                }

                if ((i >= 10 && i <= 12) && (j >= 20 && j <= 22)) {
                    tileType = Tile.TileType.EAGLE_WALL;
                    regionType = Tile.RegionType.FULL;
                }

                if (i == 11 && j == 21) {
                    tileType = Tile.TileType.EAGLE;
                }

                if (tileType.id == Tile.TileType.WATER.id) {
                    regionType = Tile.RegionType.FULL;
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
        int[] array = new int[100];
        Random r = new Random();
        for (int i = 0; i < 100; i++) {
            array[i] = r.nextInt() % 5;
        }
        return array;
    }
}
