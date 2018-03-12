#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
#include <map>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int number;
    cin >> number;
    cin.ignore();
    map <string, string> phoneBook;
    for (int i = 0; i < number; i++) 
    {
        string name;
        string num;
        cin >> name;
        cin >> num;
        phoneBook.insert(pair<string, string>(name,num));
    }
    string input;
    while(cin >> input) 
    {
        if (phoneBook.find(input) != phoneBook.end()) 
        {
            cout << input << "=" << phoneBook.find(input)->second << endl;
        } 
        else 
        {
            cout << "Not found" << endl;
        } 
    }
    return 0;
}