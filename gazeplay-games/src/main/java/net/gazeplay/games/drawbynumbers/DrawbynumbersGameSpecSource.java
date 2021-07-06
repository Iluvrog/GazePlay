package net.gazeplay.games.drawbynumbers;

import net.gazeplay.GameCategories;
import net.gazeplay.GameSpec;
import net.gazeplay.GameSpecSource;
import net.gazeplay.GameSummary;
import net.gazeplay.games.ninja.NinjaGameLauncher;
import net.gazeplay.games.ninja.NinjaGameVariantGenerator;

public class DrawbynumbersGameSpecSource implements GameSpecSource {
    @Override
    public GameSpec getGameSpec() {
        return new GameSpec(
            GameSummary
                .builder()
                .nameCode("Drawbynumbers")
                .gameThumbnail("data/Thumbnails/ninja.png")
                .category(GameCategories.Category.SELECTION)
                .absolutePriority(1)
                .build(),
            new DrawbynumbersGameVariantGenerator(), new DrawbynumbersGameLauncher());
    }
}
