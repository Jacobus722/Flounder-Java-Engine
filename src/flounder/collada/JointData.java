package flounder.collada;

import flounder.maths.matrices.*;

import java.util.*;

public class JointData {
	public final int index;
	public final String nameId;
	public final Matrix4f bindLocalTransform;

	public final List<JointData> children;

	protected JointData(int index, String nameId, Matrix4f bindLocalTransform) {
		this.index = index;
		this.nameId = nameId;
		this.bindLocalTransform = bindLocalTransform;

		this.children = new ArrayList<>();
	}

	public void addChild(JointData child) {
		children.add(child);
	}
}
