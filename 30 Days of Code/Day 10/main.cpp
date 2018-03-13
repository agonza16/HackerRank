#include <set>
#include <list>
#include <cmath>
#include <ctime>
#include <deque>
#include <queue>
#include <stack>
#include <string>
#include <bitset>
#include <cstdio>
#include <limits>
#include <vector>
#include <climits>
#include <cstring>
#include <cstdlib>
#include <fstream>
#include <numeric>
#include <sstream>
#include <iostream>
#include <algorithm>
#include <string>


using namespace std;

// returns the binary string representation of a number
string binary(int number)
{
    string binaryRepresentation;
    int num = 1;
    while(number > 0)
    {
        int remainder = number % 2;
        binaryRepresentation += ('0'+remainder);
        number = number/2;
    }  

    string returnString;
    
    // reverses the binaryRepresentation string
    for(int count = binaryRepresentation.length()-1; count >= 0; count--)
    {
    returnString += binaryRepresentation[count];
    }
    return returnString;
  
}

int main(){
    int n;
    cin >> n;
    
    string output = binary(n);
    int conseqOnes = 0;
    int max = 0;
    for(int count = 0; count < output.length(); count++)
    {
      if (output[count] == '1')
      {
        conseqOnes++;
        if (max < conseqOnes)
        {
            max = conseqOnes;
        }     
      }
      else
      {
         
        conseqOnes = 0;
      }
    }
    cout << max <<endl;
    return 0;
}