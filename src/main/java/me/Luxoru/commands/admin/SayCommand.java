package me.Luxoru.commands.admin;

import me.Luxoru.commands.BaseCommand;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.requests.restaction.CommandCreateAction;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;

import java.util.ArrayList;
import java.util.List;

public class SayCommand extends BaseCommand {


    public SayCommand() {
        this.name = "say";
        this.options = null;
        this.description = "repeats after ye";
    }

    @Override
    protected void execute(SlashCommandInteractionEvent event) {
        event.getChannel().sendMessage("Test").queue();
    }


}
