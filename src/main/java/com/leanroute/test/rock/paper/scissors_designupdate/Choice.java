/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leanroute.test.rock.paper.scissors_designupdate;

/**
 *
 * @author Isaac
 */

/**
 * It would be only one instance of the choices for the whole game. 
 * An Enum reflect better this design than instanciate classes
 * 
 * @param 
 * @return 
 * @throw
 */
enum Choice {

    ROCK, PAPER, SCISSORS;

    /**
     * Return a value depending of the combination of choices 
     * @param other, represents the another choice
     * @return boolean
     * @throw
     */
    boolean beats(Choice other) {
        throw new UnsupportedOperationException("Not implemented yet.");
    }

}
