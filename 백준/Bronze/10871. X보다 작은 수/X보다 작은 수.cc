#include <iostream>
using namespace std;
int main(void){
    cin.tie(NULL);
    ios::sync_with_stdio(false);
    int n, x;
    cin >> n >> x;  
    int a[n];
    for(int i = 0; i<n; i++) {
        cin >> a[i];
        if(a[i] < x) {
            cout << a[i] << " ";
        }
    }
    return 0;
}