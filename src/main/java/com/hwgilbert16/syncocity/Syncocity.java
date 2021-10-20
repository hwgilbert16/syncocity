package com.hwgilbert16.syncocity;

import org.bukkit.plugin.java.JavaPlugin;

public class Syncocity extends JavaPlugin {
    // Reference to main class
    public static Syncocity plugin;

    @Override
    public void onEnable() {
        plugin = this;
    }

    @Override
    public void onDisable() {
        plugin = null;
    }

    public static Syncocity get() {
        return plugin;
    }
}
