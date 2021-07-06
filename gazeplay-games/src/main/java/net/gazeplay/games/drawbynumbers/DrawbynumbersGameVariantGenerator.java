package net.gazeplay.games.drawbynumbers;

import net.gazeplay.commons.gamevariants.generators.EnumGameVariantGenerator;

public class DrawbynumbersGameVariantGenerator extends EnumGameVariantGenerator<DrawbynumbersGameVariant> {

    public DrawbynumbersGameVariantGenerator() {
        super(DrawbynumbersGameVariant.values(), DrawbynumbersGameVariant::getLabel);
    }
}
