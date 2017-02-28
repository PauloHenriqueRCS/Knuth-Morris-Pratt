package Teste;

import Files.kmp;

public class kmp_teste {

	public static void main(String[] args) {
		String pat = "JKLM";
		String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		kmp kmp = new kmp(pat);
		System.out.println("text:    " + txt);
		int offset = kmp.search(txt);
		System.out.print("pattern: ");
		for (int i = 0; i < offset; i++)
			System.out.print(" ");
		System.out.println(pat);
	}
	
}
