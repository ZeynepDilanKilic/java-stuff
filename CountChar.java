class CountChar {	
	public static void main(String[] args) {
		String a = "aaabbccccdddddaaaaeee";
		int count = 1;
		char[] ch =  a.toCharArray();
		for (int i = 0; i < a.length()-1; i++) {
			if(ch[i] == ch[i+1]) {
				count++;
				if(i == a.length()-2) {
					System.out.printf("%c%d",ch[i],count);
				}
			}else if(count != 1 && (ch[i] != ch[i+1])) {
				System.out.printf("%c%d",ch[i],count);
				count = 1;
			}
		}	
	}
}