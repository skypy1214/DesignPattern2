package BuilderDesign;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greetin");
		builder.makeString("��ħ�� ����");
		builder.makeItems(new String[] { 
				"���� ��ħ�Դϴ�.",
				"�ȳ��ϼ���.", 
		});
		builder.close();
	}
}
