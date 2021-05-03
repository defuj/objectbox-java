package io.objectbox.tree;

import io.objectbox.annotation.apihint.Internal;

import javax.annotation.Nullable;

public class Leaf {

    private final LeafNode node;

    public Leaf(LeafNode node) {
        this.node = node;
    }

    // FIXME Remove for final API once it is clear how to get value type.
    /**
     * For testing purposes only.
     */
    @Internal
    public LeafNode getNode() {
        return node;
    }

    public boolean isInt() {
        throw new UnsupportedOperationException();
    }

    public boolean isDouble() {
        throw new UnsupportedOperationException();
    }

    public boolean isString() {
        throw new UnsupportedOperationException();
    }

    public boolean isStringArray() {
        throw new UnsupportedOperationException();
    }

    // valueInt
    @Nullable
    public Long asInt() {
        throw new UnsupportedOperationException();
    }

    // valueDouble
    @Nullable
    public Double asDouble() {
        throw new UnsupportedOperationException();
    }

    // valueString
    @Nullable
    public String asString() {
        throw new UnsupportedOperationException();
    }

    // valueStrings
    @Nullable
    public String[] asStringArray() {
        throw new UnsupportedOperationException();
    }

    public void setInt(@Nullable Long value) {
        throw new UnsupportedOperationException();
    }

    public void setDouble(@Nullable Double value) {
        throw new UnsupportedOperationException();
    }

    public void setString(@Nullable String value) {
        throw new UnsupportedOperationException();
    }

    public void setStringArray(@Nullable String[] value) {
        throw new UnsupportedOperationException();
    }

}
