package com.dabomstew.pkrandom.pokemon;

import java.util.ArrayList;
import java.util.List;

public class CompMoveset {
    // Will include items & maybe abilities
    private final List<List<String>> movesets;

    public CompMoveset() {
        this.movesets = new ArrayList<>();
    }

    public CompMoveset(List<List<String>> moves) {
        this.movesets = moves;
    }

    public List<List<String>> getMoves() {
        return movesets;
    }

    public void newMoveset() {
        movesets.add(new ArrayList<>());
    }

    public void appendMove(String move) {
        movesets.get(movesets.size() - 1).add(move);
    }

    public boolean isEmpty() {
        return movesets.isEmpty();
    }
}

