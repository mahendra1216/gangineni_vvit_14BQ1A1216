import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 *
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;

	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {

		// Add your implementation here
		//return null;
		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
        if(students == null)
            throw new IllegalArgumentException();
        else
            for(int i=0;i<students.length;i++)
        {
        this.students[i]=students[i];
        }
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		if(index<0 || index>students.length-1)
            throw new IllegalArgumentException();
        else
            return students[index];
		//return null;
	}

	@Override
	public void setStudent(Student student, int index) {
	    if(index<0 || index>students.length-1 || student==null)
            throw new IllegalArgumentException();
            else
                this.students[index]=students[index];
		// Add your implementation here
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		if(student==null)
            throw new IllegalArgumentException();
        else
        {
		Student[] temp=new Student[students.length+1];
		temp[0]=student;
		for(int i=1;i<temp.length;i++)
        {
            temp[i]=students[i];
        }
        students=temp;
        }
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		Student[] temp=new Student[students.length+1];
		temp[students.length]=student;
		students=temp;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		if(index<0 || index>students.length-1 || student==null)
            throw new IllegalArgumentException();
            else
        {
		Student[] temp=new Student[students.length+1];
		for(int i=0;i<temp.length;i++)
        {
            students[i]=students[i-1];
            if(i==index)
                temp[i]=student;
            else if(i<index)
            {
                temp[i]=students[i];
            }
            else
            {
                temp[i]=students[i-1];
            }
        }

        }

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		if(index<0 || index>students.length-1)
            throw new IllegalArgumentException();
            else
            {
            Student[] temp=new Student[students.length-1];
            int j=0;
                for(int i=0;i<students.length;i++)
                {
                    if(i!=index)
                    temp[j++]=students[i];
                }
                students=temp;
            }

	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		if(student==null)
        {
            throw new IllegalArgumentException();
        }
        else
        {
		int flag=0;
		for(int i=0;i<=students.length-1;i++)
        {
            if(students[i].equals(student))
            {
                remove(i);
                flag++;
                break;
            }
        }
        if(flag==0)
            throw new IllegalArgumentException("Student not exist");
	}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		if(index<0 || index>students.length-1)
            throw new IllegalArgumentException();
            else
            {
		Student[] temp=new Student[index+1];
		for(int i=0;i<=index;i++)
            temp[i]=students[i];
        students=temp;
            }
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		for(int i=0;i<=students.length-1;i++)
        {
            if(students[i].equals(student))
            {
                removeFromIndex(i);
                break;
            }
        }
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		if(index<0 || index>students.length-1)
            throw new IllegalArgumentException();
            else
            {

		Student[] temp=new Student[students.length-index];
		int i=0,j=0;
		for(j=index;j<students.length;j++)
        {
            temp[i++]=students[j];
        }
        students=temp;
	}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
		if( student==null)
            throw new IllegalArgumentException();
            else
            {
               for(int i=0;i<=students.length-1;i++)
                {
                    if(students[i].equals(student))
                    {
                    removeToIndex(i);
                    break;
                    }
                }
            }
	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student temp;
		int l=students.length,tmp;

		for(int i=0;i<l-1;i++)
        {
            for(int j=i+1;j<=l-i-1;j++)
            {
                tmp=students[i].compareTo(students[j]);
                if(tmp>0)
                {
                    temp=students[i];
                    students[i]=students[j];
                    students[j]=temp;
                }
            }
        }

	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
