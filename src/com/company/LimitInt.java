package com.company;

/**
 * Created by student1 on 21.11.16.
 */
public class LimitInt extends Intellect {
    private int limit;

    @Override
    public Command decide(int score){
        if (score<limit)
          return Command.HIT;
        else
            return Command.STAND;
    }
}
