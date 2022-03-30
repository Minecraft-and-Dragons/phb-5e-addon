package com.github.mcd.addon.phbfivee.language;

import com.github.mcd.addon.phbfivee.PHBFiveEAddon;
import com.github.mcd.core.model.language.Language;
import net.minestom.server.utils.NamespaceID;

public class CelestialLanguage extends Language {

    public CelestialLanguage() {
        super(NamespaceID.from(PHBFiveEAddon.NAMESPACE, "celestial"), "Celestial");
    }
}
