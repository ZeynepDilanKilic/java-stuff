class URLify {
	
	static int counterChar(char[] str, int start, int end, int target) {
		int spaceCount = 0;
		for(int i = start; i < end; i++) {
			if(str[i] == target) {
				spaceCount++;
			}
		}
		return spaceCount;
	}	
	static char[] convertCharArray(String str) {
		char [] chr = str.toCharArray();
		return chr;
	}
	
	static char [] replaceSpaces(String str, String replaceStr, char target) {
		
		int strLength = str.length();
		int replaceStrLength = replaceStr.length();
		
		char [] strA = convertCharArray(str);
		char [] replaceStrA =  convertCharArray(replaceStr);
		
		int newArraySize, i = 0, j = 0;
		
		int count = counterChar(strA,0,strLength,' ');
		
		newArraySize =  strLength + (3*count);
		char [] newStr =  new char [newArraySize];
		
		while(true) {
			if(i >= strLength) {
				break;
			}else {
				if(strA[i] == target) {
					for(int k = 0; k < replaceStrLength; k++) {
						newStr[j+k] = replaceStrA[k];
					}
					j =  j + replaceStrLength;
					i ++;
				}else {
					newStr[j] = strA[i];
					i++;
					j++;
				}
			}
		}
		return newStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Mr Jhon Smith djsdas";
		
		String b = "%40";
		
		System.out.println(replaceSpaces(a,b, ' '));
	}
}