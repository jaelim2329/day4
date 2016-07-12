package com.casinomachine;

import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ThreadLocalRandom;

public class Application {

	public enum MachineStates {
		BAR, MEDAL, COIN, TRIPLEBAR, CHERRY, JACKPOT;
	}

	public static void main(String[] args) {
		ThreadLocalRandom tlr = ThreadLocalRandom.current();
		
		Iterator<Integer> iter = tlr.ints(0, 6).iterator();
		int count = 0;
		StringBuilder sb = new StringBuilder();
		String[] results = new String[3];
		while(iter.hasNext() && count < 9){
			sb.append(MachineStates.values()[iter.next()]);
			count ++;
			if(!(count % 3 == 0)){
				sb.append(" : ");
			}
			if (count % 3 == 0){
				results[count/3 - 1] = sb.toString();
				sb = new StringBuilder();
			}
		}
		
		System.out.println(Arrays.toString(results));

	}

}
