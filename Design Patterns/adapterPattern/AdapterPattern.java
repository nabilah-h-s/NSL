package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class AdapterPattern {

	public static void main(String[] args) {

		var imageView = new ImageView(new Image());
		imageView.applyFilter(new VividFilter());
		
		var imageViewThirdPartyFilter = new ImageView(new Image());
		imageViewThirdPartyFilter.applyFilter(new CaramelAdapter(new CaramelFilter()));
	}

}
