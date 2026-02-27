package me.ltshadowtm.SpearMaceNerfer;

import me.ltshadowtm.SpearMaceNerfer.event.EntityDeath;
import org.bukkit.plugin.java.JavaPlugin;

public final class SpearMaceNerfer extends JavaPlugin {

    public static SpearMaceNerfer getPlugin() {
        return getPlugin(SpearMaceNerfer.class);
    }

    @Override
    public void onEnable() {
        getLogger().info("-----------------------------------------------------------------------------------------");
        getLogger().info("||                                                                                     ||");
        getLogger().info("||                                  Spear Mace                                         ||");
        getLogger().info("||                                    Nerfer                                           ||");
        getLogger().info("||                                                                                     || ");
        getLogger().info("-----------------------------------------------------------------------------------------");
        getLogger().info("[SpearMaceNerfer] Enabled!");
        getServer().getPluginManager().registerEvents(new EntityDeath(), this);

    }

    @Override
    public void onDisable() {
        getLogger().info("[SpearMaceNerfer] Disabled!");
    }
}
