/*
2. Find the error in the following code and explain in few lines why it is wrong. (Score 1) 
*/

class Clock { // ERR: no public class in a java file

	String time; // since get/set function is defined, marking this property as `private` is recommended.
	
	void getTime(){
	// if use "void", which means there isn't any return value. Science "get" function used here, so need to remove "void" here,
	// and add return type here. So this code should be correct to -> String getTime(){
    // Also, adding scope of this function is recommended.
		return time;
	}
    void setTime(String t){
    		time = t ;
    	// here we want to give value to the parameter of constructor  <-- here we want to give value to the property of object.
    	// so here it should be changed to "this.t = time;"   <--- "this.time = t;" is correct.
        // Also, adding scope of this function is recommended.
    }
	
}
