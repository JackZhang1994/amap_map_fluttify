//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

package me.yohom.amap_map_fluttify;

import android.content.Context;
import android.view.View;
import android.util.Log;
import android.app.Activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getHEAP;
import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getEnableLog;

@SuppressWarnings("ALL")
class DownloadProgressViewFactory extends PlatformViewFactory {

    DownloadProgressViewFactory(BinaryMessenger messenger, Activity activity) {
        super(StandardMessageCodec.INSTANCE);

        this.messenger = messenger;
        this.activity = activity;

        new MethodChannel(messenger, "me.yohom/amap_map_fluttify/com_amap_api_maps_offlinemap_DownloadProgressView").setMethodCallHandler((methodCall, methodResult) -> {
                Map<String, Object> args = (Map<String, Object>) methodCall.arguments;
                AmapMapFluttifyPlugin.Handler handler = handlerMap.get(methodCall.method);
                if (handler != null) {
                    try {
                        handler.call(args, methodResult);
                    } catch (Exception e) {
                        e.printStackTrace();
                        methodResult.error(e.getMessage(), null, null);
                    }
                } else {
                    methodResult.notImplemented();
                }
            });
    }

    private BinaryMessenger messenger;
    private Activity activity;

    private final Map<String, AmapMapFluttifyPlugin.Handler> handlerMap = new HashMap<String, AmapMapFluttifyPlugin.Handler>() {{
        // method
        put("com.amap.api.maps.offlinemap.DownloadProgressView::setProgress", (args, methodResult) -> {
            // args
            // jsonable arg
            int var1 = (int) ((Map<String, Object>) args).get("var1");
        
            // ref
            int refId = (int) ((Map<String, Object>) args).get("refId");
            com.amap.api.maps.offlinemap.DownloadProgressView ref = (com.amap.api.maps.offlinemap.DownloadProgressView) getHEAP().get(refId);
        
            // print log
            if (getEnableLog()) {
                Log.d("fluttify-java", "fluttify-java: com.amap.api.maps.offlinemap.DownloadProgressView@" + refId + "::setProgress(" + var1 + ")");
            }
        
            // invoke native method
            try {
                ref.setProgress(var1);
            } catch (Throwable throwable) {
                throwable.printStackTrace();
                if (getEnableLog()) {
                    Log.d("Current HEAP: ", getHEAP().toString());
                }
                methodResult.error(throwable.getMessage(), null, null);
                return;
            }
        
            // convert result to jsonable result
            String jsonableResult = "success";
        
            methodResult.success(jsonableResult);
        });
    }};

    @Override
    public PlatformView create(Context __, int id, Object params) {
        Map<String, Object> args = (Map<String, Object>) params;
        

        com.amap.api.maps.offlinemap.DownloadProgressView view = new com.amap.api.maps.offlinemap.DownloadProgressView(activity);
        getHEAP().put(Integer.MAX_VALUE - id, view);
        return new PlatformView() {

            // add to HEAP
            @Override
            public View getView() {
                return view;
            }

            @Override
            public void dispose() {}
        };
    }
}
