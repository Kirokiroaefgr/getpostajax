package action;

import java.util.ArrayList;
import java.util.List;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import dao.itemDao;
import dto.ServerTimeDto;
import dto.itemDTO;

public class ServerTimeAction extends ActionSupport implements ModelDriven<ServerTimeDto> {
	private ServerTimeDto model;
	private itemDTO itemA;
	private List<itemDTO> itemB = new ArrayList<>();
	private List<String> itemC=new ArrayList<>();

	@Override
	public String execute() throws Exception {
		itemC.add("afewafawe");
		itemC.add("fawああああewgrhtytjrg");
		itemDao aaa= new itemDao();
		itemA=aaa.select01(1);
		itemB=aaa.select();
		model = new ServerTimeDto();
		model.setTime(System.currentTimeMillis());
		return "success";
	}

	public String aaab(){
		itemDao aaa= new itemDao();
		itemB=aaa.select();
		System.out.println(itemB.size());
		return "aaab";
	}

	public ServerTimeDto getModel() {
		return model;
	}

	public void setModel(ServerTimeDto model) {
		this.model = model;
	}

	public itemDTO getItemA() {
		return itemA;
	}

	public void setItemA(itemDTO itemA) {
		this.itemA = itemA;
	}

	public List<itemDTO> getItemB() {
		return itemB;
	}

	public void setItemB(List<itemDTO> itemB) {
		this.itemB = itemB;
	}

	public List<String> getItemC() {
		return itemC;
	}

	public void setItemC(List<String> itemC) {
		this.itemC = itemC;
	}

}