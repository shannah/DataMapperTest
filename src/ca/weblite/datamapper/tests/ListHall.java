/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.weblite.datamapper.tests;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author shannah
 */
public class ListHall {
    private List<Hall> Hall;

public void setHall(List<Hall> hall) {
    this.Hall = hall;
}

public List<Hall> getHall() {
    if (Hall == null) {
        this.Hall = new ArrayList<Hall>();
    }
    return Hall;
}
}
