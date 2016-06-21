package school;

public class StudentServiceImpl implements StudentService {
	StudentBean stu;

	@Override
	public void registStudent(String id, String pw, String name, String ssn) {
		// TODO 1.등록
    stu = new StudentBean(id, pw, name, ssn);
	}

	@Override
	public String showStudent() {
		// TODO 2.보기
		return stu.toString();
	}

	@Override
	public void updateStudent(String pw) {
		// TODO 3.수정
        stu.setPw(pw);
	}

	@Override
	public void deleteStudent() {
		// TODO 4.삭제
    stu = null;
	}

}
