package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bank.AccountBean;

public class MemberServiceImpl implements MemberService {
	Map<String, MemberBean> map;
	MemberBean session;

	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}

	@Override
	public String join(MemberBean member) {
		// 1.회원가입
		String result = "";
		if (map.containsKey(member.getId())) {
			result = "중복입니다.";
		} else {
			map.put(member.getId(), member);
			result = "가입에 성공하였습니다";
		}
		return result;
	}

	@Override
	public String login(MemberBean member) {
		// 2.로그인
		String result = "";

		if (map.containsKey(member.getId())) {
			if (findById(member.getId()).getPw().equals(member.getPw())) {
				result = "로그인성공";
				session = findById(member.getId());
			} else {
				result = "로그인실패";
			}
		} else {
			result = "ID가 없습니다";
		}
		return result;
	}

	@Override
	public MemberBean detail() {
		return session;
	}

	@Override
	public void updatePw(MemberBean member) {
	   session.setPw(member.getPw());
	   map.put(session.getId(), session);
	}

	@Override
	public String delete() {
	    map.remove(session.getId());
	    session = null;
		return "탈퇴되었습니다.";
	}

	@Override
	public List<MemberBean> list() {
		// TODO Auto-generated method stub
		List<MemberBean> entryList = new ArrayList<MemberBean>();
		for (Map.Entry<String, MemberBean> entry: map.entrySet()){
			entryList.add((MemberBean) entry.getValue());
		}
		return entryList;
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> countName = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				countName.add(map.get(key));
			}
		}
		return countName;
	}

	@Override
	public int countByGender(String gender) {
		int count = 0;
		for (String key : map.keySet()) {
			if (gender.equals(map.get(key).getGender())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int count() {
		// TODO Auto-generated method stub
		return map.size();
	}

}