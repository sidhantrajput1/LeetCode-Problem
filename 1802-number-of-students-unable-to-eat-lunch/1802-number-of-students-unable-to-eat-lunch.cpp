class Solution {
public:
    int countStudents(vector<int>& students, vector<int>& sandwiches) {
        // create a queue
        queue<int> q;
        int n = students.size();
        // student array elements push on queue 
        for(int i = 0 ; i < n; i++) {
            q.push(students[i]); // [1,1,1,0,0,1]
        }

        int i = 0; // traverse the sandwiches array
        int count = 0; // count the each step of between student and sandwiches
        while(q.size() > 0 && count != q.size()) { 
            if(q.front() == sandwiches[i]) {
                count = 0;
                q.pop();
                i++;
            } else {
                int x = q.front();
                q.pop();
                q.push(x);
                count++;
            }
        }
        return q.size();
    }
};