package dk.fido2603.proxywatch;

import net.md_5.bungee.api.plugin.Plugin;
import dk.fido2603.proxywatch.Commands.BanCommand;


public class ProxyWatch extends Plugin
{
    @Override
    public void onEnable() {
        getLogger().info("Yay! It loads!");


        getProxy().getPluginManager().registerCommand(this, new BanCommand());
    }
}