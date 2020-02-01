/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.custom_list;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Chobi
 */
public class Sorter {

    public static void sort(IList customList) {
        Collections.sort(customList.getElementsList());
    }
}
