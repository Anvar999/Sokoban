
public class Levels {

    /**
     * This class manages all levels in the game
     * Has level parser class instance
     */

    private LevelParser levelParser;

    /**
     * Levels object constructor which initates levelparser instance
     */

    public Levels() {
        levelParser = new LevelParser();
    }

    /**
     * This method manages levels
     *
     * @param level you want
     * @return desktop two-dimensional array
     */

    public int[][] startLevel(int level) {
        int[][] desktop = null;

        switch (level) {
            case 1:
                desktop = firstLevel();
                break;
            case 2:
                desktop = secondLevel();
                break;
            case 3:
                desktop = thirdLevel();
                break;
            case 4:
                desktop = levelParser.parse("levels/level4.sok");
                break;
            case 5:
                desktop = levelParser.parse("levels/level5.sok");
                break;
            case 6:
                desktop = levelParser.parse("levels/level6.sok");
                break;
            default:
                desktop = LevelsFromServer.getLevelFromServer(level);
                break;
        }
        return desktop;
    }

    /**
     * @return first level array
     */

    private int[][] firstLevel() {
        return new int[][]{
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 1, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 3, 4, 0, 0, 2},
                {2, 0, 0, 0, 3, 4, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
    }

    /**
     * @return second level array
     */

    private int[][] secondLevel() {
        return new int[][]{
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 2, 0, 0, 0, 2},
                {2, 1, 0, 0, 0, 2, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 2, 0, 4, 0, 2},
                {2, 0, 0, 0, 3, 0, 0, 0, 2, 2},
                {2, 0, 0, 0, 3, 0, 0, 0, 4, 2},
                {2, 0, 0, 0, 0, 2, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 2, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 2, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
    }

    /**
     * @return third level array
     */

    private int[][] thirdLevel() {
        return new int[][]{
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 3, 4, 2, 2, 0, 2},
                {2, 0, 0, 0, 3, 4, 0, 0, 0, 2},
                {2, 0, 0, 0, 3, 4, 0, 0, 0, 2},
                {2, 0, 0, 0, 3, 0, 4, 0, 0, 2},
                {2, 0, 0, 1, 0, 0, 0, 0, 0, 2},
                {2, 0, 0, 0, 0, 0, 0, 0, 0, 2},
                {2, 2, 2, 2, 2, 2, 2, 2, 2, 2}
        };
    }
}
