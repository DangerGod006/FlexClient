package dev.lvstrng.argon.module.setting;

import java.lang.Enum;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/setting/ModeSetting.class */
public final class ModeSetting<T extends Enum<T>> extends Setting<ModeSetting<T>> {
    public int index;
    private final List<T> possibleValues;
    private final int originalValue;

    public ModeSetting(CharSequence name, T defaultValue, Class<T> type) {
        super(name);
        T[] values = type.getEnumConstants();
        this.possibleValues = Arrays.asList(values);
        this.index = this.possibleValues.indexOf(defaultValue);
        this.originalValue = this.index;
    }

    public T getMode() {
        return this.possibleValues.get(this.index);
    }

    public void setMode(T mode) {
        this.index = this.possibleValues.indexOf(mode);
    }

    public void setModeIndex(int mode) {
        this.index = mode;
    }

    public int getModeIndex() {
        return this.index;
    }

    public int getOriginalValue() {
        return this.originalValue;
    }

    public void cycle() {
        if (this.index < this.possibleValues.size() - 1) {
            this.index++;
        } else {
            this.index = 0;
        }
    }

    public boolean isMode(T mode) {
        return this.index == this.possibleValues.indexOf(mode);
    }
}
