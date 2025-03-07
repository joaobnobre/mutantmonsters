package fuzs.mutantmonsters.proxy;

import fuzs.mutantmonsters.world.entity.CreeperMinion;
import fuzs.puzzleslib.core.DistTypeExecutor;

public interface Proxy {
    @SuppressWarnings("Convert2MethodRef")
    Proxy INSTANCE = DistTypeExecutor.getForDistType(() -> () -> new ClientProxy(), () -> () -> new ServerProxy());

    void displayCreeperMinionTrackerGUI(CreeperMinion creeperMinion);

    void showDismountMessage();
}
