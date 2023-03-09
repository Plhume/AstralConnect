package fr.plhume.astralconnect;

import org.bukkit.plugin.java.JavaPlugin;

public final class AstralConnect extends JavaPlugin {

    @Override
    public void onEnable() {
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
