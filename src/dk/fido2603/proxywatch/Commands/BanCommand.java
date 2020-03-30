package dk.fido2603.proxywatch.Commands;

import net.md_5.bungee.api.ChatColor;
import net.md_5.bungee.api.CommandSender;
import net.md_5.bungee.api.chat.TextComponent;
import net.md_5.bungee.api.plugin.Command;

public class BanCommand extends Command {
    public BanCommand() {
        super("ban", "proxywatch.ban");
    }

    @Override
    public void execute(CommandSender commandSender, String[] strings) {
        commandSender.sendMessage(new TextComponent(ChatColor.BLUE + "Woah, a ban!"));
    }
}
