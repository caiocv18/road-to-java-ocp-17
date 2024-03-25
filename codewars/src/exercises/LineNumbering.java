package exercises;
/*

Your team is writing a fancy new text editor and you've been tasked with implementing the line numbering.

Write a function which takes a list of strings and returns each line prepended by the correct number.

The numbering starts at 1. The format is n: string. Notice the colon and space in between.

Examples: (Input --> Output)

[] --> []
["a", "b", "c"] --> ["1: a", "2: b", "3: c"]

*/

import java.util.*;
import java.util.stream.*;

public class LineNumbering {
    public static List<String> number(List<String> lines) {
		List<String> linesWithNumber = new ArrayList<String>();
		int i = 1;
		for(String line : lines){
			linesWithNumber.add(i + ": " + line);
			i++;
		}
        return linesWithNumber;
    }
	
	public static List<String> numberBestSolution(List<String> lines) {
        return IntStream.range(0, lines.size())
                .mapToObj(i -> String.format("%d: %s", i + 1, lines.get(i)))
                .collect(Collectors.toList());
    }
	
	public static void main(String... args){
		List<String> lines = Arrays.asList("a", "b", "c");
		List<String> newLines = LineNumbering.number(lines);
		for(String line : newLines){
			System.out.println(line);
		}
		
		List<String> newLinesBestSolution = LineNumbering.numberBestSolution(lines);
		for(String line : newLinesBestSolution){
			System.out.println(line);
		}
	}
}