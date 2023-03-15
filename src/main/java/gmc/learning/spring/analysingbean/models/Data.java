package gmc.learning.spring.analysingbean.models;

import java.io.Serializable;

@lombok.Data
public class Data implements Serializable, Comparable<Data> {
	
	private static final long serialVersionUID = -1129177937367603105L;

	private Integer order;
	
	private String data;
	
	@Override
	public int compareTo(Data o) {
		if(this.order == o.getOrder())
			return 0;
		else if(this.order > o.getOrder())
			return 1;
		else
			return -1;
	}

}
