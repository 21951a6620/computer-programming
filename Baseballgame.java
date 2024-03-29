class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        int result=0;
        for(String i : operations){
            switch(i){
                case "+" -> {
                    int res = stack.get(stack.size()-2) + stack.peek();
                    stack.add(res);
                    result += res;
                }
                case "C" -> {
                   result -= stack.pop();
                
                }
                case "D" ->{
                    int res = stack.peek() * 2;
                    stack.add(res);
                    result+=res;
                }
                default -> {
                    int res = Integer.parseInt(i);
                    stack.add(res);
                    result+=res;
                }
            }
        }
        return result;
    }
}
