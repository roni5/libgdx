/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.10
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet;

import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class btCPUVertexBufferDescriptor extends btVertexBufferDescriptor {
	private long swigCPtr;
	
	protected btCPUVertexBufferDescriptor(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, gdxBulletJNI.btCPUVertexBufferDescriptor_SWIGUpcast(cPtr), cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	protected btCPUVertexBufferDescriptor(long cPtr, boolean cMemoryOwn) {
		this("btCPUVertexBufferDescriptor", cPtr, cMemoryOwn);
		construct();
	}
	
	public static long getCPtr(btCPUVertexBufferDescriptor obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				gdxBulletJNI.delete_btCPUVertexBufferDescriptor(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  static private long SwigConstructbtCPUVertexBufferDescriptor(java.nio.FloatBuffer basePointer, int vertexOffset, int vertexStride) {
    assert basePointer.isDirect() : "Buffer must be allocated direct.";
    return gdxBulletJNI.new_btCPUVertexBufferDescriptor__SWIG_0(basePointer, vertexOffset, vertexStride);
  }

  public btCPUVertexBufferDescriptor(java.nio.FloatBuffer basePointer, int vertexOffset, int vertexStride) {
    this(btCPUVertexBufferDescriptor.SwigConstructbtCPUVertexBufferDescriptor(basePointer, vertexOffset, vertexStride), true);
  }

  static private long SwigConstructbtCPUVertexBufferDescriptor(java.nio.FloatBuffer basePointer, int vertexOffset, int vertexStride, int normalOffset, int normalStride) {
    assert basePointer.isDirect() : "Buffer must be allocated direct.";
    return gdxBulletJNI.new_btCPUVertexBufferDescriptor__SWIG_1(basePointer, vertexOffset, vertexStride, normalOffset, normalStride);
  }

  public btCPUVertexBufferDescriptor(java.nio.FloatBuffer basePointer, int vertexOffset, int vertexStride, int normalOffset, int normalStride) {
    this(btCPUVertexBufferDescriptor.SwigConstructbtCPUVertexBufferDescriptor(basePointer, vertexOffset, vertexStride, normalOffset, normalStride), true);
  }

  public java.nio.FloatBuffer getBasePointer() {
    return gdxBulletJNI.btCPUVertexBufferDescriptor_getBasePointer(swigCPtr, this);
}

}
