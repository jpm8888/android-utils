package jpm.white.fang;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

public abstract class CustomRenderer implements GLSurfaceView.Renderer{

	public interface GLRender{
		
	}
	
	
	public CustomRenderer(Context context) {
		getContext(context);
	}
	
	@Override
	public void onDrawFrame(GL10 gl) {
		GLES20.glClear(GLES20.GL_COLOR_BUFFER_BIT);
		GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1);
		draw();
	}

	@Override
	public void onSurfaceChanged(GL10 gl, int width, int height) {
		surfaceChanged(width, height);
	}

	@Override
	public void onSurfaceCreated(GL10 gl, EGLConfig config) {
		surfaceCreated(config);
	}
	
	
	public abstract void surfaceCreated(EGLConfig config);
	public abstract void surfaceChanged(int width, int height);
	public abstract void draw();
	public abstract Context getContext(Context context);
	
	
	
}
