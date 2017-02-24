    static boolean isAnagram(String a, String b) {
        
        if(a.length() != b.length()) {
            return false;
        } else {
            char[] first = a.toLowerCase().toCharArray();
            char[] second = b.toLowerCase().toCharArray();
            
            Arrays.sort(first);
            Arrays.sort(second);
            
            for(int i = 0; i < first.length; i++) {
                if(first[i] != second[i]) {
                    return false;
                }
            }
            return true;
        }
    }
