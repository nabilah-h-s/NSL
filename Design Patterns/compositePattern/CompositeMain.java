package compositePattern;

public class CompositeMain {

	public static void main(String[] args) {

		var folderCreational = new Folder();
		folderCreational.add(new File("CreationalDesignExampleCode.java"));
		folderCreational.add(new File("CreationalDesignExplanation.md"));
		folderCreational.add(new File("CreationalDesignPresentation.ppt"));

		var folderStractural = new Folder();
		folderStractural.add(new File("StructuralDesignExampleCode.java"));
		folderStractural.add(new File("StructuralDesignExplanation.md"));
		folderStractural.add(new File("StructuralDesignPresentation.ppt"));

		var folderOfFolder = new Folder();
		folderOfFolder.add(folderCreational);
		folderOfFolder.add(folderStractural);

		var groupOfFilesAndFolder = new Folder();
		groupOfFilesAndFolder.add(new File("README.md"));
		groupOfFilesAndFolder.add(folderOfFolder);

		groupOfFilesAndFolder.render();

	}

}
