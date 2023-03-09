package fr.plhume.astralconnect;

import org.bukkit.plugin.java.JavaPlugin;

public final class AstralConnect extends JavaPlugin {

    private static AstralConnect instance;

    public static AstralConnect getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();

        getLogger().info("============================");
        getLogger().info("= AstralConnect | Enabling =");
        getLogger().info("=   Loading version: " + getDescription().getVersion() + "   =");
        getLogger().info("============================");
    }

    @Override
    public void onDisable() {
        getLogger().info("=============================");
        getLogger().info("= AstralConnect | Disabling =");
        getLogger().info("=============================");
    }
}
