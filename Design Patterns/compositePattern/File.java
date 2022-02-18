package compositePattern;

public class File implements Component {

	private String fileType;

	public File(String fileType) {
		super();
		this.fileType = fileType;
	}

	@Override
	public void render() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "rendering " + fileType;
	}

}
