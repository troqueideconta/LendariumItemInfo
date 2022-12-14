package vaz.lucas.silva;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import vaz.lucas.silva.commands.ItemCommand;

public class Main extends JavaPlugin {



    @Override
    public void onEnable() {
        Bukkit.getConsoleSender().sendMessage("§aLendariumItemInfo iniciado com sucesso!");
        Bukkit.getConsoleSender().sendMessage("By: Vaaaaz");

        setupCommands();

    }

    @Override
    public void onDisable() {

    }

    public void setupCommands() {

        getCommand("iteminfo").setExecutor(new ItemCommand());


    }




}