package me.Luxoru.commands;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.requests.restaction.CommandCreateAction;

import java.util.List;


@EqualsAndHashCode(callSuper = true)
public class BaseCommand extends ListenerAdapter {

    protected String name;
    protected String description;
    protected List<CommandCreateAction> options;

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        if(event.getName().equals(name)){
            execute(event);
        }
    }

    protected void execute(SlashCommandInteractionEvent event){

    }

}
