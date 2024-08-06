class Solution {

    public boolean isValid(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        
        if(str.charAt(0)=='0') return false;

        String[] parts = str.split("\\.");
        if (parts.length != 4) {
            return false;
        }

        for (String part : parts) {
            if (part.isEmpty()) {
                return false;
            }
            
            try {
                int number = Integer.parseInt(part);
                if (number < 0 || number > 255) {
                    return false;
                }
            } catch (NumberFormatException e) {
                return false;
            }
        }
        return true;
    }
}