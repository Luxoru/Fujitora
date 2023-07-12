package me.Luxoru.listeners.state;

import me.Luxoru.commands.BaseCommand;
import me.Luxoru.commands.admin.SayCommand;
import me.Luxoru.listeners.message.OnMessageRecieve;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.events.GenericEvent;
import net.dv8tion.jda.api.events.session.ReadyEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.CommandData;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import net.dv8tion.jda.internal.interactions.CommandDataImpl;
import org.jetbrains.annotations.NotNull;

public class OnReadyListener implements EventListener {

    private static JDA jda;

    public static void main(String[] args) throws InterruptedException {
        jda = JDABuilder.createDefault("MTEyMzI1OTYxMTA4MDgyMjk0NQ.GolOvT.RcCAnOMkfZaqJwHh1c7FZ88C-2kzvsNlen5sYM")
                .addEventListeners(new OnReadyListener(), new OnMessageRecieve(), new BaseCommand())
                .build();
        jda.awaitReady();
        jda.updateCommands().addCommands(Commands.slash("say", "Your command description").addOption(OptionType.STRING, "content", "des", true)).queue();
    }


    @Override
    public void onEvent(GenericEvent event) {
        if(event instanceof ReadyEvent){
            System.out.println("Logged in as "+jda.getSelfUser().getName());
        }
    }
    private static void registerGlobalCommand(@NotNull Guild guild) {
        guild.upsertCommand("say", "Your command description").addOption(OptionType.STRING, "content", "des", true).queue();
    }
}
