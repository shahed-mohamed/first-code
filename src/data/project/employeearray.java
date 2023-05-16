/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.project;

/**
 *
 * @author mobi lap
 */
public class employeearray {
    private static final int MAXSIZE = 1000;
    private employee[] employee = new employee[MAXSIZE];
   private int current_size = 0;
   public void addemployee(employee emp)
   {
       if(current_size<MAXSIZE)
       {
           employee[current_size] = emp;
            current_size++;
       }
       else 
       {
           System.out.println("Array is full");
       }
   }
    
  public void removeemployee(employee emp)  
  {
      for(int i=0;i<current_size;i++)
      {
          if(employee[i]==emp)
          {
              employee[i]=null;
              current_size--;
                break;
          }
      }
  }
  
    public int linearSearch(int emp_no) {
        for (int i = 0; i < current_size; i++) {
            if (employee[i].getEmp_no() == emp_no) {
                return i;
            }
        }
        return -1;
    }
     public int binarySearch(int emp_no) {
        int left = 0;
        int right = current_size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (employee[mid].getEmp_no() == emp_no) {
                return mid;
            } else if (employee[mid].getEmp_no() < emp_no) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
     public void insertionSort() {
        for (int i = 1; i < current_size; i++) {
            employee key = employee[i];
            int j = i - 1;

            while (j >= 0 && employee[j].getEmp_no() > key.getEmp_no()) {
                employee[j + 1] = employee[j];
                j--;
            }

            employee[j + 1] = key;
        }
    }
     
}
