package ca.ualberta.cs.lonelytwitter;


import java.util.Date;

public class ImportantTweet extends Tweet {


    @Override
    public Boolean isImportant() {
        return true;
    }
}
