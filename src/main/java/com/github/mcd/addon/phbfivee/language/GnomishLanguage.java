package com.github.mcd.addon.phbfivee.language;

import com.github.mcd.addon.phbfivee.PHBFiveEAddon;
import com.github.mcd.core.model.language.Language;
import net.minestom.server.utils.NamespaceID;

public class GnomishLanguage extends Language {

    public GnomishLanguage() {
        super(NamespaceID.from(PHBFiveEAddon.NAMESPACE, "gnomish"), "Gnomish");
    }
}
