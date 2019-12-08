package javala;

class Problem13 {
    public int romanToInt(String s) {
        char[] chars = s.toCharArray(); // <-- KEY POINT!!!!1
        HashMap <Character, Integer> map = new HashMap <Character, Integer>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);

        int result = 0;
        for (int i = 0;i<chars.length-1;i++)
        {
            int num = map.get(chars[i]);
            int nextNum = map.get(chars[i+1]);

            result = (nextNum > num) ? (result - num) : (result + num);
        }

        result = result + map.get(chars[chars.length-1]);
        return result;
    }
}