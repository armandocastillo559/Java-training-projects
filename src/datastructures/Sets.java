package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {
		// LinkedHash - in order that they were entered
		// Hash Set - completely random order
		// Tree Set - rearranges to natural order (alphabetical)
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();

		// 2. Adding Elements
		animals.add("dog");
		animals.add("pig");
		animals.add("hog");
		animals.add("cat");
		animals.add("snake");

	
		System.out.println(animals.size() + " " + animals);
		
		animals.add("goose");
		animals.add("cat");
		animals.add("snake");
		
		System.out.println(animals.size() + " " + animals);
		
		// Create a new set that we can use for comparison
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("chicken");
		farmAnimals.add("cow");
		farmAnimals.add("pig");
		farmAnimals.add("horse");
		farmAnimals.add("dog");
		
		// What is the INTERSECTION between animals and farm animals (what exists in both only)
		// 1. Copy existing set into a new set
		Set<String> intersectionSet = new HashSet<String>(animals);
		// 2. Retain ONLY the elements that are also in the other set
		intersectionSet.retainAll(farmAnimals);
		System.out.println("\nThe Intersection is: " + intersectionSet);
		
		// What is the UNION (unique list of what in one or the other)
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The Union is: " + unionSet);
		
		// What is the DIFFERENCE (first minus the second)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("The Difference is " + differenceSet);
		
		System.out.println(animals.toString());
		
		
		
		
	}

}
