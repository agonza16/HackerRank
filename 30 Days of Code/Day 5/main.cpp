#include <iostream>
using namespace std;


int main(){
    int n;
    cin >> n;
    for (int count=1; count <= 10; count++)
    {
        cout<< n << " x "<< count <<" = "<<n*count<<endl;
    }
    return 0;
}