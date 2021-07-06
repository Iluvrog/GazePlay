package net.gazeplay.games.drawbynumbers;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum DrawbynumbersGameVariant {
    BIBOULE("Biboule"),
    N("n");

    @Getter
    private final String label;
}
