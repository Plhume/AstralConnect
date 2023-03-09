package fr.plhume.astralconnect;

import org.bukkit.ChatColor;
import fr.plhume.astralconnect.config.PluginConfig;
import net.md_5.bungee.api.plugin.Plugin;

import java.io.IOException;
import java.util.Objects;
import java.util.logging.Level;

public final class AstralConnect extends Plugin {

    private static AstralConnect instance;

    public static AstralConnect getInstance() {
        return instance;
    }

    @Override
    public void onEnable() {
        instance = this;
        saveDefaultConfig();
        try {
            PluginConfig.createConfig();
        } catch (IOException e) {
            getLogger().log(Level.SEVERE, "Error while creating config file", e);
        }

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
