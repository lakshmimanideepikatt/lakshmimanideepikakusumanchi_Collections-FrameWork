package com.Collections.Collections;
import java.util.*;

public class MyList {
		private Object myArr[];
		private int ind=0;
		public MyList() {
			myArr =new Object[10];
		}
		public Object get(int index) {
			if(index<ind) {
				return myArr[index];
			}
			else {
				throw new ArrayIndexOutOfBoundsException();
			}
		}
		public void add(Object obj) {
			if(myArr.length-ind<=5)
				resize();
			myArr[ind++]=obj;
		}
		public int size() {
			return ind;
		}
		private void resize() {
			myArr=Arrays.copyOf(myArr,myArr.length*2);
		}
		public String toString() {
			String s="[";
			for(int i=0;i<ind-1;i++) {
				s+=myArr[i]+",";
			}
			s+=myArr[ind-1]+"]";
			return s;
		}
		  public Object remove(int index){
		        if(index < ind){
		            Object obj = myArr[index];
		            myArr[index] = null;
		            int tmp = index;
		            while(tmp < ind){
		                myArr[tmp] = myArr[tmp+1];
		                myArr[tmp+1] = null;
		                tmp++;
		            }
		            ind--;
		            return obj;
		        } else {
		            throw new ArrayIndexOutOfBoundsException();
		        }
		         
		    }
}
