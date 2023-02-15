package com.debduttapanda.openglestry

import android.app.Activity
import android.opengl.GLSurfaceView
import android.os.Bundle


class MainActivity : Activity() {
    private var glSurfaceView: GLSurfaceView? = null
    private var rendererSet = false
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        glSurfaceView = GLSurfaceView(this)
        glSurfaceView?.setEGLContextClientVersion(2)
        glSurfaceView?.setRenderer(AirHockeyRenderer(this))
        rendererSet = true
        setContentView(glSurfaceView);
    }
}