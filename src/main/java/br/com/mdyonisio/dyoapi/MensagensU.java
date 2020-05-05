package br.com.mdyonisio.dyoapi;

import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public class MensagensU {

    public void EnviarMensagemPlayer(Player player, String... mensagens)
    {
        for (final String msg : mensagens) player.sendMessage(Cor(msg));
    }

    public String Cor(String msg)
    {
        return ChatColor.translateAlternateColorCodes('&', msg);
    }
}
