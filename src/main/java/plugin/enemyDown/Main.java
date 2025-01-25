package plugin.enemyDown;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemyDown.command.EnemyDownCommand;
import plugin.enemyDown.command.EnemySpawnCommand;

public final class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    EnemyDownCommand enemyDownCommand = new EnemyDownCommand(this);
    Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
    getCommand( "enemyDown").setExecutor(enemyDownCommand);
    getCommand( "enemySpawn").setExecutor(new EnemySpawnCommand());
  }
}
