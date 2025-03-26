//����17451 (Silver3/�׸���,����)
#include <iostream>
#include <vector>

using namespace std;

int main() {
    int n;   //�༺ ���� �Է� ����
    cin >> n;

    //�ּ� �ӵ��� ���� 
    vector<long long> v(n);
    for (int i = 0; i < n; i++) {
        cin >> v[i];
    }

    //������ �༺���� �䱸�ϴ� �ӵ��� v[n-1]
    long long speed = v[n - 1];
    for (int i = n - 2; i >= 0; i--) {
        if (speed % v[i] != 0) {
            speed = ((speed / v[i]) + 1) * v[i];
        }
    }

    cout << speed << endl;
    return 0;
}