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
