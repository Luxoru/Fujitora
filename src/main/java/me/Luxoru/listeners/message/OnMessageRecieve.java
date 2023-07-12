package me.Luxoru.listeners.message;

import lombok.NonNull;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.EventListener;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

public class OnMessageRecieve extends ListenerAdapter {

    @Override
    public void onMessageReceived(@NonNull MessageReceivedEvent event) {
        if(event.getAuthor().isBot())return;

    }
}
