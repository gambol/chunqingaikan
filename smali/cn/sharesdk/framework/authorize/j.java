package cn.sharesdk.framework.authorize; class j { void a() { int a;
a=0;// .class Lcn/sharesdk/framework/authorize/j;
a=0;// .super Ljava/lang/Thread;
a=0;// 
a=0;// 
a=0;// # instance fields
a=0;// .field final synthetic a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;// 
a=0;// # direct methods
a=0;// .method constructor <init>(Lcn/sharesdk/framework/authorize/g;)V
a=0;//     .locals 0
a=0;// 
a=0;//     iput-object p1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     invoke-direct {p0}, Ljava/lang/Thread;-><init>()V
a=0;// 
a=0;//     #p0=(Reference,Lcn/sharesdk/framework/authorize/j;);
a=0;//     return-void
a=0;// .end method
a=0;// 
a=0;// 
a=0;// # virtual methods
a=0;// .method public run()V
a=0;//     .locals 3
a=0;// 
a=0;//     new-instance v0, Landroid/os/Message;
a=0;// 
a=0;//     #v0=(UninitRef,Landroid/os/Message;);
a=0;//     invoke-direct {v0}, Landroid/os/Message;-><init>()V
a=0;// 
a=0;//     #v0=(Reference,Landroid/os/Message;);
a=0;//     const/4 v1, 0x2
a=0;// 
a=0;//     #v1=(PosByte);
a=0;//     iput v1, v0, Landroid/os/Message;->what:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/authorize/g;->a(Lcn/sharesdk/framework/authorize/g;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/utils/b;->a(Landroid/content/Context;)Lcn/sharesdk/framework/utils/b;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     const-string v2, "none"
a=0;// 
a=0;//     #v2=(Reference,Ljava/lang/String;);
a=0;//     invoke-virtual {v1}, Lcn/sharesdk/framework/utils/b;->n()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     #v1=(Boolean);
a=0;//     if-eqz v1, :cond_0
a=0;// 
a=0;//     const/4 v1, 0x1
a=0;// 
a=0;//     #v1=(One);
a=0;//     iput v1, v0, Landroid/os/Message;->arg1:I
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z
a=0;// 
a=0;//     :goto_0
a=0;//     return-void
a=0;// 
a=0;//     :cond_0
a=0;//     #v1=(Boolean);
a=0;//     invoke-static {}, Lcn/sharesdk/framework/ShareSDK;->isRemoveCookieOnAuthorize()Z
a=0;// 
a=0;//     move-result v1
a=0;// 
a=0;//     if-eqz v1, :cond_1
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     invoke-static {v1}, Lcn/sharesdk/framework/authorize/g;->b(Lcn/sharesdk/framework/authorize/g;)Landroid/app/Activity;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-static {v1}, Landroid/webkit/CookieSyncManager;->createInstance(Landroid/content/Context;)Landroid/webkit/CookieSyncManager;
a=0;// 
a=0;//     invoke-static {}, Landroid/webkit/CookieManager;->getInstance()Landroid/webkit/CookieManager;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     invoke-virtual {v1}, Landroid/webkit/CookieManager;->removeAllCookie()V
a=0;// 
a=0;//     :cond_1
a=0;//     #v1=(Conflicted);
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     #v1=(Reference,Lcn/sharesdk/framework/authorize/g;);
a=0;//     iget-object v1, v1, Lcn/sharesdk/framework/authorize/g;->a:Lcn/sharesdk/framework/authorize/AuthorizeHelper;
a=0;// 
a=0;//     invoke-interface {v1}, Lcn/sharesdk/framework/authorize/AuthorizeHelper;->getAuthorizeUrl()Ljava/lang/String;
a=0;// 
a=0;//     move-result-object v1
a=0;// 
a=0;//     iput-object v1, v0, Landroid/os/Message;->obj:Ljava/lang/Object;
a=0;// 
a=0;//     iget-object v1, p0, Lcn/sharesdk/framework/authorize/j;->a:Lcn/sharesdk/framework/authorize/g;
a=0;// 
a=0;//     invoke-static {v0, v1}, Lcn/sharesdk/framework/utils/UIHandler;->sendMessage(Landroid/os/Message;Landroid/os/Handler$Callback;)Z
a=0;// 
a=0;//     goto :goto_0
a=0;// .end method
}}
