package Services;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import models.studentmodel;

public class studentservice {
	private Connection conn;
	
	public studentservice(Connection conn) {
		super();
		this.conn = conn;
	}

	public boolean addstudent(studentmodel st) {
		boolean f = false;
		try {
			String sql = "insert into student (Pinnum,name,email,branch) value(?,?,?,?)";
			PreparedStatement pmst = conn.prepareStatement(sql);
			pmst.setString(1, st.getPinnum());
			pmst.setString(2, st.getName());
			pmst.setString(3, st.getEmail());
			pmst.setString(4, st.getBranch());
			int i = pmst.executeUpdate();
			if(i>0) {
				f = true;
			}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}

	public List<studentmodel> getallstu(){
		List<studentmodel> std = new ArrayList<studentmodel>();
		studentmodel s = null;
		try {
			String sql = "select * from student";
			PreparedStatement pmst = conn.prepareStatement(sql);
			ResultSet rs = pmst.executeQuery();
			while (rs.next()) {
				s = new studentmodel();
				rs.getInt(1);
				s.setPinnum(rs.getString(2));
				s.setName(rs.getString(3));
				s.setEmail(rs.getString(4));
				s.setBranch(rs.getString(5));
				std.add(s);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return std;
	}

}
