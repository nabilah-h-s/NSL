package compositePatternwithinheritence;

public class CompositeMain {

	public static void main(String[] args) {

		var folderCreational = new Folder();
		folderCreational.add(new PowerPoint());
		folderCreational.add(new TextDocument());
		folderCreational.add(new WordFile());

		var folderStractural = new Folder();
		folderStractural.add(new PowerPoint());
		folderStractural.add(new TextDocument());
		folderStractural.add(new WordFile());

		var folderOfFolder = new Folder();
		folderOfFolder.add(folderCreational);
		folderOfFolder.add(folderStractural);

		var groupOfFilesAndFolder = new Folder();
		groupOfFilesAndFolder.add(new WordFile());
		groupOfFilesAndFolder.add(folderOfFolder);

		groupOfFilesAndFolder.render();

	}

}
