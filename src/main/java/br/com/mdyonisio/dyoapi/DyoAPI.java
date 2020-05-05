package br.com.mdyonisio.dyoapi;

import org.bukkit.plugin.java.JavaPlugin;

public final class DyoAPI extends JavaPlugin {

    public MensagensU mensagensU;

    @Override
    public void onEnable() {
        mensagensU = new MensagensU();
    }
}
