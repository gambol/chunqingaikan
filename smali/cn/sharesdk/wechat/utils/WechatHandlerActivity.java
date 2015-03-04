package cn.sharesdk.wechat.utils; class WechatHandlerActivity { void a() { int a;
a=0;// .class public Lcn/sharesdk/wechat/utils/WechatHandlerActivity;
a=0;// .super Landroid/app/Activity;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method public constructor <init>()V
a=0;//     .locals 0
a=0;// 
a=0;//     invoke-direct {p0}, Landroid/app/Activity;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/wechat/utils/WechatHandlerActivity;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method protected onCreate(Landroid/os/Bundle;)V
a=0;//     .locals 1
a=0;// 
a=0;//     const v0, 0x103000f
a=0;// 
a=0;//     #v0=(Integer);
a=0;//     invoke-virtual {p0, v0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->setTheme(I)V
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WechatHandlerActivity;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onGetMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// .method protected onNewIntent(Landroid/content/Intent;)V
a=0;//     .locals 1
a=0;// 
a=0;//     invoke-super {p0, p1}, Landroid/app/Activity;->onNewIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     invoke-virtual {p0, p1}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->setIntent(Landroid/content/Intent;)V
a=0;// 
a=0;//     :try_start_0
a=0;//     invoke-static {}, Lcn/sharesdk/wechat/utils/WechatHelper;->a()Lcn/sharesdk/wechat/utils/WechatHelper;
a=0;// 
a=0;//     move-result-object v0
a=0;// 
a=0;//     #v0=(Reference,Lcn/sharesdk/wechat/utils/WechatHelper;);
a=0;//     invoke-virtual {v0, p0}, Lcn/sharesdk/wechat/utils/WechatHelper;->a(Lcn/sharesdk/wechat/utils/WechatHandlerActivity;)Z
a=0;//     :try_end_0
a=0;//     .catch Ljava/lang/Throwable; {:try_start_0 .. :try_end_0} :catch_0
a=0;// 
a=0;//     :goto_0
a=0;//     invoke-virtual {p0}, Lcn/sharesdk/wechat/utils/WechatHandlerActivity;->finish()V
a=0;// 
a=0;//     return-void
a=0;// 
a=0;//     :catch_0
a=0;//     #v0=(Conflicted);
a=0;//     move-exception v0
a=0;// 
a=0;//     #v0=(Reference,Ljava/lang/Throwable;);
a=0;//     invoke-static {v0}, Lcn/sharesdk/framework/utils/e;->b(Ljava/lang/Throwable;)I
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
a=0;// 
a=0;// .method public onShowMessageFromWXReq(Lcn/sharesdk/wechat/utils/WXMediaMessage;)V
a=0;//     .locals 0
a=0;// 
a=0;//     return-void
a=0;// .end method
}}
