package my.groupid.myplugin;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.NamedTextColor;
import net.kyori.adventure.text.logger.slf4j.ComponentLogger;
import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

    @Override
    public void onLoad() {
        // This method is called before the onEnable is. You will have to declare this in the plugin.yml (build.gradle.kts -> bukkit) to work.
    }

    @Override
    public void onEnable() {
        // Server starting or reloaded successfully
        ComponentLogger.logger().info(Component.text("Hello from Paper!").color(NamedTextColor.BLUE));
    }

    @Override
    public void onDisable() {
        // Server stopping, reloading or disabling the plugin
    }
}
