class Solution {
    public int evalRPN(String[] tokens) {
        List<String> list = new ArrayList<>(Arrays.asList(tokens));

        while(list.size()>1){
            for (int i=0; i<list.size(); i++){
                String t = list.get(i);
                
                if(t.equals("+")||t.equals("-")||t.equals("*")||t.equals("/") ) {
                    int a = Integer.parseInt(list.get(i-2)); 
                     int b = Integer.parseInt(list.get(i-1));
                     int val = 0;

                     if (t.equals("+")) val = a+b;
                     else if (t.equals("-")) val = a-b;
                     else if (t.equals("*")) val = a*b;
                     else val = a/b;

                     list.set(i-2, String.valueOf(val));
                     list.remove(i);
                     list.remove(i-1);

                     break;

                }
            }
        }
        
        return Integer.parseInt(list.get(0));
    }
}