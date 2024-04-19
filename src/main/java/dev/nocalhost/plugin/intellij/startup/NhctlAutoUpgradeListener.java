package dev.nocalhost.plugin.intellij.startup;

import com.intellij.ide.ApplicationInitializedListener;

import dev.nocalhost.plugin.intellij.service.NocalhostBinService;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.CoroutineScope;

public class NhctlAutoUpgradeListener implements ApplicationInitializedListener {
    @Override
    public void componentsInitialized() {
        NocalhostBinService nocalhostBinService = new NocalhostBinService();
        nocalhostBinService.checkBin();
        nocalhostBinService.checkVersion();
    }

    @Override
    public Object execute(CoroutineScope asyncScope, Continuation<? super Unit> complete) {
        return "";
    }
}
