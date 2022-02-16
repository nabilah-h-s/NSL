package adapterPattern;

import thirdPartyFilter.CaramelFilter;

public class CaramelAdapter implements Filter {

	private CaramelFilter caramel;
	
	public CaramelAdapter(CaramelFilter caramel) {
		this.caramel = caramel;
	}

	@Override
	public void apply(Image image) {
		caramel.init();
		caramel.render(image);
	}

}
