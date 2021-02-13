import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

public class employeeImportance {


    public int getImportance(List<Employee> employees, int id) {

        return getImportanceHelper(employees,id,0);
        //return bfsImportanceHelper(employees,id);

    }
    public int bfsImportanceHelper(List<Employee> employees,int id){
        int total = 0;
        Deque<Integer> deque = new ArrayDeque();
        deque.add(id);
        while(!deque.isEmpty()){
            int val = deque.poll();
            for(Employee employee:employees){
                if(val==employee.id){
                    total = total + employee.importance;



                    List<Integer> subordinate = employee.subordinates;
                    for(int sub:subordinate){
                        deque.add(sub);
                    }
                }
            }
        }
        return total;
    }

    public int getImportanceHelper(List<Employee> employees,int id,int total){

        for(int i = 0;i<employees.size();i++){

            if(employees.get(i).id==id){

                total = total + employees.get(i).importance;
                List<Integer> subordinate = employees.get(i).subordinates;

                if(subordinate.size()>0){

                    for(int j = 0;j<subordinate.size();j++){

                        total = getImportanceHelper(employees,subordinate.get(j),total);
                    }
                }
            }
        }
        return total;

    }
}
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};