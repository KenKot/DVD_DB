import java.io.*;

public class DVDCollection {

	// Data fields
	
	/** The current number of DVDs in the array */
	private int numdvds;
	
	/** The array to contain the DVDs */
	private DVD[] dvdArray;
	
	/** The name of the data file that contains dvd data */
	private String sourceName;
	
	/** Boolean flag to indicate whether the DVD collection was
	    modified since it was last saved. */
	private boolean modified;
	
	/**
	 *  Constructs an empty directory as an array
	 *  with an initial capacity of 7. When we try to
	 *  insert into a full array, we will double the size of
	 *  the array first.
	 */
	public DVDCollection() {
		numdvds = 0;
		dvdArray = new DVD[7];
	}
	
	public String toString() {
		// Return a string containing all the DVDs in the
		// order they are stored in the array along with
		// the values for numdvds and the length of the array.
		// See homework instructions for proper format.

		String mergedString = "numdvds = " + this.numdvds + "\n" +
							  "dvdArray.length = " + this.dvdArray.length + "\n";
		
		for (int i = 0; i < this.numdvds; ++i) {
			mergedString += "dvdArray[" + i + "] = " + dvdArray[i].toString();
		}
							  

		return mergedString;
	}

	public void addOrModifyDVD(String title, String rating, String runningTime) {
		// NOTE: Be careful. Running time is a string here
		// since the user might enter non-digits when prompted.
		// If the array is full and a new DVD needs to be added,
		// double the size of the array first.
		
		
		// first check if rating and runningTime are valid
		


		if (this.numdvds >= numdvds.length) {
			DVD[] newDVDArray = new DVD[dvdArray.length * 2];
			
			// Copy old array into new/bigger array		
			for (int i = 0; i < dvdArray.length; ++i) {
			// Deep Copy Version:
				// DVD copiedDVD = new DVD(dvdArray[i].getTitle(), dvdArray[i].getRating(), dvdArray[i].getRunningTime());
				// newDVDArray[i] = copiedDVD;
			
			// Shallow Copy Version:
				newDVDArray[i] = dvdArray[i];
			}
			
			dvdArray = newDVDArray;
		}

		DVD newDVD = new DVD(title, rating, runningTime);
		++numdvds;
		
//Version 1 - use CS301 shifts from end;
		
		if (numdvds == 0) {
			dvdArray.push(newDVD);
			return;
		}
		
		for (int i = numdvds; i >= 0; --i) {
			//first array element's title >= than new title, we insert
			if (title.compareTo(dvdArray[i].getTitle()) >= 0) { // Asks: Does 'title' come after alphabetically?
				dvdArray[i+1] = newDVD;
				return;
			}
			else {
				dvdArray[i+1] = dvdArray[i];
				
				//edge case if we make it to the beginning
				if (i == 0) {
					dvdArray[0] = newDVD;
					return;
				}
			}
				
		}
		
		
		//  dvdArray[0] = newDVD; <-- adding this here, i could remove it from else case, and the length==0 part too?
		
		
		
		
//VERSION 2:		
		
		// Insert alphabetically:
		// Cases:
	    // 1 - empty list, add as first item
	    // 2 - only 1 item in list, just compare to that 
	    // 3 - middle case, compare current and current + 1
	    // 4 - we reach last element in list so no current + 1, just compare
		
//		if (dvdArray.length == 0) {
//			dvdArray.push(newDVD);
//			return;
//		}
//		
//		if (dvdArray.length == 1) {
//			if (title.compareTo(dvdArray[0]) <= 0) {
//				dvdArray[1] = dvdArray[0];
//				dvdArray[0] = newDVD;
//			}
//			else {
//				dvdArray[1] = newDVD;
//			}
//			return;
//		}
		
		
		
//		for (int i = 0; i < numdvds; ++i) {
//			// New DVD's title comes before the current title in array, or is the same
//			if (title.compareTo(dvdArray[i]) <= 0) {
//				
//				
//			}
//				
//				// Shift array elements to the right
//				for (int j = i; j < dvdArray.length; ++j) {
//					
//				}
//			}
//		}
//		
//	
//		// add at end if new title doesn't come before any existing ones, or array is empty
//		dvdArray.push(newDVD);
		

	
	}
	
	public void removeDVD(String title) {
		







	}
	
	public String getDVDsByRating(String rating) {






		return null;	// STUB: Remove this line.

	}

	public int getTotalRunningTime() {







		return 0;	// STUB: Remove this line.

	}

	
	public void loadData(String filename) {






		
	}
	
	public void save() {







	}

	// Additional private helper methods go here:



	
}
