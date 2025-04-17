package Ryo;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ItemSpawnEvent;
import org.bukkit.event.player.PlayerDropItemEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class Ryo extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        // 注册事件监听器
        getServer().getPluginManager().registerEvents(this, this);
        getLogger().info("禁止丢弃物品插件已启用");
        getLogger().info("作者：Ryo");
        getLogger().info("QQ: 125512156");
    }

    @Override
    public void onDisable() {
        getLogger().info("禁止丢弃物品插件已禁用");
        getLogger().info("作者：Ryo");
        getLogger().info("QQ: 125512156");
    }

    // 监听玩家丢弃物品事件
    @EventHandler
    public void onPlayerDropItem(PlayerDropItemEvent event) {
        // 取消丢弃物品的行为
        event.setCancelled(true);
    }

    // 监听所有掉落物生成事件（包括怪物掉落物）
    @EventHandler
    public void onItemSpawn(ItemSpawnEvent event) {
        // 取消任何掉落物的生成
        event.setCancelled(true);
    }
}
