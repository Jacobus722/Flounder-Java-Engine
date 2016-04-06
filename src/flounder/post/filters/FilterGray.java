package flounder.post.filters;

import flounder.post.*;
import flounder.resources.*;

public class FilterGray extends PostFilter {
	public FilterGray() {
		super("filterGray", new MyFile(PostFilter.POST_LOC, "grayFragment.glsl"));
		super.storeUniforms();
	}

	@Override
	public void storeValues() {
	}
}