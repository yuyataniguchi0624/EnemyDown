package plugin.enemyDown;

import java.net.http.WebSocket;
import java.net.http.WebSocket.Listener;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import plugin.enemyDown.command.EnemyDownCommand;

public final class Main extends JavaPlugin {

  @Override
  public void onEnable() {
    EnemyDownCommand enemyDownCommand = new EnemyDownCommand(this);
    Bukkit.getPluginManager().registerEvents(enemyDownCommand, this);
    getCommand( "enemyDown").setExecutor(enemyDownCommand);
  }
}
