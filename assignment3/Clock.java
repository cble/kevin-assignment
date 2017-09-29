/*
2. Find the error in the following code and explain in few lines why it is wrong. (Score 1) 
*/

class Clock {

	String time;
	
	void getTime(){
	// if use "void", which means there isn't any return value. Science "get" function used here, so need to remove "void" here,
	// and add return type here. So this code should be correct to -> String getTime(){
		return time;
	}
    void setTime(String t){
    		time = t ;
    	// here we want to give value to the parameter of constructor
    	// so here it should be changed to "this.t = time;"
    }
	
}
