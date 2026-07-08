package dev.lvstrng.argon.module.setting;

import dev.lvstrng.argon.module.setting.Setting;

/* JADX INFO: loaded from: FlexClient-fixed.jar:dev/lvstrng/argon/module/setting/Setting.class */
public abstract class Setting<T extends Setting<T>> {
    private CharSequence name;
    public CharSequence description;

    public Setting(CharSequence name) {
        this.name = name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public CharSequence getName() {
        return this.name;
    }

    public CharSequence getDescription() {
        return this.description;
    }

    public T setDescription(CharSequence desc) {
        this.description = desc;
        return this;
    }
}
