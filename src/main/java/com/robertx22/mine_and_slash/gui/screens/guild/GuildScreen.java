package com.robertx22.mine_and_slash.gui.screens.guild;

import com.robertx22.mine_and_slash.characters.reworked_gui.ToonList;
import com.robertx22.mine_and_slash.gui.bases.INamedScreen;
import com.robertx22.mine_and_slash.mmorpg.SlashRef;
import com.robertx22.mine_and_slash.uncommon.localization.Gui;
import com.robertx22.mine_and_slash.uncommon.localization.Words;
import net.minecraft.ChatFormatting;
import net.minecraft.client.gui.components.EditBox;
import net.minecraft.client.gui.screens.Screen;
import net.minecraft.resources.ResourceLocation;

public class GuildScreen extends Screen implements INamedScreen {
    private ToonList guilds;

    public GuildScreen(){
        super(Words.Guilds.locName().withStyle(ChatFormatting.GOLD, ChatFormatting.BOLD));
    }

    @Override
    protected void init() {
        this.clearWidgets();
//        this.guilds = new ToonList(this, this.minecraft, this.width, this.height, 48, this.height - 64, 36);
        this.addWidget(this.guilds);
    }

    @Override
    public void onClose() {
        super.onClose();
    }

    @Override
    public ResourceLocation iconLocation() {
        return SlashRef.guiId("main_hub/icons/guilds");
    }

    @Override
    public Words screenName() {
        return Words.Guilds;
    }
}
