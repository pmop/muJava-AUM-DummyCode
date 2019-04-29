import java.util.*;

public class Example {
	public Example () {
	}
         /*
            ROR E-Rule 17
            term = for (int v1 := 0; v1 op1 vArray.length; v1++){ ... }
            transformations = {
              ROR(op1) = op2
            }
            constraints = {
               op1 ∈ {<} and op2 ∈ {!=} or op1 ∈ {!=} and op2 ∈ {<},
               There is no definition of v1 within the for body
            }
         */
	public void erule17dummy() {
		ArrayList<Integer> dummyArray = new ArrayList<Integer>();
		dummyArray.add(1);
		dummyArray.add(2);
		dummyArray.add(3);
		for (int v1 = 0; v1 < dummyArray.size(); v1++){
			int a = 1;	
			v1 *= a;
		}
	}

	public void erule17dummy0() {
		ArrayList<Integer> dummyArray = new ArrayList<Integer>();
		dummyArray.add(1);
		dummyArray.add(2);
		dummyArray.add(3);
		for (int v1 = 0; v1 != dummyArray.size(); v1++){
			int a = 1;	
			v1 *= a;
		}
	}
}
