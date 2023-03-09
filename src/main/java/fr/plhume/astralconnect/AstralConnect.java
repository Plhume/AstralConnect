package fr.plhume.astralconnect;

import org.bukkit.ChatColor;
import net.md_5.bungee.api.plugin.Plugin;

import java.util.Objects;

public final class AstralConnect extends Plugin {

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

    public String getPrefix() {
        return ChatColor.translateAlternateColorCodes('&', Objects.requireNonNull(getConfig().getString("prefix")));
    }
}
