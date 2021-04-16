package me.frogcorp.frogfacts;

import me.frogcorp.frogfacts.commands.frogfact;
import org.bukkit.plugin.java.JavaPlugin;

public final class Main extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        getServer().getPluginCommand("frogfact").setExecutor(new frogfact(this));
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
