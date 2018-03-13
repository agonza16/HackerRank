public class Solution {
    // Write your code here.
    Stack<Character> stack = new Stack<Character>();
    Queue<Character> queue = new LinkedList<Character>();
    
    void pushCharacter(char character)
    {
        stack.push(character);
    }
    void enqueueCharacter(char character)
    {
        queue.add(character);
    }
    
    char popCharacter()
    { 
        return stack.pop();
    }
    
    char dequeueCharacter()
    {
        return queue.remove();
    }