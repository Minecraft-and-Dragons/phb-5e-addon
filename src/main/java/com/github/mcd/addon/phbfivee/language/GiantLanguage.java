package com.github.mcd.addon.phbfivee.language;

import com.github.mcd.addon.phbfivee.PHBFiveEAddon;
import com.github.mcd.core.model.language.Language;
import net.minestom.server.utils.NamespaceID;

public class GiantLanguage extends Language {

    public GiantLanguage() {
        super(NamespaceID.from(PHBFiveEAddon.NAMESPACE, "giant"), "Giant");
    }
}
