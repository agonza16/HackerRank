#include <map>
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
#include <unordered_map>

using namespace std;

vector<int> array_left_rotation(vector<int> a, int n, int k) {
    // determines where the value for index zero of original vector will be in shifted vector
    int startPosition = n - k;
    //temp vector
    vector<int> shiftedArray(n);
    
    for (int count = 0; count < n; count++)
    {
        shiftedArray[startPosition] = a[count];
        
        //determines whether the startPosition varaible can be increased
        // or set back to zero in order to avoid going out of bounds
        if (startPosition  == n - 1)
        {
            startPosition = 0;
        }
        else {startPosition++;}
    }
    return shiftedArray;
}

int main(){
    int n;
    int k;
    cin >> n >> k;
    vector<int> a(n);
    for(int a_i = 0;a_i < n;a_i++){
        cin >> a[a_i];
    }
    vector<int> output = array_left_rotation(a, n, k);
    for(int i = 0; i < n;i++)
        cout << output[i] << " ";
    cout << endl;
    return 0;
}