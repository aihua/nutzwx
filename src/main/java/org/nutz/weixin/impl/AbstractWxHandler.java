package org.nutz.weixin.impl;

import org.nutz.weixin.bean.WxInMsg;
import org.nutz.weixin.bean.WxOutMsg;
import org.nutz.weixin.spi.WxHandler;
import org.nutz.weixin.util.Wxs;

public abstract class AbstractWxHandler implements WxHandler {


	public WxOutMsg text(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg image(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg voice(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg video(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg location(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg link(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg eventSubscribe(WxInMsg msg) {
		return defaultMsg(msg);
	}
	
	public WxOutMsg eventUnsubscribe(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg eventScan(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg eventLocation(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg eventClick(WxInMsg msg) {
		return defaultMsg(msg);
	}

	public WxOutMsg eventView(WxInMsg msg) {
		return defaultMsg(msg);
	}
	
	public WxOutMsg eventTemplateJobFinish(WxInMsg msg) {
	    return defaultMsg(msg);
	}

	public WxOutMsg defaultMsg(WxInMsg msg) {
		return Wxs.respText(null, "haha -> " + msg.getCreateTime());
	}
	
	public WxOutMsg handle(WxInMsg in) {
		return Wxs.handle(in, this);
	}
}
