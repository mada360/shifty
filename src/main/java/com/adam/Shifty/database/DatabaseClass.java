package com.adam.Shifty.database;

import com.adam.Shifty.model.Message;
import com.adam.Shifty.model.Profile;
import lombok.Getter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by adam on 10/02/2017.
 */
@Getter
public class DatabaseClass {

    private static Map<Long, Message> messages = new HashMap<>();
    private static Map<String, Profile> profiles = new HashMap<>();

    public static Map<Long,Message> getMessages() {
        return messages;
    }

    public static Map<String,Profile> getProfiles() {
        return profiles;
    }


}
