/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanroute.test.rock.paper.scissors_designupdate;

import java.util.List;

/**
 *
 * @author Isaac Durá
 *
 * A game of Rock-Paper-Scissors.
 */
final class Game {

    private final Player playerA;
    private final Player playerB;

    private final List<Outcome> outcomes;
    /*
    * Constructor for the Game class
    * @param playerA, initialization from type playerA
    * @param playerB, initialization from type playerB
    * @param outcomes, initialization from type List<Outcome>
    */

    public Game(Player playerA, Player playerB, List<Outcome> outcomes) {
        this.playerA = playerA;
        this.playerB = playerB;
        this.outcomes = outcomes;
    }

    /**
     * Play a round of Rock-Paper-Scissors. This Game's two Players will both
     * make a Choice, and the Choices will be used to determine an Outcome. The
     * Outcome will be added to this Game's list of outcomes.
     * 
     * @param 
     * @return 
     * @throws 
     */
   
    void playRound() {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    /**
     * An outcome of one round of Rock-Paper-Scissors.
     * 
     * @param 
     * @throw
     * @return
     */
    final class Outcome {

        private final Choice playerAChoice;
        private final Choice playerBChoice;

        
        /*
        * Contructor
        * @param playerAChoice, playerBChoice get initialized
        * @return 
        * @throw
        */
        public Outcome(Choice playerAChoice, Choice playerBChoice) {
            this.playerAChoice = playerAChoice;
            this.playerBChoice = playerBChoice;
        }
        /**
        * Determines when an outcome is a tie
        * @param 
        * @return boolean
        * @throw
        */
        boolean isTie() {
            throw new UnsupportedOperationException("Not implemented yet.");
        }

        /**
        * Determines when an outcome is a win 
        * @param 
        * @return Player
        * @throw
        */
        Player getWinner() {
            throw new UnsupportedOperationException("Not implemented yet.");
        }
       /**
        * Determines when an outcome is a lose
        * @param 
        * @return Player
        * @throw
        */
        Player getLoser() {
            throw new UnsupportedOperationException("Not implemented yet.");
        }
    }
}
