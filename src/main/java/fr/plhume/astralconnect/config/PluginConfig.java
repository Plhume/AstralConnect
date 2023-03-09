package fr.plhume.astralconnect.config;

import fr.plhume.astralconnect.AstralConnect;
import net.md_5.bungee.config.Configuration;
import net.md_5.bungee.config.ConfigurationProvider;
import net.md_5.bungee.config.YamlConfiguration;

import java.io.File;
import java.io.IOException;

public class PluginConfig {

    private static File file;
    private static Configuration config;

    public static void createConfig() throws IOException {
        if (!AstralConnect.getInstance().getDataFolder().exists()) {
            AstralConnect.getInstance().getDataFolder().mkdir();
        }

        file = new File(AstralConnect.getInstance().getDataFolder(), "config.yml");

        try {
            if (!file.exists()) {
                file.createNewFile();
            }

            config = ConfigurationProvider.getProvider(YamlConfiguration.class).load(file);

            config.set("prefix", "&7[&3Astral&7] &r");
            ConfigurationProvider.getProvider(YamlConfiguration.class).save(config, file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Configuration getConfig() {
        return config;
    }
}
