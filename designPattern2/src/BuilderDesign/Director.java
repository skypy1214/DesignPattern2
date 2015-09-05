package BuilderDesign;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		this.builder = builder;
	}

	public void construct() {
		builder.makeTitle("Greetin");
		builder.makeString("아침과 낮에");
		builder.makeItems(new String[] { 
				"좋은 아침입니다.",
				"안녕하세요.", 
		});
		builder.close();
	}
}
