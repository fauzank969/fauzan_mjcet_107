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

		return students;
	}

	@Override
	public void setStudents(Student[] students) {
		// Add your implementation here
		this.students = students;
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		return students[index];
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		this.students[0] = student;
	}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		int length = this.students.length;
		this.students[length-1] = student;
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
		this.students[index]=student;

	}

	@Override
	public void remove(int index) {
		// Add your implementation here
		this.students[index] = null;
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		for (int i = 0; i < this.students.length; i++) {
			// Delete Function
			if (this.students[i] == student) {
				for (int j = i + 1; i < this.students.length - 1; j++) {
					this.students[i] = this.students[j];
					i++;
				}
			}
		}
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		for (int i = 0; i < this.students.length; i++) {
			// Delete Function
			if ( i == index) {
				for (int j = i + 1; i < this.students.length - 1; j++) {
					this.students[j] = null;
					i++;
				}
			}
		}
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
		for (int i = 0; i < this.students.length; i++) {
			// Delete Function
			if (this.students[i] == student) {
				for (int j = i + 1; i < this.students.length - 1; j++) {
					this.students[j] = null;
					i++;
				}
			}
		}
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
		for (int i = 0; i < this.students.length; i++) {
			if ( i == index) {
			 for (int j=0;j < this.students.length ;j++ ) {
			 	this.students[j]=null;
			 }
		}
	}
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here

	}

	@Override
	public void bubbleSort() {
		// Add your implementation here
		Student students[];
		int n = this.students.length;
			 Student temp = null;
				for(int i=0; i < n; i++){
								for(int j=1; j < (n-i); j++){
												 if(this.students[j-1].compareTo(this.students[j]) < 0 ){
																//swap elements
																temp = this.students[j-1];
																this.students[j-1] = this.students[j];
																this.students[j] = temp;
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
