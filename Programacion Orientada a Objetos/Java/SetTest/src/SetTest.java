
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;
import java.util.SortedSet;
import java.util.TreeSet;

public class SetTest
{
	private static final String colors[] = { "red", "white", "blue",
               "green", "gray", "orange", "tan", "white", "cyan",
               "peach", "gray", "orange" };
	private Object sorted;
	// create and output ArrayList
	public SetTest()
	{
		List< String > list = Arrays.asList( colors );
		System.out.printf( "ArrayList: %s\n", list );
		printNonDuplicates( list );
		printSortedNonDuplicates(list);
		} // end SetTest constructor
	public void setSorted(Object sorted) {
		this.sorted = sorted;
		}
       public Object getSorted() {
    	   return sorted;
    	   }
       // create set from array to eliminate duplicates
       private void printNonDuplicates( Collection< String > collection )
       {
    	   // create a HashSet using a collection as parameter
    	   Set< String > set = new HashSet< String >( collection );
    	   System.out.println( "Nonduplicates are: " );
    	   for ( String s : set )
    		   System.out.printf( "%s ", s );
    	   System.out.println();
    	   } // end method printNonDuplicates
       private void printSortedNonDuplicates( Collection< String > collection )
       {
    	   // create a TreehSet using a collection as parameter
           Set< String > sorted = new TreeSet< String >( collection );           
           System.out.println( "Sorted set: " );
           for ( String s : sorted )
        	   System.out.printf( "%s ", s );
               System.out.println();
               } // end method printNonDuplicates
       public static void main( String args[] )
       {
    	   new SetTest();
    	   } // end main
}