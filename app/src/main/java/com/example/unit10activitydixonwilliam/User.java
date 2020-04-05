package com.example.unit10activitydixonwilliam;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

/**
 * Created by vogella on 06.09.17.
 */
@Entity
public class User {

    @PrimaryKey
    public final int id;
    public String name;
    public int level;
    public long skillPoints;


    public User(int id, String name, long skillPoints) {
        this.id = id;
        this.name = name;
        this.skillPoints  = skillPoints;
        this.level = 0;
    }

}