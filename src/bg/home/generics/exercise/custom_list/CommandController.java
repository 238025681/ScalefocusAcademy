/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bg.home.generics.exercise.custom_list;

/**
 *
 * @author Chobi
 */
public class CommandController<T> {

    private IList<T> customList;

    public CommandController(IList<T> list) {
        this.customList = list;
    }

    /*
    • Add <element> - Adds the given element to the end of the list
    • Remove <index> - Removes the element at the given index
    • Contains <element> - Prints if the list contains the given element (true or false)
    • Swap <index> <index> - Swaps the elements at the given indexes
    • Greater <element> - Counts the elements that are greater than the given element and prints their count
    • Max - Prints the maximum element in the list
    • Min - Prints the minimum element in the list
    • Print - Prints all elements in the list, each on a separate line

     */
    public void add(T element) {
        this.customList.add(element);
    }

    public void remove(int index) {

        this.customList.remove(index);
    }

    public boolean contains(T element) {

        return this.customList.contains(element);
    }

    public void swap(int index1, int index2) {

        this.customList.swap(index1, index2);

    }

    public int greater(T element) {
        return this.customList.countGreaterThan(element);
    }

    public T max() {

        return this.customList.getMax();
    }

    public T min() {

        return this.customList.getMin();
    }

    public void print() {

        StringBuilder allElements = new StringBuilder();
        for (T elements : this.customList.getElementsList()) {
            allElements.append(elements).append(System.lineSeparator());
        }
        allElements.trimToSize();
        System.out.print(allElements.toString());
    }

    public IList<T> getCustomList() {
        return customList;
    }
    
}
