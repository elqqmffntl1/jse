package map;

import java.util.List;

import map.MemberBean;

public interface MemberService {
	
	public String join(MemberBean member);
	public String login(MemberBean member);
	public MemberBean detail();
	public void updatePw(MemberBean member);
	public String delete();
	public List<MemberBean> list();
	public MemberBean findById(String id);
	public List<MemberBean> findByName(String name);
	public int countByGender(String gender);
	public int count();
}
